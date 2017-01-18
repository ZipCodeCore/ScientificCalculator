package marwamilton.calculator;

import java.util.Arrays;
import marwamilton.calculator.CalculatorCaller;

/**
 * Created by mkulima on 1/15/17.
 */
public class OwnDebugs {


    public static void main(String[] args) {
        InputParser ip = new InputParser();
        DisplayManager dm = new DisplayManager();
        SimpleOperation so = new SimpleOperation();
        CalculatorCaller cc = new CalculatorCaller();

        String userString = dm.getUserInput();
        System.out.println(userString);
        System.out.println(Arrays.toString(ip.splitInput(userString)));
        System.out.println(Arrays.toString(cc.usePreviousResultValue(ip.splitInput(userString), 10)));
        //so.nums = ip.splitInput(userString);

        //so.desiredOperation = ip.determineOperationType(userString);

        //System.out.println(Double.toString(so.nthRoot()));
        //System.out.println("^".equals("^"));
        //Boolean clearFlag = ip.clearScreenCheck(userString);
        //System.out.println(Boolean.toString(clearFlag));

    }
}
