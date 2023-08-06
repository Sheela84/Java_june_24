package july29;



 class Car{
    String name;
    String engine;
    String brand;
      public void  getName(String name) {
        this.name = name;
        System.out.println("  Car detail :  Name" + this.name);

    }
    public void getEngine(String engine){
        this.engine=engine;
        System.out.println("   Engine: "  +this.engine);
    }
    public void getBrand(String brand)
    {
        this.brand=brand;
        System.out.println(" Brand:   " + brand);
    }
}

public class CarClass {
    public static void main(String[] args){
        Car c1=new Car();
        c1.getName(" Abc");
        c1.getEngine("xyz");
        c1.getBrand("Maruti");



        }
    }






