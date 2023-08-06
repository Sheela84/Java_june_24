package july29;

public class ShirtConstructor {
    public static void  main(String[]args)
    {
        Shirt s1=new Shirt();
       s1.getColor();
       s1.getSize();


    }
}
class Shirt {
    String color;
    String size;
    String brand;

    public Shirt() {
        color = "Red";
        size = "M";
        brand ="Tommy";


    }

    public void getColor() {
        System.out.println(color);

    }

    public void getSize() {
        System.out.println(size);

    }

    public void getBrand() {

        System.out.println(brand);

    }

}
