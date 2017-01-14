package marwamilton.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mkulima on 1/14/17.
 */
public class InputParser {
    // regex pattern to match possible operations
    Pattern operationPattern = Pattern.compile("[\\+\\-\\*\\/]");


    // splits user input into string array with the 2 numbers
    public String[] splitInput(String userInput){
        return userInput.split("[\\+\\-\\*\\/]");
    } // end splitString method _______________________________________________________

    // parses user input and returns desired operation
    public String determineOperationType(String userInput){
        Matcher charMatcher = operationPattern.matcher(userInput);
        if(charMatcher.find()){
            String foundChar = charMatcher.group();
            return foundChar;
        } else {
        return "Unknown operation type"; }
    } // end determineOperationType method ____________________________________________

} // end class
