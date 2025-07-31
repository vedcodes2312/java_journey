import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int rows,cols;
        System.out.println("enter number of rows and columns");
        rows = sc.nextInt();
        cols = sc.nextInt();

        int array[][] = new int[rows][cols];
// input from user
        for(int i=0; i <= rows-1; i++) {     // or for(int i=0; i < rows; i++)   //no equality 
            for(int j=0; j<=cols-1; j++) {
                array[i][j] = sc.nextInt();
            }
        }
    
//print 2d array
    for(int i=0; i <= rows-1; i++) {
            for(int j=0; j<=cols-1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}