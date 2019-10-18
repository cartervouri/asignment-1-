import java.util.Scanner; 

public class Instruction {

    private String command; 
    private String argumentOne; 
    private String argumentTwo; 


    public Instruction(String userInput) {
        Scanner textScanner = new Scanner(userInput); 

        this.command = tokenOne(textScanner).toUpperCase(); 
        this.argumentOne = tokenTwo(textScanner).replaceAll("\\s+", " ");
        this.argumentTwo = tokenThree(textScanner).replaceAll("\\s+", " ");
    }

    private String tokenOne(Scanner textScanner) {
        if (textScanner.hasNext()) {
            return textScanner.next(); 
        } else {
            return ""; 
        }
    }
    
    private String tokenTwo(Scanner textScanner) {
        if (textScanner.hasNext()) {
            return textScanner.next().substring(0); 
        } else {
           
           
            return ""; 
        }

    }
    
    private String tokenThree(Scanner textScanner) {
        if (textScanner.hasNext()) { 
            return textScanner.nextLine().trim(); 
        } else {
            return ""; 
        }

    }
    
    public String command() {

        return command;
    }

    public String argumentOne() {

        return argumentOne;
    }


    public String argumentTwo() {

        return argumentTwo;
    }
}
