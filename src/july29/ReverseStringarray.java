package july29;

import java.util.Scanner;

public class ReverseStringarray {
    public static void main(String[] args) {
        System.out.println("enter your string");
                String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();


      // String str =" hello";

        char[]charr=str.toCharArray();
        System.out.println("print the reverse of string");
        for (int i=charr.length-1;i>=0;i--)
            System.out.println(  charr[i]);
        for(int  i=str.length()-1;i>=0;i--)
            System.out.println(str.charAt(i));


    }
}
