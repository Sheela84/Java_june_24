package July22;

public class StaticDemo {
    String name;
    String model;
    String color;

    public void makecar()
    {


        System.out.println("Name of the car: "  +name );
        System.out.println("Model  of the car: "  +model );
    }

    public static void main(String[]args)
    {
        StaticDemo s1=new StaticDemo();

        s1.name="Model X";
        s1.model="XYZ";
        s1.makecar();

    }
}



