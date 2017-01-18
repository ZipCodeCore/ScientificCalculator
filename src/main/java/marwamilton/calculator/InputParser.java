package marwamilton.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mkulima on 1/14/17.
 */
public class InputParser {

    Pattern operationPattern = Pattern.compile("[\\+\\-\\*\\/\\^\\<]");     // match possible operations
    Pattern exitPattern = Pattern.compile("[x]");                           // match possible exit flags
    Pattern clearScreenPattern = Pattern.compile("[c]");                    //
    Pattern validInputsPattern = Pattern.compile("[cx\\+\\-\\*\\/\\^\\<]");
    Pattern ansPattern = Pattern.compile(".*\\bans\\b.*");                  // use previous ans

    Matcher operationMatcher;
    Matcher exitMatcher;
    Matcher clearScreenMatcher;
    Matcher validInputsMatcher;
    Matcher ansMatcher;

    // splits user input into string array with the 2 numbers
    public String[] splitInput(String userInput){
        return userInput.split("[\\+\\-\\*\\/\\^\\<]");
    } // end splitString__________________________________________________________________

    // parses user input and returns desired operation
    public String determineOperationType(String userInput){
        operationMatcher = operationPattern.matcher(userInput);
        if(operationMatcher.find()){
            String foundChar = operationMatcher.group();
            return foundChar;
        } else {
        return "Unknown operation type"; }
    } // end determineOperationType________________________________________________________

    // checks for user initiated exit
    boolean exitFlagCheck( String userInput){
        exitMatcher = exitPattern.matcher(userInput);
        if(exitMatcher.find()){
            return true;
        } else {
            return false; }
    } // end exitFlagCheck_________________________________________________________________

    // checks for user initiated clear screen
    boolean clearScreenCheck(String userInput){
        clearScreenMatcher = clearScreenPattern.matcher(userInput);
        if(clearScreenMatcher.find()){
            return true;
        } else {
            return false;
        }
    } // end clearScreenCheck______________________________________________________________

    boolean invalidInputCheck(String userInput){
        validInputsMatcher= validInputsPattern.matcher(userInput);
        ansMatcher = ansPattern.matcher(userInput);
        if(validInputsMatcher.find() || ansMatcher.find()){
            return false;
        } else {
            return true;
        }
    } // end invalidInputCheck_____________________________________________________________

} // end class
