// function overloading : different data types of arguments


import java.util.Scanner;

public class FunctionOverloading2 {

    void print(String text) {
        System.out.println("String: " + text);
    }

    void print(int number) {
        System.out.println("Integer: " + number);
    }

    void print(double number) {
        System.out.println("Double: " + number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       FunctionOverloading2 p = new FunctionOverloading2();

        // String input
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        p.print(s);

        // Integer input
        System.out.print("Enter an integer: ");
        int i = sc.nextInt();
        p.print(i);

        // Double input
        System.out.print("Enter a double: ");
        double d = sc.nextDouble();
        p.print(d);

        sc.close();
    }
}


