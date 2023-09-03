package Lambda;

public class AdditionMain {
    public static void main(String[] args) {
        AdditionInterface a1 = (int a, int b) -> {
            System.out.println(" enter two number");
            System.out.println(" sum of two number are:" + (a + b));
        };
        a1.addition(20, 10);

        AdditionInterface s1 = (int x, int y) -> {
            System.out.println(" sum of two number are:" + (x -y));

        };
        s1.addition(20, 10);
    }



    }

