package July4;
import java.util.Scanner;
public class Digitnumber {
    public static void main(String[] args){
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Value Of Number");
        x=sc.nextInt();
        if (x>=0 && x<=9){
            System.out.println("Number Is One Digit Number");
        }
        else if(x>=10 && x<=99){
            System.out.println("Number Is 2 Digit number");
        else if(x>=100 && x<=999){
            System.out.println("Number Is 3 Digit Number");
        }
        else if(x>=1000 && x<=999){
            System.out.println("Number Is 4 Digit Number");
        }
        else {
            System.out.println("Number Is Invalid");
        }
    }
}
