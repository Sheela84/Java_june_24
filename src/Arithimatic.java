import java.util.*;
public class Arithimatic {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("value of a:");
        int a=sc.nextInt();
        System.out.println("Value of b:");

        int b=sc.nextInt();
        System.out.println("enter your name");
        String  name=sc.next();
        int c=a+b;
        int d=a*b;
        int e=a-b;
        System.out.println("Result of Addition:");
        System.out.println(c);
        System.out.println("Result of Multipication:");
        System.out.println(d);
        System.out.println("Result of Subtraction:");
        System.out.println(e);
        System.out.println(name);

    }
}

