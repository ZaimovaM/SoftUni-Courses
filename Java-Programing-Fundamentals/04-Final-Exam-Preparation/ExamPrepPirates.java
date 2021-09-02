import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class ExamPrepPirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, CityData> goalCities = new TreeMap<>();
        while (!input.equals("Sail")) {
            String[] inputParts = input.split("\\|\\|");
            String city = inputParts[0];
            int population = Integer.parseInt(inputParts[1]);
            int gold = Integer.parseInt(inputParts[2]);

            CityData data = new CityData(population, gold);
            if (!goalCities.containsKey(city)) {
                goalCities.put(city, data);
            } else {
                int currentPopulation = goalCities.get(city).getPopulation();
                int currentGold = goalCities.get(city).getGold();
                CityData newData = new CityData(currentPopulation + population, currentGold + gold);
                goalCities.put(city, newData);
            }


            input = scanner.nextLine();
        }

        String events = scanner.nextLine();

        while (!events.equals("End")) {
            String[] eventsParts = events.split("=>");
            String typeEvent = eventsParts[0];
            String town = eventsParts[1];
            if (typeEvent.equals("Plunder")) {
                int people = Integer.parseInt(eventsParts[2]);
                int gold = Integer.parseInt(eventsParts[3]);

                int peopleAfterPlunder = (goalCities.get(town).getPopulation()) - people;
                int goldAfterPlunder = (goalCities.get(town).getGold()) - gold;

                System.out.printf("%s plundered! %s gold stolen, %s citizens killed.%n", town, gold, people);
                if (peopleAfterPlunder <= 0 || goldAfterPlunder <= 0) {
                    goalCities.remove(town);
                    System.out.printf("%s has been wiped off the map!%n", town);
                } else {
                    CityData newData = new CityData(peopleAfterPlunder, goldAfterPlunder);
                    goalCities.put(town, newData);
                }
            } else if (typeEvent.equals("Prosper")) {
                int gold = Integer.parseInt(eventsParts[2]);
                if (gold < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                    events = scanner.nextLine();
                    continue;
                } else {
                    int goldAfterProsper = (goalCities.get(town).getGold()) + gold;
                    CityData newData = new CityData(goalCities.get(town).getPopulation(), goldAfterProsper);
                    goalCities.put(town, newData);

                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, goldAfterProsper);
                }
            }


            events = scanner.nextLine();
        }
        int settlements = goalCities.size();
        if (settlements == 0){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", settlements);
            goalCities.entrySet().stream().sorted((c1, c2) -> Integer.compare(c2.getValue().getGold(), c1.getValue().getGold()))
                    .forEach(city -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                            city.getKey(), city.getValue().getPopulation(), city.getValue().getGold()));
        }
    }
}


class CityData {
    int population;
    int gold;

    public CityData(int population, int gold) {
        this.population = population;
        this.gold = gold;
    }

    public int getGold() {
        return gold;
    }

    public int getPopulation() {
        return population;
    }
}
