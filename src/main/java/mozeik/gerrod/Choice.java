package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/14/17.
 */
public class Choice {

    static public void pickChoice(String Choice) {
        switch(Choice) {
            case "add":
                Display.calculatedValue = CalculatorWithTwoNumbers.calculateAddition(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                break;
            case "subtract":
                Display.calculatedValue = CalculatorWithTwoNumbers.calculateSubtraction(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;
            case "multiply":
                Display.calculatedValue = CalculatorWithTwoNumbers.calculateMultiplication(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;
            case "divide":
                Display.calculatedValue = CalculatorWithTwoNumbers.calculateDivision(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;
            case "invert":
                Display.calculatedValue = CalculatorWithOneNumber.calculateInvert(Display.initialValue);
                Display.displayAfterCalculating();
                break;
            case "square":
                Display.calculatedValue = CalculatorWithOneNumber.calculateSquare(Display.initialValue);
                Display.displayAfterCalculating();
                break;
            case "squareroot":
                Display.calculatedValue = CalculatorWithOneNumber.calculateSquareRoot(Display.initialValue);
                Display.displayAfterCalculating();
                break;
            case "tothepowerof":
                Display.calculatedValue = CalculatorWithTwoNumbers.calculateExponentiation(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                break;
            case "signinvert":
                Display.calculatedValue = CalculatorWithOneNumber.signInvert(Display.initialValue);
                Display.displayAfterCalculating();
                break;
            case "factorial":
                Display.calculatedValue = CalculatorWithOneNumber.calculateFactorial(Display.initialValue);
                Display.displayAfterCalculating();
                break;
            }
        }
    }


