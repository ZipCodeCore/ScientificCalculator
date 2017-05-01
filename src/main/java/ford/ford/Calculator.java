package ford.ford;

/**
 * Created by rahmirford on 4/29/17.
 */
public class Calculator {
    public static void main(String[] args) {

        // accept operator input
        // accept and store number input x * y
        double x;
        double y;
        double z;

        CalculatorInput calculatorInput = new CalculatorInput();

        x = calculatorInput.userValueInputValidator(calculatorInput.acceptUserValue());
        z = calculatorInput.userInputValidator(calculatorInput.acceptUserOperator());
        y = calculatorInput.userValueInputValidator(calculatorInput.acceptUserValue());


    }
}
