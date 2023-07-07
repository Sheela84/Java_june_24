package July4;
import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args){
        int x;
        int y;
        int z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x");
        x=sc.nextInt();
        System.out.print("Enter value of y");

        y=sc.nextInt();
        System.out.println("Enter value of z");
        z=sc.nextInt();
        if(x>y && x>z){
            System.out.print("x is largest:" +x);
        }
        else if( x<y && x>z){
            System.out.print("y is greater :" +y);
        }
        else{
            System.out.print("z is greater: "  +z);
        }
    }
}
