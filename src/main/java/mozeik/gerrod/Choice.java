package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/14/17.
 */
public class Choice {

    static public void pickChoice(String Choice) {
        switch(Choice) {
            case "add":
                CalculatorBasicFunctions.calculateAddition(CalculatorBasicFunctions.initialValue, CalculatorBasicFunctions.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;
            case "subtract":
                CalculatorBasicFunctions.calculateSubtraction(CalculatorBasicFunctions.initialValue, CalculatorBasicFunctions.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;
            case "multiply":
                CalculatorBasicFunctions.calculateMultiplication(CalculatorBasicFunctions.initialValue, CalculatorBasicFunctions.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;
            case "divide":
                CalculatorBasicFunctions.calculateDivision(CalculatorBasicFunctions.initialValue, CalculatorBasicFunctions.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;
            }
        }
    }


