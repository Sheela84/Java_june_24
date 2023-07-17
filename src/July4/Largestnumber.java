package July4;
import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;
        Scanner sc=new Scanner(System.in);
       // num1=sc.nextInt();
        System.out.print("Enter value of num1");
        num1=sc.nextInt();
        System.out.println("Enter  Value of num2");

        num2=sc.nextInt();
        System.out.println("Enter value of num3");
        num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.print("x is largest:" +num1);
        }
        else if( num1<num2 && num1>num3){
            System.out.print("y is greater :" +num2);
        }
        else{
            System.out.print("z is greater: "  +num3);
        }
    }
}
