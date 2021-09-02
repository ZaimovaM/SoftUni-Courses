import java.util.*;

public class FinalExam03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, AnimalData> animals = new TreeMap<>();
        Map<String, List<String>> areas = new TreeMap<>();
        int countAnimal = 1;


        while (!command.equals("EndDay")) {
            String[] commandParts = command.split(":");
            String typeCommand = commandParts[0];

            if (typeCommand.equals("Add")) {
                String[] animalData = commandParts[1].split("-");
                String animal = animalData[0];
                int food = Integer.parseInt(animalData[1]);
                String area = animalData[2];
                AnimalData newAnimal = new AnimalData(food, area);
                if (!animals.containsKey(animal)) {
                    animals.put(animal, newAnimal);
                } else {
                    int currentFood = animals.get(animal).getFood();
                    animals.get(animal).setFood(currentFood + food);

                }

                if (!areas.containsKey(area)) {
                    areas.put(area, new ArrayList<>());
                }
                List<String> currentArea = areas.get(area);
                if(!currentArea.contains(animal)) {
                    areas.get(area).add(animal);
                }



            } else if (typeCommand.equals("Feed")) {
                String[] animalData = commandParts[1].split("-");
                String animal = animalData[0];
                int food = Integer.parseInt(animalData[1]);
                if (animals.containsKey(animal)) {
                    int currentFood = animals.get(animal).getFood();
                    currentFood -= food;
                    animals.get(animal).setFood(currentFood);
                    if (currentFood <= 0) {

                       String areaToReduce =  animals.get(animal).getArea();
                        animals.remove(animal);
                        System.out.printf("%s was successfully fed%n", animal);
                        List<String> areaAnimals =  areas.get(areaToReduce);
                        areaAnimals.remove(animal);
                        areas.replace(areaToReduce, areaAnimals);
                    }
                }
            }
            command = scanner.nextLine();
        }

        System.out.println("Animals:");
        animals.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().getFood(), e1.getValue().getFood()))
                .forEach(animal -> System.out.printf("%s -> %dg%n", animal.getKey(), animal.getValue().getFood()));
        System.out.printf("Areas with hungry animals:%n");
        areas.entrySet().stream()
                .sorted((e1,e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .filter(areaAnimal-> areaAnimal.getValue().size()>0)
                .forEach(area -> System.out.printf("%s: %d%n",area.getKey(),area.getValue().size()));
    }


}





class AnimalData {
    int food;
    String area;

    public AnimalData(int food, String area) {
        this.food = food;
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}