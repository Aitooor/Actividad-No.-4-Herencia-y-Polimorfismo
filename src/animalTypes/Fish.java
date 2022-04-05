package animalTypes;

import animalsConstructor.Animals;

public class Fish extends Animals {
    private String feeding;

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    public void printMessages() {
        System.out.println("Especie del pez: " + getSpecies());
        System.out.println("Alimentacion del pez: " + feeding);
    }
}
