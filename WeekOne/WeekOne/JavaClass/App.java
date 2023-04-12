package WeekOne.JavaClass;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Rover");
        dog.setSound("Bark");

        Animal cat = new Animal();
        cat.setName("Sky");
        cat.setSound("Meow");

        Animal parrot = new Animal();
        parrot.setName("Harry");
        parrot.setSound("Chirp!");

        List<Animal> animals = new ArrayList<>();

        animals.add(dog);
        animals.add(cat);
        animals.add(parrot);

        for (Animal a : animals) {
            a.introduceSelf();
        }
    }

}
