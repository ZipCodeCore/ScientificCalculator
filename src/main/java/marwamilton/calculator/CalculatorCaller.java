package marwamilton.calculator;

import java.io.IOException;

/**
 * Created by mkulima on 1/14/17.
 */
public class CalculatorCaller {
    static DisplayManager dm;
    static InputParser ip;
    static SimpleOperation pso;
    static Boolean exitFlag;
    static Boolean clearScreen;
    static Boolean invalidInput;
    static double ans;
    static String[] uncheckedSplitInput;
    static String[] checkedSplitInput;

    static {
        pso = new SimpleOperation();                                // init the display manager object
        ip = new InputParser();                                     // init input parser
        dm = new DisplayManager();                                  //  init display manager
        exitFlag = false;
        clearScreen = false;
        invalidInput = false;
        ans = 0;
        uncheckedSplitInput = new String[]{"0","0"};
        checkedSplitInput = new String[]{"0","0"};
    }


    public static void main(String[] args) throws IOException {

        dm.newCalculatorStartMessage();                             // show calculator start up message

        while (exitFlag==false){

            String userString = dm.getUserInput();                  // prompt user for input

            clearScreen = ip.clearScreenCheck(userString);          // apparently need to do this before exit
            while (clearScreen) {
                System.out.println("delete this message once clear screen functionality implemented");
                clearScreenMethod();                                // run clear screen method
                userString = dm.getUserInput();                     // get new user input
                clearScreen = ip.clearScreenCheck(userString);      // update clearScreen boolean
            }  // end clearScreen_____________________________________________________________________

            exitFlag = ip.exitFlagCheck(userString);                // determine whether to exit or proceed
            if(exitFlag) break;                                     // break if exitFlag is true

            invalidInput = ip.invalidInputCheck(userString);
            while(invalidInput){
                System.out.println("Err");
                userString = dm.getUserInput();
                invalidInput = ip.invalidInputCheck(userString);
            }  // end validation______________________________________________________________________

            uncheckedSplitInput = ip.splitInput(userString);          // split user input into array with 2 nums
            checkedSplitInput = usePreviousResultValue(uncheckedSplitInput, ans);   // check if one of the 2 array values is "ans" and assign the right value
            pso.nums = checkedSplitInput;                             // then pass user nums as array to simpleOperation
            pso.desiredOperation = ip.determineOperationType(userString);  // pass user's operator to pso
            ans = pso.runUserOperation();

            dm.displayOperationResult(ip.splitInput(userString), ip.determineOperationType(userString), ans);                    // display operation result
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

    public static void clearScreenMethod2(){
        System.out.print("\033[2J");
    }

    public static String[] usePreviousResultValue(String[] splitString, double previousOperationResult){
        //String[] splitStringWithAns = new String[]{"",""};
        if(splitString[0].equals("ans"))
            splitString[0] = Double.toString(previousOperationResult);

        if (splitString[1].equals("ans"))
            splitString[1] = Double.toString(previousOperationResult);

        return splitString;
    }

} // end CalculatorCaller class
