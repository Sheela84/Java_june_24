package july15;

import java.util.Scanner;

public class AveragMethod {
    public static int sum() {
        int n, num, sum = 0, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many numbers");
        n = input.nextInt();
        System.out.println("enter the number");
        for (i = 1; i < n; i++) {
            num = input.nextInt();
            sum = sum + num;



        }
        System.out.println(sum);
        return sum;
    }

}
