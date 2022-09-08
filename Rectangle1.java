import java.awt.Rectangle;

/**
 * Write a description of class Rectangle1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle1
{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(0,0,100,50);
        System.out.println(r1);
        Rectangle r2 = new Rectangle (0,0,100,50);
        r2.grow(10,20);
        System.out.println(r2);
        r2 = r1;
        System.out.println(r2);
        
        
}
    }


