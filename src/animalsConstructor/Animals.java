package animalsConstructor;

public class Animals {
    private String species;

    public Animals(String species) {
        this.species = species;
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void printMessages() {
        System.out.println("Especie del animal: " + species + "\n");
    }
}
