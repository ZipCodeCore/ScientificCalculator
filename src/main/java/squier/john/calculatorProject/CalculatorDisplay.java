package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorDisplay {


    public void displayCurrentState(String currentValue, String memoryValue, DisplayModes displayMode) {
        displayPrettyLine();
        displayCurrentValueLine(currentValue, displayMode);
        displayPrettyLine();
        displayMemoryValueLine(memoryValue, displayMode);
        displayPrettyLine();
    }

    public void displayCurrentValueLine(String value, DisplayModes mode) {
        if ( mode.equals(DisplayModes.DECIMAL) ) {
            System.out.printf("| CURRENT VALUE | %29s |\n", value);
        }
        else {
            System.out.printf("| CURRENT VALUE | %29s |\n",
                    Double.toHexString(Double.parseDouble(value)));
        }
    }

    public void displayMemoryValueLine(String value, DisplayModes mode) {
        if ( mode.equals(DisplayModes.DECIMAL) ) {
            System.out.printf("|  MEMORY VALUE | %29s |\n", value);
        }
        else {
            System.out.printf("|  MEMORY VALUE | %29s |\n",
                    Double.toHexString(Double.parseDouble(value)));
        }
    }
    public void displayAvailableOperations() {
        System.out.printf("|   clear   |     MC    |     M+    |    MRC    |\n");
        displayPrettyLine();
        System.out.printf("| + <input> | - <input> | * <input> | / <input> |\n");
        displayPrettyLine();
        System.out.printf("|   square  |    sqrt   |    inv    |    neg    |\n");
        displayPrettyLine();
        System.out.printf("|     !     | exp <ipt> |    log    |    ln     |\n");
        displayPrettyLine();
        System.out.printf("|   10^x    |    e^x    |    sin    |   asin    |\n");
        displayPrettyLine();
        System.out.printf("|    cos    |    acos   |    tan    |   atan    |\n");
        displayPrettyLine();
        System.out.printf("|    sdm    |    stu    |     pi    |    e      |\n");
        displayPrettyLine();
        System.out.printf("|                     exit                      |\n");
        displayPrettyLine();
    }

    public void displayInputPrompt() {
        System.out.printf("| >>>>");
    }

    public void displayPrettyLine() {
        System.out.printf("*-----------------------------------------------*\n");
    }
}

