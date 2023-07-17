package July11;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Value");

        x=sc.nextInt();
        String input;



        if (x == 1) {
            do {

                System.out.println("Perform add ");
                System.out.println("Enter the Value");
                int num1 = sc.nextInt();
                System.out.println("Enter Second number");
                int num2 = sc.nextInt();
                int sum = num1 + num2;
                System.out.println(" result of sum:" + sum);
                System.out.println("want exit press Y");
                input=sc.next();

            }while(input!= "Y");

        } else if(x==2){
            do {


            System.out.println("Subtraction");
            System.out.println("Enter the Value");
            int num1=sc.nextInt();
            System.out.println("Enter Second number");
            int  num2=sc.nextInt();
            int sub=num1-num2;
            System.out.println(" Result of sub:" + sub);
                System.out.println(" result of sub:" + sub);
                System.out.println("want exit press Y and N for no");
                input=sc.next();

            }while(input!="Y");




        }
        else if(x==3){
            do {


            System.out.println("Multipication");
            System.out.println("Enter the Value");
            int num1=sc.nextInt();
            System.out.println("Enter Second number");
            int  num2=sc.nextInt();
            int mul=num1*num2;
            System.out.println(" Result of mul: "  + mul );
                System.out.println(" result of sum:" + mul);
                System.out.println("want exit press Y");
                input=sc.next();

            }while(input!= "N");

        }
        else if(x==4){
            System.out.println("Enter the Value");
            int num1=sc.nextInt();
            System.out.println("Enter Second number");
            int  num2=sc.nextInt();
            int div=num1/num2;
            System.out.println("Result of div: "  + div);


        }
        else {
            System.out.println("Invalid NUmber");

        }
    }
}



