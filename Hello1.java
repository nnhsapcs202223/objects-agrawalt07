import javax.swing.JOptionPane;
/**
 * Write a description of class Hello1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hello1
{
 public static void main(String[] args){
    String name = JOptionPane.showInputDialog("What is your name? ");
    System.out.println("Hello " +name);
    } 
}
