package July4;
import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args){
        int x;
        int y;
        int z;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if(x>y && x>z){
            System.out.println("x is greater");

        }
        else if(x<y && x>z){
            System.out.println("y is gerater");
        }
        else{
            System.out.println("z is greater");
        }

    }
}
