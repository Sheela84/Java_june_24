package July4;
import java.util.Scanner;
public class Even {
    public static void main(String[] args)
    {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of Number");
        x=sc.nextInt();
        if(x%2==0)
        {
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }


    }
}
