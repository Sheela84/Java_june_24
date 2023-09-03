package August19;
import java.util.Scanner;
public class BankWithDraw {


    Scanner sc= new Scanner(System.in);
    int withdraw=sc.nextInt();



  // int  withdraw= Integer.parseInt(sc.next());


    public void amount(int withdraw) throws WithdrawLimit{

        if (withdraw<5000)
        {
            System.out.println(" you can withdrwa and enjoy your day" +
                    "");
        }
        else{
            System.out.println(" you can not withdraw");
        }
    }

}
