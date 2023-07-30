package July22;
import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Enter the length of array");
        int length = sc.nextInt();



        System.out.println("Enter the value of Array");
        for (int i = 0; i < length; i++)
            array[i] = sc.nextInt();
        System.out.println("Print the reverse of Array");
        for (int i = length; i>0; i--)

            System.out.println(array[i-1] );



    }
}
