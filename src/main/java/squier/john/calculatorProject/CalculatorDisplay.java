package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorDisplay {


    public void displayCurrentState(String currentValue, String memoryValue, DisplayModes displayMode) {
        displayPrettyLine();

        if (displayMode.equals(DisplayModes.DECIMAL)) {
            System.out.printf("| MEMORY VALUE: %31s |\n| CURRENT VALUE(x): %27s |\n",
                    currentValue, memoryValue);
        } else {
            System.out.printf("| MEMORY VALUE: %31s |\n| CURRENT VALUE(x): %27s |\n",
                    Double.toHexString(Double.parseDouble(currentValue)),
                    Double.toHexString(Double.parseDouble(memoryValue)));
        }

        displayPrettyLine();
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
        System.out.printf("|    sdm    |    stu    |    exit   |           |\n");
        displayPrettyLine();
    }

    public void displayInputPrompt() {
        System.out.printf("| >>>>");
    }

    public void displayPrettyLine() {
        System.out.printf("*-----------------------------------------------*\n");
    }
}

