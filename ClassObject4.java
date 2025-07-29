class Student {
    // Data members
    private String name;
    private int age;
    private int rollNumber;

    // Constructor with arguments using 'this' keyword
    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Method to display data
    public void displayData() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Roll Number: " + this.rollNumber);
    }
}

public class ClassObject4 {
    public static void main(String[] args) {
        // Creating object and passing values via constructor
        Student s1 = new Student("Ved", 20, 101);

        // Displaying data
        s1.displayData();
    }
}
