package July8;
import java.util.Scanner;
public class CalculatorWithChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // char ch = sc.next().charAt(0);
        System.out.println("Welcome To My Calculator");
        System.out.println("Addition");
        System.out.println("Subtraction");
        System.out.println("Multipication");
        System.out.println("Division");
        System.out.println("Enter Your Choice");
        char ch = sc.next().charAt(0);

        if (ch == '+') {
            System.out.println("Enter The First Number");
            int num1 = sc.nextInt();
            System.out.println("Enter The Second Number");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            System.out.println("Sum of Number:" + sum);
        }
        if (ch == '-') {
            System.out.println("Enter The First Number");
            int num1 = sc.nextInt();
            System.out.println("Enter The Second Number");
            int num2 = sc.nextInt();
            int subtr = num1 - num2;
            System.out.println("Subtraction  of Number:" + subtr);

        }
        if (ch == '*') {
            System.out.println("Enter The First Number");
            int num1 = sc.nextInt();
            System.out.println("Enter The Second Number");
            int num2 = sc.nextInt();
            int mul = num1 * num2;
            System.out.println("Multiplication of Number:" + mul);

        }
        if (ch == '/') {

            System.out.println("Enter The First Number");
            int num1 = sc.nextInt();
            System.out.println("Enter The Second Number");
            int num2 = sc.nextInt();
            int div = num1 / num2;
            System.out.println("Division of Number:" + div);
        }

    }
}
