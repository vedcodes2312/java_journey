class Parent {
    public void greet() {
        System.out.println("hello world");
    }
}

class Child extends Parent {}    // single

class GrandChild extends Child {}    //multi-level

public class InheritanceDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.greet();

        GrandChild obj1 = new GrandChild();
        obj1.greet();
          
    }
}