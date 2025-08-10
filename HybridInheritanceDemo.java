// Interface 1
interface Sports {
    void showSports();
}

// Interface 2
interface Arts {
    void showArts();
}

// Parent Class
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

// Child Class (Hybrid Inheritance: Extends class + Implements interfaces)
class CollegeStudent extends Student implements Sports, Arts {

    CollegeStudent(String name, int rollNo) {
        super(name, rollNo);
    }

    // Implement Sports interface
    public void showSports() {
        System.out.println(name + " participates in Football.");
    }

    // Implement Arts interface
    public void showArts() {
        System.out.println(name + " participates in Painting.");
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent("Ved", 101);

        cs.showDetails();   // From Student class
        cs.showSports();    // From Sports interface
        cs.showArts();      // From Arts interface
    }
}
