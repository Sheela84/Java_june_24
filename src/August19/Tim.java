package August19;

public class Tim {


    public static void main(String[] args) {
        serveCoffee();

        Size size = Size.MEDIUM;
        switch (size) {
            case MEDIUM:
                System.out.println("medium coffee ");
        }
    }

    public static void serveCoffee() {
        System.out.println("I want a coffee " + Size.MEDIUM + " Steeped tea, double double ");

        System.out.println("I want a coffee " + Size.SMALL + " Steeped tea, double double ");

    }
}