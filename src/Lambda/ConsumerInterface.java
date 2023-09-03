package Lambda;
import com.sun.org.apache.bcel.internal.classfile.DescendingVisitor;

import java.util.function.Consumer;
public class ConsumerInterface {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        Consumer<String> c1 = (x1) -> System.out.println(x1.toLowerCase());
        c1.accept(" WELCOME");
        Consumer<Integer> a1 = (y) ->
        {
            System.out.println("The value of a is= " + a);
        };
        a1.accept(a);

    }

}



