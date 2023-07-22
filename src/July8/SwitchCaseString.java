package July8;
import java.util.Scanner;

public class SwitchCaseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Customer Choice");
        String name=sc.next();

        switch(name){
            case " Pragra" :
                System.out.println("Address of Pragra is:  110 Matheson Blvd W #160 ,Mississauga ON L5R4G7");
                break;
            case "CNTower" :
                System.out.println("Address of CN TOwer is :  290 Bremner Blvr, Toronto On M5V3L9");
                break;
            default:
                System.out.println("No Address is not found");

        }
    }

}
