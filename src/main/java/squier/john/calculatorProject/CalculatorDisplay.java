package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorDisplay {


    public void displayCurrentState(double currentValue) {
        System.out.printf("CURRENT VALUE: %f\n", currentValue);
    }

    public void displayAvailableOperations(String availableOperations) {
        System.out.printf("\nOPERATIONS AVAILABLE\n");
        System.out.println(availableOperations);
    }

    public void displayInputPrompt() {
        System.out.printf("INPUT IN THE FORM:<operation> <number>\n");
        System.out.printf(">>>> ");
    }
}
