package July22;
import java.util.Scanner;
public class EnhanceArray {

    public static void main(String[] args) {
        String array[] = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value length of array");
        int length = sc.nextInt();

        System.out.println("Enter your value");
        for (int i = 0; i < length; i++) {
            array[i] = sc.next();
        }
        System.out.println("print the value");
        for (String n : array) {
            System.out.println(n);
        }
    }
}



