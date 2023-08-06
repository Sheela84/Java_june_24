package August5;
class Fruit1
{
    String color;
    int price;
    public Fruit1(String color,int price)
    {

        this.color=color;
        this.price=price;

    }

    public void displayResult() {
        System.out.println("color " + color);
        System.out.println(" price " + price);

    }
}

class Apple1 extends Fruit1{

    String weight;

    public Apple1(String color,int price,String weight) {
         super(color,price);
        this.weight = weight;
    }

    public void getResult()
    {
        System.out.println("color :" + color + "price: "  + price+ "weight: "+weight);
    }

}








