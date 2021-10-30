package rabbits;

public class Rabbit {
    private final String name;
    private final String species;
    private boolean available = true;

    public Rabbit(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }




    @Override
    public String toString() {
        return String.format("Rabbit (%s): %s", this.species, this.name);
    }
}
