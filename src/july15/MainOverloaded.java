package july15;

import java.util.Scanner;

public class MainOverloaded {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the name of Company");
        String name=sc.next();
       Overloaded.enterInformation(name);

        System.out.println("Enter the age of Company");
        int age=sc.nextInt();
        Overloaded.enterInformation(age);

        System.out.println("Total number of employee are :"  );
                int employee=sc.nextInt();
        Overloaded.enterInformation(employee);




    }
}
