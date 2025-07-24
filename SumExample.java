import java.util.Scanner;

public class SumExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();  // Read first number

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();  // Read second number

        int sum = num1 + num2;  // Calculate sum

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();  // Close Scanner
    }
}
