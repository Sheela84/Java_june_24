package july15;
import java.util.Scanner;
public class AverageMethod {


    public  static void sum()
    {
        int sum=0;
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the length of number");
        int length=sc.nextInt();
        System.out.println("Enter the number");

        for (int i=0;i<=length;i++)
        {
            number=sc.nextInt();
            sum=sum+number;
        }
        System.out.println("Sum of number are:"  + sum);
        double avg=sum/length;
        System.out.println(" Average of number are:"    + avg);
    }
    public static void main(String[] args)
    {

      sum();

    }
}
