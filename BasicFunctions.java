package Ragonese.Ken.ScientificCalculator;

import static Ragonese.Ken.ScientificCalculator.ScientificCalculator.*;

/**
 * Created by kenragonese on 9/12/16.
 */
public class BasicFunctions {
    public void basicFunctions() {
        String commandString = scanner.next();
        if (commandString.equals("a")) {
            valueInput();
            mostRecentValue = executor.add(mostRecentValue, secondNumber);
            System.out.println("The sum of these two numbers is: " + mostRecentValue);
            System.out.println("");
        } else if (commandString.equals("s")) {
            valueInput();
            mostRecentValue = executor.subtract(mostRecentValue, secondNumber);
            System.out.println("The difference of these two numbers is: " + mostRecentValue);
            System.out.println("");
        } else if (commandString.equals("m")) {
            valueInput();
            mostRecentValue = executor.multiply(mostRecentValue, secondNumber);
            System.out.println("The product of these two numbers is: " + mostRecentValue);
            System.out.println("");
        } else if (commandString.equals("d")) {
            valueInput();
            mostRecentValue = executor.divide(mostRecentValue, secondNumber);
            System.out.println("The quotient of these two numbers is: " + mostRecentValue);
            System.out.println("");
        }
    }
}
