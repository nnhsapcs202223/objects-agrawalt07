import java.awt.Color;

public class TurtleLab
{
    static void pxiel(Turtle turtle, int length, java.awt.Color color){
        turtle.penDown();
        turtle.setPenColor(color);
        turtle.setPenWidth(length);
        if ((int) turtle.getHeading() == 180 || turtle.getHeading() == 90){
            turtle.turnRight();
            turtle.forward(length);
        }
        else{
            turtle.turnLeft();
            turtle.forward(length);
        }
        turtle.penUp();
        turtle.forward(length+0);
    }
    
    public static void main(String[] args)
    {
        World frame = new World();
        Turtle huskie = new Turtle(frame);
        int xCordinate = huskie.getXPos();
        int yCordinate = huskie.getYPos();
        huskie.moveTo(0,0);
    }
    static void drawRow(Turtle turtle,int number, java.awt.Color color,int startXPos,int startYPos){
        turtle.moveTo(startXPos, startYPos);
        turtle.penDown();
    }
}
