class Student {
    // Data members
    private String name;
    private int age;
    private int rollNumber;

    // Method to set data using arguments
    public void getData(String name, int age, int rollNumber) {
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

public class ClassObject3 {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Setting data via getData method
        s1.getData("Ved", 20, 101);

        // Displaying data
        s1.displayData();
    }
}
