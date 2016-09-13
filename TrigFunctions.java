package Ragonese.Ken.ScientificCalculator;

import static Ragonese.Ken.ScientificCalculator.ScientificCalculator.*;

/**
 * Created by kenragonese on 9/12/16.
 */
public class TrigFunctions {
    public void trigFunctions() {

        String commandString = scanner.next();

        if (commandString.equals("s")) {
            if (useMostRecent()) {
                mostRecentValue = executor.sine(mostRecentValue);
                System.out.println("The sine of this number is: " + mostRecentValue);
                System.out.println("");
            } else {
                System.out.println("Input a value");
                firstNumber = scanner.nextDouble();
                mostRecentValue = executor.sine(firstNumber);
                System.out.println("The sine of this number is: " + mostRecentValue);
                System.out.println("");
            }
        }
        else if (commandString.equals("i")) {
            if (useMostRecent()) {
                mostRecentValue = executor.inverseSine(mostRecentValue);
                System.out.println("The inverse sine of this number is: " + mostRecentValue);
                System.out.println("");
            } else {
                System.out.println("Input a value");
                firstNumber = scanner.nextDouble();
                mostRecentValue = executor.inverseSine(firstNumber);
                System.out.println("The inverse sine of this number is: " + mostRecentValue);
                System.out.println("");
            }
        }
        else if (commandString.equals("c")) {
            if (useMostRecent()) {
                mostRecentValue = executor.cosine(mostRecentValue);
                System.out.println("The cosine of this number is: " + mostRecentValue);
                System.out.println("");
            } else {
                System.out.println("Input a value");
                firstNumber = scanner.nextDouble();
                mostRecentValue = executor.cosine(firstNumber);
                System.out.println("The cosine of this number is: " + mostRecentValue);
                System.out.println("");
            }
        }
        else if (commandString.equals("o")) {
            if (useMostRecent()) {
                mostRecentValue = executor.inverseCosine(mostRecentValue);
                System.out.println("The inverse cosine of this number is: " + mostRecentValue);
                System.out.println("");
            } else {
                System.out.println("Input a value");
                firstNumber = scanner.nextDouble();
                mostRecentValue = executor.inverseCosine(firstNumber);
                System.out.println("The inverse cosine of this number is: " + mostRecentValue);
                System.out.println("");
            }
        }
        else if (commandString.equals("t")) {
            if (useMostRecent()) {
                mostRecentValue = executor.tangent(mostRecentValue);
                System.out.println("The tangent of this number is: " + mostRecentValue);
                System.out.println("");
            } else {
                System.out.println("Input a value");
                firstNumber = scanner.nextDouble();
                mostRecentValue = executor.tangent(firstNumber);
                System.out.println("The tangent of this number is: " + mostRecentValue);
                System.out.println("");
            }
        }
        else if (commandString.equals("a")) {
            if (useMostRecent()) {
                mostRecentValue = executor.inverseTangent(mostRecentValue);
                System.out.println("The inverse tangent of this number is: " + mostRecentValue);
                System.out.println("");
            } else {
                System.out.println("Input a value");
                firstNumber = scanner.nextDouble();
                mostRecentValue = executor.inverseTangent(firstNumber);
                System.out.println("The inverse tangent of this number is: " + mostRecentValue);
                System.out.println("");
            }
        }
    }
}