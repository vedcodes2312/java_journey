import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n, factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");

        n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial is"+factorial);
        sc.close();
    }
    
}