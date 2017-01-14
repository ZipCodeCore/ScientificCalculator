package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class Operations {

    public double performCalculation(String operation, double currentValue, double inputValue) {

        switch( operation ) {
            case "+":
                return currentValue + inputValue;
                break;
        }
    }

    public String getAvailableOperations() {
        return "ADD: +    SUBTRACT: -    MULTIPLY: *    DIVIDE: /\nEXIT: exit";
    }
}
