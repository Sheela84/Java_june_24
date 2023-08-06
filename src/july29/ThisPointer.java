package july29;

public class ThisPointer {
    public static void main(String[] args){
        Pen p1=new Pen();

        p1.getname("ballpoint");
       p1.setcompany("Renoyald");


    }

   static class Pen{
        String name;
        String company;
        String color;

        public  void getname(String name)
        {
            this.name=name;
            System.out.println(this.name);


        }
        public  void setcompany(String company)
        {
            this.company=company;
            System.out.println(this.company);


        }

    }
}
