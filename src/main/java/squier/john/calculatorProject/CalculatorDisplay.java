package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorDisplay {


    public void displayCurrentState(String currentValue) {
        System.out.printf("\n\n-----------------\n");
        System.out.printf("CURRENT VALUE: %s\n", currentValue);
    }

    public void displayAvailableOperations(String availableOperations) {
        System.out.printf("\nOPERATIONS AVAILABLE\n");
        System.out.printf("--------------------\n");
        System.out.println(availableOperations);
    }

    public void displayInputPrompt() {
        System.out.printf("INPUT IN THE FORM:<operation> <number>\n");
        System.out.printf("                  <operation>\n");
        System.out.printf("                  <number>\n");
        System.out.printf(">>>> ");
    }
}
