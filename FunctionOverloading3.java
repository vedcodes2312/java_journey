public class FunctionOverloading3 {

    // overloaded methods with different parameter orders
    void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void display(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }

    public static void main(String[] args) {
        FunctionOverloading3 s = new FunctionOverloading3();

        s.display("Aman", 25);     
        s.display(30, "Bhavya");   
    }
}
