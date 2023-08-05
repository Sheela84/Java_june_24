package July4;
class calcualator
{
    private int num1;
    private int num2;
     public calcualator(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void getAdd()
    {
        System.out.println(" Result of  Addition");
        int sum=num1+num2;
        System.out.println(sum);
    }
    public void getSub()
    {
        System.out.println(" Result of  Subtraction");
        int sub=num1-num2;
        System.out.println(sub);
    }
    public void getMal()
    {
        System.out.println(" Result of  Maltipication");
        int mal=num1*num2;
        System.out.println(mal);
    }
    public void getDiv()
    {
        System.out.println(" Result of Division");
        int div=num1/num2;
        System.out.println(div);
    }

}
public class Calconstructor {
    public static void main(String[] args)
    {
        calcualator c1=new calcualator(23,10);
                c1.getAdd();
                c1.getSub();
                c1.getMal();

    }
}
