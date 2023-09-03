package August19;
import java.util.Scanner;


public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            int array[] = new int[2];
            array[0] = 2;
            array[1] = 4;
            System.out.println(array[6]);

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("something went wrong");
        }
        finally{
            System.out.println(" try and catch are finished");
        }
    }
}


