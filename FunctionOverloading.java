// function overloading : number of parameters
import java.util.Scanner;

public class FunctionOverloading {
    
    int sum(int a, int b) {
        return (a+b);
    }

    int sum(int a, int b, int c) {
        return(a+b+c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FunctionOverloading fo = new FunctionOverloading();
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("addition of two numbers"+ fo.sum(a,b));  //2 arg wala call hoga
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("addition of two numbers"+ fo.sum(x,y,z));  // 3 arg wala call hoga
        sc.close();
    }
}