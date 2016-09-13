package Ragonese.Ken.ScientificCalculator;

import static Ragonese.Ken.ScientificCalculator.ScientificCalculator.*;

/**
 * Created by kenragonese on 9/12/16.
 */
public class AdvancedFunctions {
    public void advancedFunctions() {
        int command = scanner.nextInt();

        switch (command) {
            case 1:
                mostRecentValue = executor.square(mostRecentValue);
                System.out.println("The square of this number is: " + mostRecentValue);
                System.out.println("");
                break;
            case 2:
                mostRecentValue = executor.sqRoot(mostRecentValue);
                System.out.println("The square root of this number is: " + mostRecentValue);
                System.out.println("");
                break;
            case 3:
                valueInput();
                mostRecentValue = executor.exponent(mostRecentValue, secondNumber);
                System.out.println("The first value to the power of the second value: " + mostRecentValue);
                System.out.println("");
                break;
            case 4:
                mostRecentValue = executor.inverse(mostRecentValue);
                System.out.println("The square root of this number is: " + mostRecentValue);
                System.out.println("");
                break;
            case 5:
                mostRecentValue = executor.factorial(mostRecentValue);
                System.out.println("The factorial of this number is: " + mostRecentValue);
                System.out.println("");
                break;
            case 6:
                mostRecentValue = executor.log(mostRecentValue);
                System.out.println("The log of this number is: " + mostRecentValue);
                System.out.println("");
                break;
            case 7:
                mostRecentValue = executor.inverseLog(mostRecentValue);
                System.out.println("The inverse log of this number is: " + mostRecentValue);
                System.out.println("");
                break;
            case 8:
                mostRecentValue = executor.naturalLog(mostRecentValue);
                System.out.println("The natural log of this number is: " + mostRecentValue);
                System.out.println("");
                break;
            case 9:
                mostRecentValue = executor.inverseNaturalLog(mostRecentValue);
                System.out.println("The inverse natural log this number is: " + mostRecentValue);
                System.out.println("");
                break;
            default:
                System.out.println("*****************************");
                System.out.println("Function name not recognized.");
                System.out.println("*****************************");
        }
    }
}