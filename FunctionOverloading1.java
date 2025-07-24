// function overloading : data type of function is different

public class FunctionOverloading1 {
    int sum(int a, int b) {
        return (a+b);
    }

    double sum(double a, double b) {
        return(a+b);
    }
    
    public static void main(String[] args) {
        
    
    FunctionOverloading1 obj = new FunctionOverloading1();

    int a=5, b=6;

    System.out.println("sum of two numbers of int data type"+ obj.sum(a,b));

    double  c=5.44, d=6.98;

    System.out.println("sum of two numbers of double data type"+ obj.sum(c,d));
 }
}