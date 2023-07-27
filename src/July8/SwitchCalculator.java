package July8;
import java.util.Scanner;
public class SwitchCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       // int x=sc.nextInt();
        System.out.println("Use your Calculator");
        System.out.println("1 Addition");
        System.out.println("2 Subtraction");
        System.out.println("3 Multipication");
        System.out.println("4 Division");

        System.out.println("Invalid number");
        System.out.println("Enter Your Choice");
        int x=sc.nextInt();
        int num1;
        int num2;


        switch(x){

            case 1:
                System.out.println("Enter the value number");
                 num1=sc.nextInt();
                System.out.println("Enter the value Number");
                 num2=sc.nextInt();
                int sum=num1+num2;
                System.out. println("Addition:"  + sum);
                break;

            case 2:
            System.out.println("Enter the value number");
             num1=sc.nextInt();
            System.out.println("Enter the value Number");
             num2=sc.nextInt();
            int sub=num1-num2;
            System.out. println("Subtraction:"  + sub);
            break;
            case 3:
                System.out.println("Enter the value number");
                 num1=sc.nextInt();
                System.out.println("Enter the value Number");
                 num2=sc.nextInt();
                int Mul=num1*num2;
                System.out. println("Multipication:"  + Mul);
                break;
            case 4:
                System.out.println("Enter the value number");
                 num1=sc.nextInt();
                System.out.println("Enter the value Number");
                num2=sc.nextInt();
                int div=num1/num2;
                System.out. println("Division:"  + div);
                break;
            default:
                System.out.println("Invalid value");





        }

    }


}
