package july15;

public class NestedLoop {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
                //System.out.println();
            }
            System.out.println();
        }
    }
}