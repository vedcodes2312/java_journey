// types of user defined functions in java

public class UserDefinedFunctions {

    // Function to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Function to concatenate two strings
    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Function to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Function to find the maximum of two numbers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Function to calculate the factorial of a number
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

// Example usage of the user defined functions
public class Main {
    public static void main(String[] args) {
        // Using the add function
        int sum = UserDefinedFunctions.add(5, 10);
        System.out.println("Sum: " + sum);

        // Using the concatenate function
        String combined = UserDefinedFunctions.concatenate("Hello, ", "World!");
        System.out.println("Concatenated String: " + combined);

        // Using the isEven function
        boolean evenCheck = UserDefinedFunctions.isEven(4);
        System.out.println("Is 4 even? " + evenCheck);

        // Using the max function
        int maximum = UserDefinedFunctions.max(15, 20);
        System.out.println("Maximum: " + maximum);

        // Using the factorial function
        long fact = UserDefinedFunctions.factorial(5);
        System.out.println("Factorial of 5: " + fact);
    }
}

// Example usage of the user defined functions
// This code defines a class with several user-defined functions and demonstrates their usage in a main method.
// Each function performs a specific task such as addition, string concatenation, checking evenness,
// finding the maximum of two numbers, and calculating the factorial of a number. The main method shows how to call these functions and print their results.