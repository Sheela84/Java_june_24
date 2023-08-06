package jAugust1;
class Mobile1 {
    private String brand;
    private int capacity;

    Mobile1() {
        System.out.println("This is default constructor");
    }

    public Mobile1(String brand, int capacity) {
        this();
        this.brand = brand;
        this.capacity = capacity;
    }

    public void printMsg() {
        System.out.println(" print brand and capacity of mobile:" + brand + "  / " + capacity);
    }
}


    public class ParamConstruc {


        public static void main(String[] args) {


            Mobile1 m1 = new Mobile1(" Apple" , 128);
            m1.printMsg();


        }
    }




