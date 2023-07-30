package July22;

import java.util.Scanner;

public class ArraySmallestassin2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        // int length=sc.nextInt();

        System.out.println("Enter length of Array");
        int length = sc.nextInt();
        int min = array[0];

        System.out.println("Enter Value of Array");


        for (int i = 0; i <= length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Print the Smallest  value");

        for (int i = 0; i <= length; i++) {
            if (array[i] < min) {
                min = array[i];


            }
        }
        System.out.println(min);



    }
}


