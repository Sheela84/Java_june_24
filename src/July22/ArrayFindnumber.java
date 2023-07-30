package July22;

import java.util.Scanner;

public class ArrayFindnumber {

    public static void main(String[] args) {
        int array[] = new int [10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value length of array");
        int length = sc.nextInt();

        System.out.println("Enter your value");


        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("find the number");
        int num=sc.nextInt();


        for (int i = 0; i < length; i++)
            if(array[i]== num)

            System.out.println(i);




    }
}
