package july15;
import java.util.Scanner;

public class MoreMethod {
    public static int sum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value");
        int num1 = sc.nextInt();
        System.out.println("Enter first value");
        int num2 = sc.nextInt();
        System.out.println("Enter first value");
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println(sum);
        return sum;

    }

    public static int multipication() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value");
        int num1 = sc.nextInt();
        System.out.println("Enter first value");
        int num2 = sc.nextInt();
        System.out.println("Enter first value");
        int num3 = sc.nextInt();
        int mul = num1 * num2 * num3;
        System.out.println(mul);
        return mul;


    }
}
