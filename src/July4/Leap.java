package July4;
import java.util.Scanner;
public class Leap {
    public  static void main(String[] args){
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of year");
        year=sc.nextInt();
        if(year%4==0){
            System.out.println("Year is Leap Year");
        }
        else{
            System.out.println("Year is Not Leap Year");
        }

    }
}
