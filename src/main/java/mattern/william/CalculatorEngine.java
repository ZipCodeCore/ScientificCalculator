package mattern.william;

/**
 * Created by williammattern on 1/13/17.
 */
public class CalculatorEngine {
    static double initialValue = 0;
    static double currentValue;
    static double calculatedValue;
    static String operatorCode;

    public void startEngine() {
        Display display = new Display();
        display.getInitialValue();
        System.out.println("Display: " + initialValue);

        display.getOperatorCode();
        System.out.println("Display: " + operatorCode);

        display.getCurrentValue();
        System.out.println("Display: " + currentValue);

        //CalculatorBasicFunctions.run();

        CalculatorBasicFunctions calculatorBasicFunctions = new CalculatorBasicFunctions();
        switch (operatorCode) {
            case "add":
                CalculatorBasicFunctions.calculateAddition(initialValue, currentValue);
                break;
            case "subtract":
                CalculatorBasicFunctions.calculateSubtraction(initialValue, currentValue);
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


    public void runEngine() {
        Display display = new Display();
        this.initialValue = calculatedValue;
        System.out.println("Display: " + initialValue);

        display.getOperatorCode();
        System.out.println("Display: " + operatorCode);

        display.getCurrentValue();
        System.out.println("Display: " + currentValue);


        //CalculatorBasicFunctions.run();

        CalculatorBasicFunctions calculatorBasicFunctions = new CalculatorBasicFunctions();
        switch (operatorCode) {
            case "add":
                CalculatorBasicFunctions.calculateAddition(initialValue, currentValue);
                break;
            case "subtract":
                CalculatorBasicFunctions.calculateSubtraction(initialValue, currentValue);
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