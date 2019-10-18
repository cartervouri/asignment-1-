    import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
    
   
/**
 * This class is used to get input from the user and to provide
 * output.
 * 
 * By default, this class reads from they keyboard and writes to console,
 * but you can create a UserInterface object that reads from any 
 * InputStream and writes to any PrintStream. This is super-useful
 * when doing any kind of automated testing. Just saying.
 * 
 * @author jpratt
 *
 */
public class UserInterface {

    private final PrintStream outputStream;
    private final Scanner scanner;
    
    
    
    public UserInterface() {
        this(System.in, System.out);
    }

    public UserInterface(InputStream inputStream, PrintStream outputStream) {
        this.outputStream = outputStream;
        scanner = new Scanner(inputStream);
    }

    /**
     * Write a string s to output, followed by a newline.
     * 
     * Compare to print, which does not add a newline.
     * 
     */
    public void println(String s) {
        outputStream.println(s);
    }

    /**
     * Write a string s to output.
     * 
     * Compare to print, which does not add a newline.
     * 
     */
    public void print(String s) {
        outputStream.print(s);
    }

    public String stringFromUser(String givenprompt) {
        
        return msg.trim;
 
    }

    
    /**
     * TODO: create a public UserInterface method "stringFromUser"
     * 
     * signature: stringFromUser(String)
     * 
     * This method displays a given prompt to the user 
     * (making sure the user input will stay on the same line as the prompt).
     * 
     * It then reads in the line entered by the user, removes any leading or 
     * trailing white space, and returns the resulting string.
     * 
     * @param (String) - the prompt to display to the user
     * 
     * @return (String) - the entire line of text entered at the console, minus any
     * leading and trailing white space 
     * 
     */
    // your stringFromUser goes here
    

}
