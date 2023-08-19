package August8;

public class ComputerSuper {
    private int size;

    public ComputerSuper(int size) {
        this.size = size;
    }

   public void display()
   {
       System.out.println(" print the size of computer:  "+ size);

   }



}

 class Dell extends ComputerSuper{
    String  color;


    public Dell(int size, String color) {
        super(size);
        this.color = color;
    }

    public void getsize()
    {
        System.out.println("  color of computer:"  +  color);
    }




}