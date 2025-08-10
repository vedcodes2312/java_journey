interface A {
    void show1();
}
                               // multiple 
interface B  {
    void show2();
}

class Demo implements A,B {
    public void show() {
        System.out.println("hello world");
    }

    public void show1() {
        System.out.println("gsfc university");
    }

    public void show2() {
        System.out.println("cse");
    }
}

public class InheritanceDemo2 {
    public static void main(String[] args) {
        Demo obj = new Demo();

        obj.show();
        obj.show1();
        obj.show2();
    }
}