package july29;

public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setCourse("IT");
        s1.setName("Sheela");
        s1.setId(101);
        Student s2=new Student();
        s2.setCourse("IT");
        s2.setName("Dikshant");
        s2.setId(102);


    }


  static  class Student
    {
       String name ;
       int age;
       int id;
       String course;

        public void  setCourse(String course) {
            this.course = course;
            System.out.println(this.course);
        }
        public void setName(String name){
            this.name=name;
            System.out.println(this.name);


        }
        public  void setId(int id){
            this.id=id;
            System.out.println(this.id);
        }
    }
}
