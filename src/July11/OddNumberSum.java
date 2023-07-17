package July11;
import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit");
        int num = sc.nextInt();
        int sum = 0;
       // System.out.println("enter value");
        for (int i = 1; i <=num; i++) {


            if (i % 2 != 0) {
                System.out.println("Value of Odd number is: "  + i);
                sum = sum + i;
            }
        }
            System.out.println("Sum of odd number:"  +sum);



    }



    }

