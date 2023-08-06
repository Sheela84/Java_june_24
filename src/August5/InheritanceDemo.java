package August5;
class Fruit
{
    String color;
    int price;



    public void display()
    {
        System.out.println("color " + color);

    }
    public void getPrice()
    {
        System.out.println(" price : "  + price);
    }
}
class Apple extends Fruit{
    String weight;



    public void getWeight()
    {
        System.out.println(" Weight of fruit:"  + weight);
    }

}
class Mango extends Apple{

}
public class InheritanceDemo {
    public static void main(String[] args){


        Apple apple=new Apple();
        apple.color=" Green";
        apple.display();
        apple.price=122;
        apple.getPrice();
        apple.weight= " 4 kg";
        apple.getWeight();

       Mango m1= new Mango();
        m1.weight=" 5kg";
        m1.getWeight();
    }
}
