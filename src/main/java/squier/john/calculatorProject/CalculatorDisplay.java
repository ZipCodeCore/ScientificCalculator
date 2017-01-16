package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorDisplay {


    public void displayCurrentState(String currentValue, String memoryValue,
                                    DisplayModes displayMode) {
        displayPrettyLine();
        displayCurrentValueLine(currentValue, displayMode);
        displayPrettyLine();
        displayMemoryValueLine(memoryValue, displayMode);
        displayPrettyLine();
    }

    private void displayCurrentValueLine(String value, DisplayModes displayMode) {

        if ( displayMode.equals(DisplayModes.DECIMAL) ) {
            System.out.printf("| CURRENT VALUE | %29s |\n", value);
        }
        else {
            System.out.printf("| CURRENT VALUE | %29s |\n",
                    Double.toHexString(Double.parseDouble(value)));
        }
    }

    private void displayMemoryValueLine(String value, DisplayModes dispalyMode) {

        if ( dispalyMode.equals(DisplayModes.DECIMAL) ) {
            System.out.printf("|  MEMORY VALUE | %29s |\n", value);
        }
        else {
            System.out.printf("|  MEMORY VALUE | %29s |\n",
                    Double.toHexString(Double.parseDouble(value)));
        }
    }

    public void displayAvailableOperations(DisplayModes displayMode,
                                           TrigModes trigMode) {
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
        System.out.printf("|  sdm (%s)  |  stu (%s)  |     pi    |    e      |\n",
                displayMode.equals(DisplayModes.DECIMAL) ? "d" : "x",
                trigMode.equals(TrigModes.DEGREES) ? "d" : "r");
        displayPrettyLine();
        System.out.printf("|                     exit                      |\n");
        displayPrettyLine();
    }

    public void displayInputPrompt() {
        System.out.printf("| >>>>");
    }

    private void displayPrettyLine() {
        System.out.printf("*-----------------------------------------------*\n");
    }
}

