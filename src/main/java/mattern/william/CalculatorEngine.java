package mattern.william;

/**
 * Created by williammattern on 1/13/17.
 */
public class CalculatorEngine {
    static double initialValue = 0;
    static double currentValue;
    static double calculatedValue;
    static String operatorCode;
    Display display = new Display();

    public void startEngine() {

        display.getInitialValue();
        display.getOperatorCode();
        if (operatorCode.equals("clear")){
            display.clearDisplay();
        }
        display.getCurrentValue();
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
        display.getOperatorCode();
        display.getCurrentValue();
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
            case "clear":
                display.clearDisplay();
                break;
        }
        display.showOutputValue(calculatedValue);
        if (operatorCode == "clear") {

        }
    }
}