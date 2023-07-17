package july15;
import java.util.Scanner;
public class CalculatorMethod {
    public static void main(String[] args) {
        System.out.println("Welcome my Calculator");
        call();
    }


    public static void call() {
        String input;
       String choice;
        do {

            System.out.println("Enter the Value");
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            System.out.println("Enter Second number");
            int num2 = sc.nextInt();
            System.out.println("Enter the operation you want to perform:+,-,*,/");

            input = sc.next();
            switch (input) {
                case "+":
                    sum(num1, num2);
                    break;

                case "_":
                    sub(num1, num2);
                    break;

                case "*":
                    multi(num1, num2);
                    break;
                //  case "/":
                //    div( int num1, int num2);
                //   break;
                default:
                    System.out.println("Please valid number");
                    break;
            }
            System.out.println("Do you want to continue if yes press Y or  any other key to exit");

            choice = sc.next();
        }


        while (choice!= "Y");

    }

    public static void sum(int num1, int num2) {

        System.out.println(num1 + num2);
    }

    public static void sub(int num1, int num2) {

        System.out.println(num1 + num2);
    }

    public static void multi(int num1, int num2) {

        System.out.println(num1+num2);

    }

}
