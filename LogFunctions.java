package Ragonese.Ken.ScientificCalculator;

import static Ragonese.Ken.ScientificCalculator.ScientificCalculator.*;

/**
 * Created by kenragonese on 9/12/16.
 */
public class LogFunctions {
    public void logFunctions(){
        String commandString = scanner.next();

        if (commandString.equals("l")) {
            if (useMostRecent()) {
                mostRecentValue = executor.log(mostRecentValue);
                System.out.println("The log of this number is: " + mostRecentValue);
                System.out.println("");
            } else {
                System.out.println("Input a value");
                firstNumber = scanner.nextDouble();
                mostRecentValue = executor.log(firstNumber);
                System.out.println("The log of this number is: " + mostRecentValue);
                System.out.println("");
            }
        }
        else if (commandString.equals("o")) {
            if (useMostRecent()) {
                mostRecentValue = executor.inverseLog(mostRecentValue);
                System.out.println("The inverse log of this number is: " + mostRecentValue);
                System.out.println("");
            } else {
                System.out.println("Input a value");
                firstNumber = scanner.nextDouble();
                mostRecentValue = executor.inverseLog(firstNumber);
                System.out.println("The inverse log of this number is: " + mostRecentValue);
                System.out.println("");
            }
        }
        else if (commandString.equals("n")) {
            if (useMostRecent()) {
                mostRecentValue = executor.naturalLog(mostRecentValue);
                System.out.println("The natural log of this number is: " + mostRecentValue);
                System.out.println("");
            } else {
                System.out.println("Input a value");
                firstNumber = scanner.nextDouble();
                mostRecentValue = executor.naturalLog(firstNumber);
                System.out.println("The natural log of this number is: " + mostRecentValue);
                System.out.println("");
            }
        }
        else if (commandString.equals("a")) {
            if (useMostRecent()) {
                mostRecentValue = executor.inverseNaturalLog(mostRecentValue);
                System.out.println("The inverse natural log this number is: " + mostRecentValue);
                System.out.println("");
            } else {
                System.out.println("Input a value");
                firstNumber = scanner.nextDouble();
                mostRecentValue = executor.inverseNaturalLog(firstNumber);
                System.out.println("The inverse natural log of this number is: " + mostRecentValue);
                System.out.println("");
            }
        }

    }
}
