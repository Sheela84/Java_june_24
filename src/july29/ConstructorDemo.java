package july29;

public class ConstructorDemo {
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.getName();
        e1.getAge();
        e1.getSalary();
    }



}

class Employee
{
    private  String name;
    private int age;
   double salary;
   public Employee()
   {
      name="John" ;
      age=34;
      salary=200000;
   }

   public void getName()
   {
       System.out.println(name);
   }
   public void getAge()
   {
       System.out.println(age);
   }

   public void getSalary()
   {
       System.out.println(salary);
   }





}
