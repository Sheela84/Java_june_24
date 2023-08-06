package August5;

import java.sql.SQLOutput;

class Vehicle {

    String color;
    String brand;
    String engine;

    public Vehicle(String color, String brand, String engine) {
        this.color = color;
        this.brand = brand;
        this.engine = engine;
    }

    public void display() {
        System.out.println(" Color :" + color + "Brand  :" + brand + "Engine: " + engine);
    }
}
class Car extends Vehicle{
    double cost;

    public Car(String color, String brand, String engine, double cost) {
        super(color, brand, engine);
        this.cost = cost;
    }




}


