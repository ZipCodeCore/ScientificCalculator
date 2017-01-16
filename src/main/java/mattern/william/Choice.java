package mattern.william;

/**
 * Created by williammattern on 1/14/17.
 */
public class Choice {
    static public void pickChoice(String choice) {
        switch (choice){
            case "add":
                Display.calculatedValue = CalculatorBasicFunctions.calculateAddition(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;

            case "subtract":
                Display.calculatedValue = CalculatorBasicFunctions.calculateSubtraction(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;

            case "multiply":
                Display.calculatedValue = CalculatorBasicFunctions.calculateMultiplication(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;

            case "divide":
                Display.calculatedValue = CalculatorBasicFunctions.calculateDivision(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;

            case "invert":
                System.out.println("Choice switch : invert message received");
                Display.calculatedValue = CalculatorBasicFunctions.calculateDivision(1,Display.initialValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;

            case "square":
                Display.calculatedValue = CalculatorComplexFunctions.calculateSquare(Display.initialValue);
                Display.displayAfterCalculating();
                break;

            case "squareroot":
                Display.calculatedValue = CalculatorComplexFunctions.calculateSquareRoot(Display.initialValue);
                Display.displayAfterCalculating();
                break;

            case "signinversion":
                Display.calculatedValue = CalculatorBasicFunctions.calculateSwitchSign(Display.initialValue);
                Display.displayAfterCalculating();
                break;
        }
    }
}
