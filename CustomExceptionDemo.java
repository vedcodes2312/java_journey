// custom exception demo
// inheritance- extend Exception class

class MyCustomException extends Exception {
    // constructor 
    public MyCustomException(String message) {
        super(message);   //parent constructor call - immediate parent
    }
}

public class CustomExceptionDemo {
   // a method that throws the custom exception
    public static void checknumber(int number) throws MyCustomException {
        if(number < 0) {
            throw new MyCustomException("only positive numbers allowed: "+number);
        }

        else {
            System.out.println("number is valid "+number);
        }
    }
    
  // main function with try catch blocks    
    public static void main(String[] args) {
        try {
            checknumber(10); // valid
            checknumber(-5); // invalid will throw exception
        } catch (MyCustomException e) {
            System.out.println("exception caught: "+e.getMessage());
        } finally {
            System.out.println("execution complete");
        }
    }
}