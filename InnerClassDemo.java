class Outer {
    String outermsg = "this is outer class";

    class Inner {
        String innermsg = "this is inner class";

        void display() {
            System.out.println(outermsg);
            System.out.println(innermsg);
        }
    }
    void display() {
        Inner inner = new Inner();
        inner.display();
        System.out.println("This is outer class display method");
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();

        Outer.Inner inner = outer.new Inner();
        inner.display();

        System.out.println("This is main method of InnerClassDemo");

        // Creating an instance of the inner class directly
        Outer.Inner directInner = new Outer().new Inner();
        directInner.display();
        System.out.println("Directly created inner class instance display method");

        // Using the inner class to access outer class method
        outer.new Inner().display();
        System.out.println("Using inner class to access outer class method display");
    }

}