package July8;
import java.util.Scanner;
public class Ternary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Value Of Number");
        int x=sc.nextInt();
        String result=(x%2==0) ?"Even" : "Odd";
        System.out.println("Number is:"  + result);

    }

}
