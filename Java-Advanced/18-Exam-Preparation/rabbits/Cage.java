package rabbits;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private final String name;
    private final int capacity;
    private List<Rabbit> data;


    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Rabbit rabbit) {
        if (this.capacity > this.data.size()) {
            data.add(rabbit);
        }
    }

    public boolean removeRabbit(String name) {
        return data.removeIf(r -> r.getName().equals(name));
    }

    public int count() {
        return data.size();
    }

    public void removeSpecies(String species) {
        data.removeIf(r -> r.getSpecies().equals(species));
    }

    public Rabbit sellRabbit(String name){
        for (Rabbit rabbit: data) {
            if(rabbit.getName().equals(name)){
                rabbit.setAvailable(false);
              return rabbit;
            }
        }
        return null;
    }

    public List<Rabbit> sellRabbitBySpecies(String species){
        List<Rabbit> allRabbits = new ArrayList<>();
        for (Rabbit rabbit: data) {
            if(rabbit.getSpecies().equals(species)){
                rabbit.setAvailable(false);
                allRabbits.add(rabbit);
            }
        }
        return allRabbits;
    }

    public String report() {
        StringBuilder report = new StringBuilder();
        report.append("Rabbits available at ")
                .append(name)
                .append(":")
                .append(System.lineSeparator());
        data.stream().filter(Rabbit::isAvailable).forEach(rabbit -> report.append(rabbit).append(System.lineSeparator()));


        return report.toString();
    }
}
