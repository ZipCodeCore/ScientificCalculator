package mattern.william;

/**
 * Created by williammattern on 1/13/17.
 */
public class CalculatorEngine {
    static double initialValue = 0;
    static double currentValue;
    static double calculatedValue;
    static String operatorCode;

    public void StartEngine() {
        Display display = new Display();
        display.getInitialValue();
        System.out.println("Display: " + initialValue);
        display.getCurrentValue();
        System.out.println("Display: " + currentValue);
        display.getOperatorCode();
        System.out.println("Display: " + operatorCode);
        //CalculatorBasicFunctions.run();

        CalculatorBasicFunctions calculatorBasicFunctions = new CalculatorBasicFunctions();
        switch (operatorCode) {
            case "add":
                CalculatorBasicFunctions.calculateAddition(initialValue, currentValue);
                break;
            case "subtract":
                CalculatorBasicFunctions.calculateAddition(initialValue, currentValue);
                break;
            case "multiply":
                CalculatorBasicFunctions.calculateMultiplication(initialValue, currentValue);
                break;
            case "divide":
                CalculatorBasicFunctions.calculateDivision(initialValue, currentValue);
                break;
        }

        display.showOutputValue(calculatedValue);
    }
}