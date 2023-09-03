package Lambda;

public interface  DrawInterface {
    void draw();
    public default  void shape()
    {

       System.out.println(" shape is circle") ;
    }
    static void circle()
    {
       System.out.println(" draw shape of circle") ;
    }

}
