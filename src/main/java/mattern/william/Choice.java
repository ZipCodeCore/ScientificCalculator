package mattern.william;

/**
 * Created by williammattern on 1/14/17.
 */
public class Choice {
    static public void pickChoice(String choice) {
        switch (choice){
            case "add":
                CalculatorBasicFunctions.calculateAddition(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;
            case "subtract":
                CalculatorBasicFunctions.calculateSubtraction(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;
            case "multiply":
                CalculatorBasicFunctions.calculateMultiplication(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;
            case "divide":
                CalculatorBasicFunctions.calculateDivision(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;
        }
    }
}
