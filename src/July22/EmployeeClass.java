package July22;
import java.util.Scanner;
public class EmployeeClass {
    String name ;
    int age;
    String designation;
    double salary;
    Scanner sc=new Scanner(System.in);

    public void setAge() {
        System.out.println("Enter the age of Employee");
        age=sc.nextInt();


    }
    public void setName()
    {
        System.out.println("enter name of employee");
        name=sc.next();
    }
    public  void setsalary()
    {
        System.out.println("enter the Salary of employee");
        salary=sc.nextDouble();
    }
    public static void main(String[] args)
    {
        EmployeeClass e1=new EmployeeClass();

        e1.setName();
        e1.setAge();
        e1.setsalary();
        EmployeeClass e2=new EmployeeClass();

        System.out.println("Print the Name of employee: "+ e1.name);
        System.out.println("Print the Age of employee: "+ e1.age);
        System.out.println("Print the Salaryof employee: "+ e1.salary);
        e2.setName();
        e2.setAge();
        e2.setsalary();

        System.out.println("Print the Name of employee: "+ e2.name);
        System.out.println("Print the Age of employee: "+ e2.age);
        System.out.println("Print the Salaryof employee: "+ e2.salary);
    }

}
