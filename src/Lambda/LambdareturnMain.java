package Lambda;

public class LambdareturnMain {
    public static void main(String[] args)
    {
        LambdaReturn l1=(String s1) -> {

            return " name is Sheela      "    +s1;
        };
       System.out.println(l1.print1("Sheela"));
    }
}
