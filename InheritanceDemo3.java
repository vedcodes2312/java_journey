interface Animal {
    void sound();
}                 //hierarchical

class Dog implements Animal {
    public void sound() {
        System.out.println("dog barks");
    }
}

class Sparrow implements Animal {
    public void sound() {
        System.out.println("sparrow chirps");
    }
}

public class InheritanceDemo3 {
    public static void main(String[] args) {
        Sparrow obj1 = new Sparrow();

        Dog obj2 = new Dog();

        obj1.sound();
        obj2.sound();
    }
}