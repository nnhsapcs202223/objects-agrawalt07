 /**
 * Write a description of class String2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class String2
{
    public static void main(String[] args){
      String animal1 = new String( "quick brown fox" );
      String animal2 = new String( "lazy dog" );
      String article = new String( "the" );
      String action = new String( "jumps over" );
      article = article.concat(" ").concat(animal1).concat(" ").concat(action).concat(" ").concat(article).concat(" ").concat(animal2).concat(".");
      System.out.println(article);        
      String article1 = article+(" ")+(animal1)+(" ")+(action)+(" ")+(article)+(" ")+(animal2)+(".");
      System.out.println(article);
      
      
      
      String sentence1 = new String( "      abc   " );
      String sentence2 = new String( "   def" );
      String sentence3 = new String( "ghi         " );
       

      System.out.println(sentence1.trim()+sentence2.trim()+sentence3.trim());      
    }
}
