import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * Write a description of class Hello_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Hello2
{
   public static void main(String[] args) throws Exception
   {
ptionPane.showMessageDialog("data:image/png;base64,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, "Hi", "Title", JOptionPane.PLAIN_MESSAGE,
            new ImageIcon(imageLocatioOGYvPcHq76JIjKr6d3EFEnbkooWno9pTHuYjrdQYgUloWpUPYE5du1953wHRUyxvYaUbhm9wv8Eiomdiq16TEaCNveQhvhlEBbTEe3NPBQHGsQUT1xlip1RxMK0SITCjESn));
   }
}
