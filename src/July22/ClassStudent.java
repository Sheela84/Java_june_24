package July22;
import java.util.Scanner;
public class ClassStudent {
    String name;
    String course;
    int id;
    int phone;
    Scanner sc=new Scanner(System.in);

    public   void getInformation()
    {
        System.out.println("enter the name of student");
         name =sc.next();
        System.out.println("enter course of student");
        course =sc.next();

       System.out.println("enter the id of student");
        id=sc.nextInt();



    }
    public static void main(String[] args)
    {
        ClassStudent s1=new ClassStudent();
        ClassStudent s2=new ClassStudent();
        ClassStudent s3=new ClassStudent();



        s1.getInformation();
        System.out.println("Name of student: "  + s1.name);
        System.out.println("course of student: "  + s1.course);
        System.out.println("id  of student: "  + s1.id);

        s2.getInformation();
        System.out.println("Name of student: "  + s2.name);
        System.out.println("course of student: "  + s2.course);
        System.out.println("id  of student: "  + s2.id);

        s3.getInformation();
        System.out.println("Name of student: "  + s3.name);
        System.out.println("course of student: "  + s3.course);
        System.out.println("id  of student: "  + s3.id);

    }

}
