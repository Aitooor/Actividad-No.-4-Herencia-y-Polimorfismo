package animalTypes;

import animalsConstructor.Animals;

public class Dog extends Animals {
    private String raze;

    public String getRaze() {
        return raze;
    }

    public void setRaze(String raze) {
        this.raze = raze;
    }

    public void printMessages() {
        System.out.println("Especie del perro: " + getSpecies());
        System.out.println("Raza del perro: " + raze);
    }
}
