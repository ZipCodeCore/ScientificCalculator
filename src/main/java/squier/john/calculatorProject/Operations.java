package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class Operations {

    public double performCalculation(String operation, double currentValue, double inputValue) {

        switch( operation ) {
            case "+":
                return currentValue + inputValue;
            case "-":
                return currentValue - inputValue;
            case "*":
                return currentValue * inputValue;
            case "/":
            case "\\":
                // check for zero
                return currentValue / inputValue;
            case "clear":
                return 0.0;
            default:
                return 1.0;
        }
    }

    public String getAvailableOperations() {
        return " ADD: +    SUBTRACT: -    MULTIPLY: *    DIVIDE: /\nEXIT: exit    CLEAR: clear";
    }
}
