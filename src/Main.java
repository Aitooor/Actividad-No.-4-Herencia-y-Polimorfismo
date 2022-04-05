import animalTypes.Dog;
import animalTypes.Fish;
import animalTypes.Snake;
import animalsConstructor.Animals;

public class Main {

    public static void main(String[] args) {

        Animals myAnimals[] = new Animals[4];

        myAnimals[0] = new Animals("Sin definir");
        myAnimals[1] = new Dog("Perro", "Doggo");
        myAnimals[2] = new Fish("Fish", "Prawns");
        myAnimals[3] = new Snake("Snake", true);

        for(Animals animals: myAnimals) {
            animals.printMessages();
        }
    }
}
