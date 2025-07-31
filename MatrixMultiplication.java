import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows1, cols1, rows2, cols2;
     System.out.println("enter number of rows and columns for  first matrix");
        rows1 = sc.nextInt();
        cols1 = sc.nextInt();
        System.out.println("enter number of rows and columns for second matrix");
        rows2 = sc.nextInt();
        cols2 = sc.nextInt();

        int matrix1[][] = new int[rows1][cols1];
        int matrix2[][] = new int[rows2][cols2];
        int productmatrix[][] = new int[rows1][cols2];
        if(cols1 != rows2) {
            System.out.println("matrix multiplication is not possible");
        }
         // user input of matrix elements
         System.out.println("enter "+ rows1 + "x" + cols1 + " elements for first matrix:");
        for(int i=0; i < rows1; i++) {      
            for(int j=0; j<cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter "+ rows2 + "x" + cols2 + " elements for second matrix:");
         for(int i=0; i < rows2; i++) {      
            for(int j=0; j<cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nFirst Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("[" + i + "][" + j + "]=" + matrix1[i][j] + "  ");
            }
            System.out.println();
        }

        // Print matrix2
        System.out.println("\nSecond Matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("[" + i + "][" + j + "]=" + matrix2[i][j] + "  ");
            }
            System.out.println();
        }
      // multiplication
          for(int i=0; i < rows1; i++) {      
            for(int j=0; j<cols2; j++) {
                productmatrix[i][j]=0;
                for(int k=0; k<cols1; k++) {
                    productmatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
         System.out.println("\nProduct Matrix (Result):");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("[" + i + "][" + j + "]=" + productmatrix[i][j] + "  ");
            }
            System.out.println();
        }

        sc.close();
    }
}




    
