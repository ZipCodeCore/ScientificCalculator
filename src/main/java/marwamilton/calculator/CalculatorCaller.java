package marwamilton.calculator;

/**
 * Created by mkulima on 1/14/17.
 */
public class CalculatorCaller {


    public static void main(String[] args) {
        // init the display manager object
        DisplayManager dm  = new DisplayManager();
        InputParser ip = new InputParser();

        dm.newCalculatorStartMessage();
        String got = dm.getUserInput();
        //
        dm.CalculatorMessage(got);

        String num1 = ip.splitInput(got)[0];
        String num2 = ip.splitInput(got)[1];
        //String operationType = ip.determineOperationType(got);
        //System.out.println(ip.splitInput(got)[2]);

    }


}
