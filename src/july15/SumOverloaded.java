package july15;
import java.util.Scanner;
public class SumOverloaded {
    int num1,num2,num3;


    public  static void getnumber(int num1,int num2){
        int sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First number");
                num1=sc.nextInt();
        System.out.println("Enter The Second number");
       num2=sc.nextInt();
         sum= num1+num2;
        System.out.println("Sum of two number:"  + sum);


    }
    public static void   getnumber(int num1,int num2,int num3){
        int sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First number");
        num1=sc.nextInt();
        System.out.println("Enter The Second number");
         num2=sc.nextInt();
        System.out.println("Enter The Second number");
        num3=sc.nextInt();
         sum= num1+num2+num3;
        System.out.println("Sum of two number:"  + sum);



    }
    public static void main(String[]args)
    {

        getnumber(2,3);
        getnumber(2,3,4);
    }
}
