public class UserDefinedFunctions1 {  // public static in front of function name use karne se function ko kisi bhi jagah se call kar sakte hain while 
    //static keyword se function ko class ke andar hi access kar sakte hain bina kisi object ke.
    // NO RETURN TYPE NO ARGUMENTS
   public static void greet() {
         System.out.println("User Defined Function 1");
   }

    // RETURN TYPE NO ARGUMENTS
    public static String getGreeting() {
          return "Hello from User Defined Function 2";
     }
    public static int getNumber() {
        int number = 10;
        return number;
    }

    // NO RETURN TYPE WITH ARGUMENTS
    public static void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }

    // RETURN TYPE WITH ARGUMENTS
    public static String createGreeting(String name) {
        return "Hello, " + name + "!";
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Calling functions
        greet();
        System.out.println(getGreeting());
        System.out.println("Number: " + getNumber());

        printMessage("Welcome to User Defined Functions!");
        printSum(5, 15);

        String greeting = createGreeting("Alice");
        System.out.println(greeting);

        int product = multiply(4, 5);
        System.out.println("Product of 4 and 5 is: " + product);
    }
   }
