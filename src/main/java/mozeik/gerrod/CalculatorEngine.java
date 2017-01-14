package mozeik.gerrod;


/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class CalculatorEngine {

    static double initialValue;
    static double currentValue;
    static double calculatedValue;
    static String operatorCode;

    public void startEngine() {
        Display display = new Display();
        display.getInitialValue();
        System.out.println(initialValue);

        display.getOperatorCode();
        System.out.println(operatorCode);

        display.getCurrentValue();
        System.out.println(currentValue);

        CalculatorBasicFunctions calculatorBasicFunctions = new CalculatorBasicFunctions();
        switch (operatorCode) {
            case "add":
                calculatorBasicFunctions.calculateAddition(initialValue, currentValue);
                break;
            case "subtract":
                calculatorBasicFunctions.calculateSubtraction(initialValue, currentValue);
                break;
            case "multiply":
                calculatorBasicFunctions.calculateMultiplication(initialValue, currentValue);
                break;
            case "divide":
                calculatorBasicFunctions.calculateDivision(initialValue, currentValue);
                break;
        }

        display.showOutputValue(calculatedValue);

    }

    public void runEngine() {
        Display display = new Display();
        this.initialValue = calculatedValue;
        System.out.println(initialValue);

        display.getOperatorCode();
        System.out.println(operatorCode);

        display.getCurrentValue();
        System.out.println(currentValue);

        CalculatorBasicFunctions calculatorBasicFunctions = new CalculatorBasicFunctions();
        switch (operatorCode) {
            case "add":
                calculatorBasicFunctions.calculateAddition(initialValue, currentValue);
                break;
            case "subtract":
                calculatorBasicFunctions.calculateSubtraction(initialValue, currentValue);
                break;
            case "multiply":
                calculatorBasicFunctions.calculateMultiplication(initialValue, currentValue);
                break;
            case "divide":
                calculatorBasicFunctions.calculateDivision(initialValue, currentValue);
                break;
        }

        display.showOutputValue(calculatedValue);
    }

}
