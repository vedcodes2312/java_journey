import java.util.Scanner;
class DemoExp {

public static int divide(int a, int b) throws ArithmeticException {
       if (b == 0){
         throw new ArithmeticException("div by zero not possible");
       }
  return a/b;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter 2 numbers");
int a = sc.nextInt();
int b = sc.nextInt();

  try {
    System.out.println(divide(a,b));
    // System.out.println(divide(7,0));
   }  catch(ArithmeticException exp) { 
     System.out.println("exception caught" + exp);
    System.out.println("enter new value of b");
    b = sc.nextInt();
       if(b==0) { System.out.println("zero won't work enter something else"); }
    System.out.println("updated division" + divide(a,b));
   } finally {
     System.out.println("code run done");
   }
sc.close();
  }
}
