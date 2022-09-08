
/**
 * Exploring the String class and its methods.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringExplorer
{
    public static void main(String[] args)
    {
        String river = new String("Misissipi");
        System.out.println(river);
        
        river = river.replace('s', 'p');
        
        System.out.println(river);
        
        /*
         * The replace method return a reference to a new String object. 
         * It does not change the String object on which it is invoked:
         * The String class doesn't have mutator methods. It is not 
         * possible to change a String object 
         * 
         * Strings are immutable
         */
    }
}
