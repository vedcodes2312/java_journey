import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randomnum = new Random();
        int min=1;
        int max=100;
        int numguess =  randomnum.nextInt(max-min+1) + min; 
        int attempts = 0;
        boolean correctguess = false;
       // int number = rand.nextInt(100) + 1; // Random number between 1 and 100
        // int guess = 0;
        // int attempts = 0;
        System.out.println("welcome to the number guessing game");
        System.out.println("System is thinking of a number between "+min+"to"+max+". try to guess it");
      while (!correctguess) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == numguess) {
                correctguess = true;
                System.out.println(" Congratulations! You guessed the correct number " + numguess + " in " + attempts + " attempts.");
            } else if (guess < numguess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        sc.close();

    }
}