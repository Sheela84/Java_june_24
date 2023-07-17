package July11;

import java.util.Scanner;

public class NaturalNumberSum{

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("EnterThe Limit for Natural Number ");
            int num=sc.nextInt();
            int counter=1;
            int sum=0;
            System.out.println("Print The Natural Number");

            while(counter<num){
                //  System.out.println("Print The Natural Number");
                System.out.println(counter);
                counter++;
                sum=sum+counter;

            }
            System.out.println(" Sum of Natural Number:"  + sum);

        }
    }


