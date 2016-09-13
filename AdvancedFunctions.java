package Ragonese.Ken.ScientificCalculator;

import static Ragonese.Ken.ScientificCalculator.ScientificCalculator.*;

/**
 * Created by kenragonese on 9/12/16.
 */
public class AdvancedFunctions {
    public void advancedFunctions(){
        String commandString = scanner.next();
        if (commandString.equals("s")) {
            if (useMostRecent()) {
                mostRecentValue = executor.square(mostRecentValue);
                System.out.println("The square of this number is: " + mostRecentValue);
                System.out.println("");
            } else {
                System.out.println("Input a value");
                firstNumber = scanner.nextDouble();
                mostRecentValue = executor.square(firstNumber);
                System.out.println("The square of this number is: " + mostRecentValue);
                System.out.println("");
            }
        } else if (commandString.equals("r")) {
            if (useMostRecent()) {
                mostRecentValue = executor.sqRoot(mostRecentValue);
                System.out.println("The square root of this number is: " + mostRecentValue);
                System.out.println("");
            } else {
                System.out.println("Input a value");
                firstNumber = scanner.nextDouble();
                mostRecentValue = executor.sqRoot(firstNumber);
                System.out.println("The square root of this number is: " + mostRecentValue);
                System.out.println("");
            }
        } else if (commandString.equals("e")) {
            if (useMostRecent()) {
                xValueIsMostRecent();
                mostRecentValue = executor.exponent(mostRecentValue, secondNumber);
                System.out.println("The first value to the power of the second value: " + mostRecentValue);
                System.out.println("");
            } else {
                notUsingMostRecent();
                mostRecentValue = executor.exponent(firstNumber, secondNumber);
                System.out.println("The first value to the power of the second value is: " + mostRecentValue);
                System.out.println("");
            }
        }
        else if (commandString.equals("i")) {
            if (useMostRecent()) {
                mostRecentValue = executor.inverse(mostRecentValue);
                System.out.println("The square root of this number is: " + mostRecentValue);
                System.out.println("");
            } else {
                System.out.println("Input a value");
                firstNumber = scanner.nextDouble();
                mostRecentValue = executor.inverse(firstNumber);
                System.out.println("The square root of this number is: " + mostRecentValue);
                System.out.println("");
            }
        }
        else if (commandString.equals("f")) {
            if (useMostRecent()) {
                mostRecentValue = executor.factorial(mostRecentValue);
                System.out.println("The factorial of this number is: " + mostRecentValue);
                System.out.println("");
            } else {
                System.out.println("Input a value");
                firstNumber = scanner.nextDouble();
                mostRecentValue = executor.factorial(firstNumber);
                System.out.println("The factorial of this number is: " + mostRecentValue);
                System.out.println("");
            }
        }


    }
}
