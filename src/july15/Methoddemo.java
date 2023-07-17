package july15;
import java.util.Scanner;
public class Methoddemo {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of first number");
        int num1 = sc.nextInt();

        System.out.println("enter value of Second number");

        //int num1=sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter third value ");
                int num3=sc.nextInt();
        int sum = num1 + num2+num3;
        System.out.println(sum);


        //return;
    }
}



