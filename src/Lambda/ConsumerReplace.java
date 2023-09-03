package Lambda;
import java.util.function.Consumer;
public class ConsumerReplace {
    public static void main(String[] args) {
        Consumer<String> c1 = (x1) -> {
            System.out.println(x1.replace("Sheela", "Dikshant"));
            System.out.println(x1.length());
        };
        c1.accept("Sheela");
        c1.accept("Dikshant");
    }



}





