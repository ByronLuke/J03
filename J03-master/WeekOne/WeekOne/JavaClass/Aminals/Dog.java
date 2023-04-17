package WeekOne.JavaClass.Aminals;

public class Dog extends Animal {

    @Override
    public void introduceSelf() {
        System.out.println("I am a dog named " + getName() + " I go " + getSound() + "!");
    }

    public void trackAnimal(Animal animal) {
        System.out.println("I found the animal" + animal.getName());
    }
}
