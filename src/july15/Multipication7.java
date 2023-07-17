package july15;
import java.util.Scanner;
public class Multipication7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for multipication");
        int number=sc.nextInt();
        //for(int i=1;i<.10;i++)
        int i=1;
        System.out.println("Table of given number is: ");
        while(i<=10)
        {
           int counter=number*i;
           i++;
           System.out.println(counter);



        }

    }
}
