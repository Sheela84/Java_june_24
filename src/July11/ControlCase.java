package July11;
import java.util.Scanner;
public class ControlCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Limit For counter ");
        int limit = sc.nextInt();
        int counter = 0;
        do {
            System.out.println(counter);
            counter++;
        }
            while(counter<limit);

    }
}



