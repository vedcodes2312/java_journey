class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

public class ObjectCastingExample {
    public static void main(String[] args) {
        // Upcasting: Dog object is referenced by an Animal type
        Animal myAnimal = new Dog();
        myAnimal.sound(); // Outputs: Dog barks

        // Downcasting: Animal reference is cast back to Dog
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal;
            myDog.fetch(); // Outputs: Dog fetches the ball
        } else {
            System.out.println("The object is not of type Dog");
        }
    }
}