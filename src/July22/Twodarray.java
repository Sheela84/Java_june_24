package July22;

import java.util.Scanner;
public class Twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        String matrix[][] = new String[10][10];
        System.out.println("Enter the dimension of row in matrix");

        row = sc.nextInt();
        System.out.println("Enter the dimension of  coloumn matrix");

        col = sc.nextInt();
        System.out.println("Enter the value of matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               matrix[i][j]=sc.next();
            }
        }


        System.out.println("print the matrix");
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
             System.out.println( matrix[i][j] +" ");

            }
            System.out.println();

        }

    }
}
