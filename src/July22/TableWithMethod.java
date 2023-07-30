package July22;

import java.util.Scanner;

public class TableWithMethod {
    public static void table() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for multipication");
        int number = sc.nextInt();

        int i = 1;
        System.out.println("Table of given number is: ");
        while (i <= 10) {
            int counter = number * i;
            i++;
            System.out.println(counter);

        }
    }
    public static void main(String[] args)
    {

        table();
    }
}
