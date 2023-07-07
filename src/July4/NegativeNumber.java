package July4;
import java.util.Scanner;
public class NegativeNumber {
    public static void main(String[] args){
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value Of Number");

        x=sc.nextInt();
        if(x>=0){
            System.out.println("Number Is Positive");
        }
        else{
            System.out.println(" Number Is Negative");
        }
    }
}
