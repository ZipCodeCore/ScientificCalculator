package gross_ryan;

/**
 * Created by ryangross on 1/13/17.
 */
public class Calculator {
    Display aDisplay;
    Function aFunction;

    public static void main(String[] args) {
        Calculator aCalculator = new Calculator();
        aCalculator.aDisplay = new Display();
        aCalculator.aFunction = new Function("+", 5);
        aCalculator.aFunction.setResult(aCalculator.aDisplay, aCalculator.aFunction);
        aCalculator.aDisplay.clearDisplay();
    }

    }


