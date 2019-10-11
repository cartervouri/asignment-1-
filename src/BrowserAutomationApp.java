/**
 * This application takes in commands from a command line and causes a web
 * browser to perform that command (like opening a web page, clicking a link,
 * navigating to a previous page, etc.).
 * 
 *
 * @author jpratt
 *
 */
public class BrowserAutomationApp {

    private static final String PROMPT = "> ";

    private Browzbot browzbot;

    private final UserInterface ui;


    /**
     * TODO: create a BrowserAutomationApp constructor
     * 
     * signature: BrowserAutomationApp(UserInterface)
     * 
     * Takes in a UserInterface object to use to interact with 
     * the user via the console. 
     * 
     * @param (UserInterface) - the UserInterface object to use in this app
     * 
     */
    // your constructor goes here


    public BrowserAutomationApp(UserInterface ui2) {
        // TODO Auto-generated constructor stub
    }



    /**
     * TODO: complete the public BrowserAutomationApp method "run"
     * 
     * signature: run()
     * 
     * - displays a welcome message,
     * - asks the user which browser they'd like to use (though only Chrome
     * will be recognized!) and initializes the browzbot field by calling its
     * constructor
     * - keeps accepting commands from the console until the user indicates
     * they want to quit [this is the interactWithUserUntilTheyQuit method;
     * you'll need to complete it], and then
     * - thanks the user
     * 
     * Apart from the constructor, this should be the only public method
     * in this class.
     *
     * To get full design marks, you should create a number of private
     * helper methods that perform these steps - don't just dump all your
     * code in here!
     * 
     */
    public void run() {

        // display a welcome message

        // ask which browser to use and initializes browzbot via constructor

        interactWithUserUntilTheyQuit();

        // display a thank you message

    }



    /**
     * TODO: complete the userWishesToContinue and processResponse methods used in this code
     * 
     */
    private void interactWithUserUntilTheyQuit() {

        String userResponse = ui.stringFromUser(PROMPT);

        while (userWishesToContinue(userResponse)) {
            processResponse(userResponse);

            userResponse = ui.stringFromUser(PROMPT);
        }

    }


    /**
     * TODO: create a private BrowserAutomationApp method "userWishesToContinue"
     * 
     * signature: userWishesToContinue(String)
     * 
     * Returns true if the userResponse indicates that the user wishes to stop 
     * the application. (i.e. entered "stop" in any case)
     * 
     * This is a single line of code!
     * 
     * @param (String) - the thing the user entered into the console
     * 
     * @return (boolean) - true if and only if the user entered "stop" (case insensitive)
     * 
     */
    // your userWishesToContinue goes here


    /**
     * TODO: create a private BrowserAutomationApp method "processResponse"
     * 
     * signature: processResponse(String)
     * 
     * Takes in the text entered at the console then:
     *   - turns it into an Instruction,
     *   - has the browzbot run that Instruction, and
     *   - displays the Result returned by the bot after it runs that instruction
     * 
     * @param (String) - the text from the console to process 
     * 
     */
    // your processResponse goes here

}
