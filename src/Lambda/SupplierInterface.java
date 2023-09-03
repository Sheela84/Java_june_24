package Lambda;
import java.util.function.Supplier;
public class SupplierInterface {
    public static void main(String[]args) {
        Supplier<String> s1 = () -> " java is a languge";
        System.out.println(s1.get());

        Supplier<String>a =()-> " java ";
        System.out.println(a .get());

    }

}
