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
            case "sin":
                Display.calculatedValue = CalculatorWithOneNumber.calculateSine(Display.initialValue);
                Display.displayAfterCalculating();
                break;
            case "cos":
                Display.calculatedValue = CalculatorWithOneNumber.calculateCosine(Display.initialValue);
                Display.displayAfterCalculating();
                break;
            case "tan":
                Display.calculatedValue = CalculatorWithOneNumber.calculateTangent(Display.initialValue);
                Display.displayAfterCalculating();
                break;
            case "asin":
                Display.calculatedValue = CalculatorWithOneNumber.calculateInverseSine(Display.initialValue);
                Display.displayAfterCalculating();
                break;
            case "acos":
                Display.calculatedValue = CalculatorWithOneNumber.calculateInverseCosine(Display.initialValue);
                Display.displayAfterCalculating();
                break;
            case "atan":
                Display.calculatedValue = CalculatorWithOneNumber.calculateInverseTangent(Display.initialValue);
                Display.displayAfterCalculating();
                break;
            case "radianstodegrees":
                Display.calculatedValue = CalculatorWithOneNumber.radiansToDegrees(Display.initialValue);
                Display.displayAfterCalculating();
                break;
            case "degreestoradians":
                Display.calculatedValue = CalculatorWithOneNumber.degreesToRadians(Display.initialValue);
                Display.displayAfterCalculating();
                break;
            }
        }
    }