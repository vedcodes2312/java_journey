// armstrong no. 
import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
    int ognum,num, rem, sum=0;

    Scanner sc = new Scanner(System.in);

   System.out.println("enter a number");
   
   ognum = sc.nextInt();

   if(ognum<0) {
    System.out.println("num should be positive");
   }
   
  num = ognum;
   while(num>0) {
    rem = num % 10;
    sum = sum + (int)Math.pow(rem,3);
    num = num / 10;
   }

   if(ognum == sum) {
    System.out.println("armstrong number");
   }

   else {
    System.out.println("not armstrong");
   }
sc.close();
}
}