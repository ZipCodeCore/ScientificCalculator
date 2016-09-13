package Ragonese.Ken.ScientificCalculator;

import static Ragonese.Ken.ScientificCalculator.ScientificCalculator.*;

/**
 * Created by kenragonese on 9/12/16.
 */
public class TrigFunctions {
    public void trigFunctions() {

        String commandString = scanner.next();

        if (commandString.equals("s")) {
            mostRecentValue = executor.sine(mostRecentValue);
            System.out.println("The sine of this number is: " + mostRecentValue);
            System.out.println("");
        }
        else if (commandString.equals("i")) {
            mostRecentValue = executor.inverseSine(mostRecentValue);
            System.out.println("The inverse sine of this number is: " + mostRecentValue);
            System.out.println("");
        }
        else if (commandString.equals("c")) {
            mostRecentValue = executor.cosine(mostRecentValue);
            System.out.println("The cosine of this number is: " + mostRecentValue);
            System.out.println("");
        }
        else if (commandString.equals("o")) {
            mostRecentValue = executor.inverseCosine(mostRecentValue);
            System.out.println("The inverse cosine of this number is: " + mostRecentValue);
            System.out.println("");
        }
        else if (commandString.equals("t")) {
            mostRecentValue = executor.tangent(mostRecentValue);
            System.out.println("The tangent of this number is: " + mostRecentValue);
            System.out.println("");
        }
        else if (commandString.equals("a")) {
            mostRecentValue = executor.inverseTangent(mostRecentValue);
            System.out.println("The inverse tangent of this number is: " + mostRecentValue);
            System.out.println("");
        }
    }
}