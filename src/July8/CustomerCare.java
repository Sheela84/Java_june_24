package July8;
import java.util.Scanner;

public class CustomerCare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       // int x=sc.nextInt();

        System.out.println("Welcome In Telecomnication ");
        System.out.println(" Press 1 For English");
        System.out.println("Press 2 For French");
        System.out.println("Enter your Option");
        System.out.println("1 For Technical");
        System.out.println("2 For Billing Issue");
        System.out.println("3 For New service");
        System.out.println("4 For Disconnute service");
        int x=sc.nextInt();
        switch(x){
            case 1:
                System.out.println("Do some troubleshooting");
                break;
            case 2:
                System.out.println("pay yous bill");
                break;
                case 3:
            System.out.println(" Give your new addr");
            break;
            default:
                System.out.println("repate menu again");
        }


    }
}
