public class MathDemo {
    public static void main(String[] args) {
        System.out.println("Absolute value: " + Math.abs(-5));     //  |-5| = 5
        System.out.println("Ceiling: " + Math.ceil(3.7));   // least integer function
        System.out.println("Floor: " + Math.floor(3.7));   //greatest integer function
        System.out.println("Rounding: " + Math.round(3.7));      // Rounds to nearest long/int
        System.out.println("Square root: " + Math.sqrt(9));     //  sqrt

        System.out.println("Power: " + Math.pow(2, 3));     //
        System.out.println("Max: " + Math.max(5, 10));     // returns the greater of two values
        System.out.println("Min: " + Math.min(5, 10));     // returns the lesser of two values

        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println("Random number: " + randomNum);
           System.out.println(" cube root: " + Math.cbrt(9));
        System.out.println("a number to the power of e:" + Math.exp(1));
         System.out.println("natural log" + Math.log(2));
         System.out.println("common log:" + Math.log10(4));

         double x = 3.4;
         double radians = Math.toRadians(x);
        double degrees = Math.toDegrees(radians);
        System.out.println("Degrees: " + degrees); // Convert radians to degrees
        System.out.println("Radians: " + radians); // Convert degrees to radians
         //trigonometry values
         System.out.println("sin:" + Math.sin(radians));
            System.out.println("cos:" + Math.cos(radians));

        System.out.println("tan:" + Math.tan(radians));
        System.out.println("asin:" + Math.asin(0.5)); // arcsine
        System.out.println("acos:" + Math.acos(0.5)); // arccosine
        System.out.println("atan:" + Math.atan(1)); // arctangent
        System.out.println("atan2:" + Math.atan2(1, 1)); // arctangent of y/x
        System.out.println("hypot:" + Math.hypot(3, 4)); // hypotenuse of a right triangle
        
        System.out.println("log1p:" + Math.log1p(0.5)); // natural log of (1 + x)
        System.out.println("expm1:" + Math.expm1(1)); // e^x - 1
        System.out.println("sinh:" + Math.sinh(radians)); // hyperbolic sine
        System.out.println("cosh:" + Math.cosh(radians)); // hyperbolic cosine
        System.out.println("tanh:" + Math.tanh(radians)); // hyperbolic tangent
        }
}