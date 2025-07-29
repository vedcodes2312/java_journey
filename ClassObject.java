import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private int rollNumber;

    // public Student(String name, int age, int rollNumber) {
    //     this.name = name;
    //     this.age = age;
    //     this.rollNumber = rollNumber;
    // }

     Student() {
        name = "";
        age = 0;
        rollNumber = 0;
    }

     public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter roll number: ");
        rollNumber = sc.nextInt();
    }

    // Method to display data
    public void displayData() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        // Create object of Student class
        Student s1 = new Student();

        // Call methods
        s1.getData();
        s1.displayData();
    }
}