package july15;
import java.util.Scanner;

public class Cubeassignment6 {
    public static void main(String[] args)
    {
        int counter,number,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for cube");
        number=sc.nextInt();
        for(i=1;i<=number;i++)
        {
            System.out.println("Number is:" +i );
            System.out.println("Cube of  i");
            counter=i*i*i;
            System.out.println(counter);
        }


    }
}
