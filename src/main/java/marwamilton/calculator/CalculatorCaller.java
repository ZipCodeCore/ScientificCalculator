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

    static {
        pso = new SimpleOperation();                                // init the display manager object
        ip = new InputParser();                                     // init input parser
        dm = new DisplayManager();                                  //  init display manager
        exitFlag = false;
        clearScreen = false;
        invalidInput = false;
    }


    public static void main(String[] args) throws IOException {

        dm.newCalculatorStartMessage();                             // show calculator start up message

        while (exitFlag==false){

            String userString = dm.getUserInput();                  // prompt user for input
            exitFlag = ip.exitFlagCheck(userString);                // determine whether to exit or proceed
            if(exitFlag) break;                                     // break if exitFlag is true

            invalidInput = ip.invalidInputCheck(userString);
            while(invalidInput){
                System.out.println("Err");
                userString = dm.getUserInput();
                invalidInput = ip.invalidInputCheck(userString);
            }  // end validation______________________________________________________________________

            clearScreen = ip.clearScreenCheck(userString);
            while (clearScreen) {
                System.out.println("delete this message once clear screen functionality implemented");
                clearScreenMethod();                                // run clear screen method
                userString = dm.getUserInput();                     // get new user input
                clearScreen = ip.clearScreenCheck(userString);      // update clearScreen boolean
            }  // end clearScreen_____________________________________________________________________

            pso.nums = ip.splitInput(userString);                          // pass user nums as array to simpleOperation
            pso.desiredOperation = ip.determineOperationType(userString);  // pass user's operator to pso

            dm.displayOperationResult(ip.splitInput(userString), ip.determineOperationType(userString), pso.runUserOperation());                    // display operation result
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


} // end CalculatorCaller class
