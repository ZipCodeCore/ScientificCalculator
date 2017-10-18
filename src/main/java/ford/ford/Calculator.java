package ford.ford;

/**
 * Created by rahmirford on 4/29/17.
 */
public class Calculator {
    public static void main(String[] args) {

        // accept operator input
        // accept and store number input x * y


        CalculatorInput calculatorInput = new CalculatorInput();

        double x;
        double y;
        String z;

        x = calculatorInput.userValueInputValidator(calculatorInput.acceptUserValue());
        z = calculatorInput.userInputValidator(calculatorInput.acceptUserOperator());
        y = calculatorInput.userValueInputValidator(calculatorInput.acceptUserValue());

//        public String userInputValidator(String userOperator) {
//            double x = userInputValue;
//            double y = userInputValue;

            if (calculatorInput.userOperator.equals("+")) {
                BasicMath.add(x, y);

            } else if (calculatorInput.userOperator.equals("/")) {
                BasicMath.divide(x, y);

            } else if (calculatorInput.userOperator.equals("-")) {
                BasicMath.subtract(x, y);

            } else if (calculatorInput.userOperator.equals("*")) {
                BasicMath.multiply(x, y);

            } else if (calculatorInput.userOperator.equals("sq")) {
                BasicMath.findSquare(x);

            } else if (calculatorInput.userOperator.equals("sqrt")) {
                BasicMath.findSquareRoot(x);
            } else {
                calculatorInput.acceptUserOperator();
            }
        }




}

