package July18;
import java.util.Scanner;

public class CalculareArea(){
   static  double PI = 3.14;
    double r;


    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Radious");
        r = sc.nextDouble();
        double area;
        area = PI * r * r;
        System.out.println(area);


    }

    public static void main(String[] args) {

        area();
    }
}
