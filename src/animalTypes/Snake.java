package animalTypes;

import animalsConstructor.Animals;

public class Snake extends Animals {

    private Boolean poisonous;

    public Snake(String species, Boolean poisonous) {
        super(species);
        this.poisonous = poisonous;
    }

    public Boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(Boolean poisonous) {
        this.poisonous = poisonous;
    }

    public void printMessages() {
        System.out.println("Especie de la serpiente: " + getSpecies());
        System.out.println("Venenosa: " + poisonous);
    }
}
