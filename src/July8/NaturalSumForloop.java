package July8;
import java.util.Scanner;
public class NaturalSumForloop {
    public static void main(String[] args){
        int counter=0;
        int sum=0;
        System.out.println("Enter The Number");
        Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();

        for(counter=0;counter<=number;counter++)
        {
            sum=sum+counter;
        }
        System.out.println("Sum Of natural Number is:"  + sum);
    }
}
