package july15;
import java.util.Scanner;
public class GreaterNumber1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input;
        do {
            System.out.println("Enter First number");
            int num1 = sc.nextInt();
            System.out.println("Enter First number");
            int num2 = sc.nextInt();
            System.out.println("Enter First number");
            int num3 = sc.nextInt();
            if (num1 >= num2 && num1 >= num3) {
                System.out.println("First number is greater");
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("Second number is greater");
            } else {
                System.out.println("Third number is greater");
            }

            System.out.println(" Do you want to continue or Exit: Y or n");
            input=sc.next();

        }while(input!="n");
    }
}
