package July4;
import java.sql.SQLOutput;
import java.util.Scanner;
public class DaysOfWeek {
    public static void main(String[] args){
        int x;
        //int y;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter value of x");
        x=sc.nextInt();
        if(x==1){
            System.out.println("day of week is Sunday");
        }
        else if (x==2){
            System.out.println("day of week is Monady");

        }
        else if(x==3){

            System.out.println("day of week is Tuesday");
        }
        else if(x==4){
            System.out.print("day of week is Wed");
        }
        else if(x==5){
            System.out.println("day of week is Thurs");
        }
        else{
            System.out.println("invalid number");
        }








    }
}
