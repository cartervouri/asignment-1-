import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Browzbot {

    private static final Set<String> KNOWN_0_ARG_COMMANDS = Set.of("STOP", "BACK", "FORWARD");
    private static final Set<String> KNOWN_1_ARG_COMMANDS = Set.of("OPEN", "SHOOT", "WAIT");
    private static final Set<String> KNOWN_2_ARG_COMMANDS = Set.of("CLICK", "FILL", "SELECT");

    WebDriver driver;

    /**
     * This constructor is only used to make a Browzbot object for automated
     * testing. Don't try and do anything else with this sucker, 'cause it'll blow
     * up - HARD.
     * 
     * For God's sake - think of the children.
     */
    public Browzbot() {
        driver = new NullWebDriver();
    }

    /**
     * This constructor takes in the name of a browser (like "chrome", or "firefox",
     * or "safari") and then creates a bot that uses that kind of browser.
     * 
     * For simplicity's sake, this constructor actually only recognizes "chrome" -
     * any other type of entry will just create a bot connected to a NullWebDriver.
     * It's not that I'm a Chrome fanboy - it's just that I was able to have the
     * most success (i.e. least frustration) driving Chrome.
     * 
     */
    public Browzbot(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            this.driver = new ChromeDriver();
        } else {
            driver = new NullWebDriver();
        }
    }

    
    /**
     * 
     * TODO: create a public Browzbot method "run"
     * 
     * signature: run(Instruction)
     * 
     * Takes in an Instruction and returns a Result indicating the status 
     * of the attempt at running it.
     * 
     * In addition, if the instruction has no errors, then the valid
     * instruction should be passed to the handle method before the
     * Result is returned!
     * 
     * IMPORTANT: you MUST use the handle method in this run method!
     * 
     * NOTE: I am not a big fan of this kind of method, where something is
     * both being RETURNED (a Result) and DONE (handling of the instruction
     * if it is valid). But it is something that is fairly common, and it's
     * often harder to do things the "right" way sometimes.
     * 
     * @param (Instruction) - an instruction for this Browzbot to run
     * 
     * @return (Result) - the result of 
     * 
     */
    // your run goes here
    public Result run(Instruction instruction) {
        if(instruction.command().equals("")) {
            return new Result(1,"empty Instuction");
          
        }
        if(instruction.command())
    }

    
    
    
    /**
     * TODO: complete the private Browzbot method "handle"
     * 
     * signature: handle(Instruction)
     * 
     * Takes in an Instruction and then performs an action based
     * on the command part of that instruction.
     * 
     * The first part (with the fugly looking "instanceof") has been
     * done for you - you've got to do the rest!
     * 
     * If the command part of the instruction is not recognized, no
     * action is performed! (So, for example, if the command was
     * "MAMBO!", nothing would happen.)
     * 
     * @param (Instruction) - an instruction for this Browzbot to run
     * 
     */
    private void handle(Instruction instruction) {
        if (this.driver instanceof NullWebDriver) {
            return;
        }

        // your code goes here
        
    }


    
    private boolean isKnownCommand(String command) {
        if
    }
    // --------------------------------------------------------------------------    
    //
    // The following helper methods are all complete, so don't change 'em!
    // You'll need them int YOUR methods, so you'll need to understand
    // **what** they do - but don't necessarily worry about **how** they do it.
    //

    // Fills a form field that has a given id with a given value.
    // 
    // fieldId is case sensitive, yo
    //
    private void fillFormField(String fieldId, String fieldValue) {
        try {
            WebElement formField = driver.findElement(By.id(fieldId));
            forceClick(formField);
            formField.sendKeys(fieldValue);
        } catch (NoSuchElementException e) {
            // fail silently...so unhelpful
        }

    }

    // Clicks something on the webpage that has a given id.
    // 
    // id is case sensitive!
    //
    private void clickById(String id) {
        try {
            WebElement thingToClick = driver.findElement(By.id(id));
            forceClick(thingToClick);
        } catch (NoSuchElementException e) {
            // fail silently...sob
        }
    }

    // Clicks the FIRST thing on the webpage that has a given html class.
    // 
    // htmlClass is case sensitive!
    //
    private void clickByClass(String htmlClass) {
        try {
            WebElement thingToClick = driver.findElement(By.cssSelector(htmlClass));
            forceClick(thingToClick);
        } catch (NoSuchElementException e) {
            // fail silently...fail-ridden
        }
    }

    // Takes a screenshot of what is currently showing in the browser, saving
    // it to a file called "<screenshotName>.jpg". This file is saved in
    // the root of the Eclipse project directory.
    //
    private void takeScreenshot(String screenshotName) {
        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

        try {
            Files.copy(srcFile, new File(screenshotName));
        } catch (IOException e) {
            // fail silently...so shameful
        }

    }

    // Goes to a dropdown (<SELECT> tag, if you're speaking HTML) with a given
    // id (case sensitive) on the webepage and then selects the thing in it
    // (<OPTION> tag) that has a given text value.
    //
    private void selectFromDropdown(String dropdownId, String selectedItem) {
        try {
            Select select = new Select(driver.findElement(By.id(dropdownId)));
            select.selectByVisibleText(selectedItem);
        } catch (NoSuchElementException e) {
            // fail silently...wracked by guilt
        }

    }

    // Clicks on a link that has the given text (case sensitive). 
    //
    // The text will match *partially* - that is, if the link says "Art Collection",
    // a user could actually get a match with simply "Ar"!
    //
    private void clickLink(String linkText) {
        try {
            WebElement link = driver.findElement(By.partialLinkText(linkText));
            forceClick(link);
        } catch (NoSuchElementException e) {
            // fail silently...I feel dirty
        }

    }
    
    
    // A hack that *really* makes sure that a click is attempted.
    //
    // You never have to worry about using this method directly yourself!
    //
    private void forceClick(WebElement elem) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", elem);
    }

    // Activates the browser's "back" button. 
    //
    private void navigateBack() {
        driver.navigate().back();
    }

    // Activates the browser's "forward" button. 
    //
    private void navigateForward() {
        driver.navigate().forward();
    }

    // Waits for the given number of miliseconds. 
    //
    private void wait(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            // fail silently...don't do this on the job, folks
        }
    }

    // Opens the given url.
    //
    // IMPORTANT: the url **must** start with "http://"!
    //
    // So, for example, if you wanted to go to imdb.com, the
    // url coming into this method MUST be "http://imdb.com
    //
    private void open(String url) {
        try {
            driver.get(url);
        } catch (WebDriverException e) {
            // fail silently...to protect the innocent
        }
    }

    // Closes the browser.
    //    
    private void quit() {
        driver.quit();
    }

    

}
