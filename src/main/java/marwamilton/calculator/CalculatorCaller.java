package marwamilton.calculator;

import java.io.IOException;

/**
 * Created by mkulima on 1/14/17.
 */
public class CalculatorCaller {
    static DisplayManager displayManager;
    static InputParser inputParser;
    static SimpleOperation simpleOperation;
    static Boolean exitFlag;
    static Boolean clearScreen;
    static Boolean invalidInput;
    static double ans;
    static String[] uncheckedSplitInput;
    static String[] checkedSplitInput;
    static String formatSpecified;

    static {
        simpleOperation = new SimpleOperation();                                // init the display manager object
        inputParser = new InputParser();                                     // init input parser
        displayManager = new DisplayManager();                                  //  init display manager
        exitFlag = false;
        clearScreen = false;
        invalidInput = false;
        ans = 0;
        uncheckedSplitInput = new String[]{"0","0"};
        checkedSplitInput = new String[]{"0","0"};
        formatSpecified = "double";
    }


    public static void main(String[] args) throws IOException {

        displayManager.newCalculatorStartMessage();                             // show calculator start up message

        while (exitFlag==false){

            String userString = displayManager.getUserInput();                  // prompt user for input

            clearScreen = inputParser.clearScreenCheck(userString);          // apparently need to do this before exit
            while (clearScreen) {
                System.out.println("delete this message once clear screen functionality implemented");
                clearScreenMethod();                                // run clear screen method
                userString = displayManager.getUserInput();                     // get new user input
                clearScreen = inputParser.clearScreenCheck(userString);      // update clearScreen boolean
            }  // end clearScreen_____________________________________________________________________

            exitFlag = inputParser.exitFlagCheck(userString);                // determine whether to exit or proceed
            if(exitFlag) break;                                     // break if exitFlag is true

            invalidInput = inputParser.invalidInputCheck(userString);
            while(invalidInput){
                System.out.println("Err");
                userString = displayManager.getUserInput();
                invalidInput = inputParser.invalidInputCheck(userString);
            }  // end validation______________________________________________________________________

            uncheckedSplitInput = inputParser.splitInput(userString);          // split user input into array with 2 nums
            checkedSplitInput = usePreviousResultValue(uncheckedSplitInput, ans);   // check if one of the 2 array values is "ans" and assign the right value
            simpleOperation.nums = checkedSplitInput;                             // then pass user nums as array to simpleOperation
            simpleOperation.desiredOperation = inputParser.determineOperationType(userString);  // pass user's operator to simpleOperation
            ans = simpleOperation.runUserOperation();

            displayManager.displayOperationResult(inputParser.splitInput(userString), inputParser.determineOperationType(userString), ans, "E2");                    // display operation result
            formatSpecified = userSpecifiedFormatChange();
        }
        return;

    } // end CalculatorCaller main ________________________________________________________________________________________________

    public static void clearScreenMethod() throws IOException {
        try {
            Process p = Runtime.getRuntime().exec("clear");
        } catch (IOException e) {
            // handle exception TO DO
            System.out.println("Failed to clear screen!\n" + e.getMessage());
        }
    } // end clear screen method _________________________________________________________________________________________________


    public static String[] usePreviousResultValue(String[] splitString, double previousOperationResult){
        //String[] splitStringWithAns = new String[]{"",""};
        if(splitString[0].equals("ans"))
            splitString[0] = Double.toString(previousOperationResult);

        if (splitString[1].equals("ans"))
            splitString[1] = Double.toString(previousOperationResult);

        return splitString;
    }  // end usePreviousResultValue______________________________________________________________________________________________

    public static String userSpecifiedFormatChange(){
        System.out.println();
        System.out.println("To change number format, type one of: \n" +
                            " [double] or [D2] or [E2] ");
        return displayManager.getUserInput();
    }

} // end CalculatorCaller class
