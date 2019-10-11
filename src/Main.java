/**
 * DON'T CHANGE ANY CODE IN THIS CLASS, PLEASE
 * 
 * Entry point for the BrowserAutomationApp.
 * 
 * @author jpratt
 *
 */
public class Main {

    public static void main(String[] args) {

        UserInterface ui = new UserInterface();
        new BrowserAutomationApp(ui).run();

    }

}
