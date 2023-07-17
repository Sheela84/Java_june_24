package July11;
import java.util.Scanner;
public class AveragrOfNumber {
    public static void main(String[]args) {

        int i,num,sum=0,n;

        Scanner input =new Scanner(System.in);
        System.out.println("Enter how many numbers");
        n=input.nextInt();
        System.out.println("enter the number");
        for(i=1;i<=n;i++) {
            num = input.nextInt();
            sum = sum + num;


        }
        System.out.println(sum);
        double  avrage;
        avrage=sum/n;
        System.out.println("average of given number is:" + avrage);










    }
}
