package Lambda;

public class DrawMain {
    public static void main(String[] args)
    {
        DrawInterface d1=new DrawInterface() {
            @Override
            public void draw() {
                System.out.println(" draw the shape");


            }
        };
        d1.draw();
        d1.shape();
        DrawInterface.circle();
    }
}
