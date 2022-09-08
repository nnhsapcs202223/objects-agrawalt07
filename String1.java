
/**
 * Write a description of class String1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class String1
{
    public static void main(String[] args){
        String greeting = new String( "Hello, World!" );
        int n = greeting.length();
        System.out.println(n);
        String river = new String("Mississippi");
        String bigRiver = river.toUpperCase();
        System.out.println(bigRiver);
        String smallRiver = river.toLowerCase();
        System.out.println(smallRiver);
        String smallTestString = new String("tejas");
        System.out.println(smallTestString);
        String bigTestString = smallTestString.toUpperCase();
        System.out.println(bigTestString);
        
        
    }
}
