class Student {
    // Data members
    private String studentName;
    private int studentAge;
    private int studentRoll;

    // Method to set data using arguments (no 'this' needed)
    public void getData(String name, int age, int roll) {
        studentName = name;
        studentAge = age;
        studentRoll = roll;
    }

    // Method to display data
    public void displayData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Roll Number: " + studentRoll);
    }
}

public class ClassObject2 {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Set values via getData method
        s1.getData("Ved", 20, 101);

        // Display data
        s1.displayData();
    }
}
