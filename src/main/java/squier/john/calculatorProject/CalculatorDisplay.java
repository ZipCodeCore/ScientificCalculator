package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorDisplay {


    public void displayCurrentState(String currentValue, DisplayModes displayMode) {
        System.out.printf("\n\n-----------------\n");

        if ( displayMode.equals(DisplayModes.BINARY) ) {
            System.out.printf("CURRENT VALUE: %s\n", Double.doubleToLongBits(Double.parseDouble(currentValue)));
        }
        else if ( displayMode.equals(DisplayModes.DECIMAL) ) {
            System.out.printf("CURRENT VALUE: %s\n", currentValue);
        }
        else if ( displayMode.equals(DisplayModes.HEXADECIMAL) ) {
            System.out.printf("CURRENT VALUE: %s\n", Double.toHexString(Double.parseDouble(currentValue)));
        }
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
