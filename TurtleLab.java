import java.awt.Color;

public class TurtleLab
{
    static void pxiel(Turtle turtle, int length, java.awt.Color color){
        turtle.penDown();
        turtle.setPenColor(color);
        turtle.setPenWidth(length);
        if ((int) turtle.getHeading() == 180 || true){
            System.out.println("What");
        }
        
        
    }
    public static void main(String[] args)
    {
        
    }
}
