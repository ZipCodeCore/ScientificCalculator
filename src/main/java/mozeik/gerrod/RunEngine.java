package mozeik.gerrod;


/**
 * Created by gerrodmozeik on 1/14/17.
 */
public class RunEngine {

    static double initialValue;
    static double currentValue;
    static double calculatedValue;
    static String operatorCode;

    public void runEngine() {
        Display display = new Display();
        this.initialValue = calculatedValue;
        System.out.println(initialValue);

        display.getCurrentValue();
        System.out.println(currentValue);

        display.getOperatorCode();
        System.out.println(operatorCode);

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
