/**
 * Created by andrewwong on 4/28/17.
 */
public class Calculator {
    private BasicMath basicMath;
    //private TrigMath trigMath;
    private Memory memory;

    public Calculator(BasicMath basicMath, Memory memory) {
        this.basicMath = basicMath;
        this.memory = memory;
    }

    public Calculator(BasicMath basicMath) {
        this.basicMath = basicMath;
    }

    public boolean doOperation(String operation, double secondNumber) {
        boolean operationSuccess = true;
        double firstNumber = memory.getDisplayValue();
        CalculationResult result = delegateTask(operation, firstNumber, secondNumber);
        if(result == null) {
            operationSuccess = false;
            return operationSuccess;
        }

        if(result.hasError()) {
            memory.setError(true);
        }
        memory.setDisplayValue(result.getValue());
        return operationSuccess;

    }

    private CalculationResult delegateTask(String operation, double firstNumber, double secondNumber) {
        switch (operation.toLowerCase()) {
            case "add":
                return basicMath.add(firstNumber, secondNumber);
            case "subtract":
                return basicMath.subtract(firstNumber, secondNumber);
            case "multiply":
                return basicMath.multiply(firstNumber, secondNumber);
            case "divide":
                return basicMath.divide(firstNumber, secondNumber);
            case "sin":

            default:
                return null;
        }
    }


}
