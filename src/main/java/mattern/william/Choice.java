package mattern.william;

/**
 * Created by williammattern on 1/14/17.
 */
public class Choice {
    static public void pickChoice(String choice) {
        switch (choice){
            case "add":
                Display.calculatedValue = CalculatorTwoVariableFunctions.calculateAddition(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                break;

            case "subtract":
                Display.calculatedValue = CalculatorTwoVariableFunctions.calculateSubtraction(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                break;

            case "multiply":
                Display.calculatedValue = CalculatorTwoVariableFunctions.calculateMultiplication(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                break;

            case "divide":
                Display.calculatedValue = CalculatorTwoVariableFunctions.calculateDivision(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                break;

            case "invert":
                System.out.println("Choice switch : invert message received");
                Display.calculatedValue = CalculatorSingleVariableFunctions.calculateInverse(Display.initialValue);
                Display.displayAfterCalculating();
                break;

            case "square":
                System.out.println("Choice switch : square message received");
                Display.calculatedValue = CalculatorSingleVariableFunctions.calculateSquare(Display.initialValue);
                Display.displayAfterCalculating();
                break;

            case "squareroot":
                System.out.println("Choice switch : squareroot message received");
                Display.calculatedValue = CalculatorSingleVariableFunctions.calculateSquareRoot(Display.initialValue);
                Display.displayAfterCalculating();
                break;

            case "signinversion":
                System.out.println("Choice switch : sign inversion message received");
                Display.calculatedValue = CalculatorSingleVariableFunctions.calculateSignInversion(Display.initialValue);
                Display.displayAfterCalculating();
                break;

            case "tothepowerof":
                Display.calculatedValue = CalculatorTwoVariableFunctions.calculateToThePowerOf(Display.initialValue, Display.currentValue);
                Display.displayAfterCalculating();
                break;

            case "sin":
                System.out.println("Choice switch : sine message received");
                Display.calculatedValue = CalculatorSingleVariableFunctions.calculateSine(Display.initialValue);
                Display.displayAfterCalculating();
                break;

            case "cos":
                System.out.println("Choice switch : cosine message received");
                Display.calculatedValue = CalculatorSingleVariableFunctions.calculateCosine(Display.initialValue);
                Display.displayAfterCalculating();
                break;

            case "tan":
                System.out.println("Choice switch : tangent message received");
                Display.calculatedValue = CalculatorSingleVariableFunctions.calculateTangent(Display.initialValue);
                Display.displayAfterCalculating();
                break;

            case "arcsin":
                System.out.println("Choice switch : arcsine message received");
                Display.calculatedValue = CalculatorSingleVariableFunctions.calculateArcSine(Display.initialValue);
                Display.displayAfterCalculating();
                break;

            case "arccos":
                System.out.println("Choice switch : arccos message received");
                Display.calculatedValue = CalculatorSingleVariableFunctions.calculateArcosine(Display.initialValue);
                Display.displayAfterCalculating();
                break;

            case "arctan":
                System.out.println("Choice switch : arctangent message received");
                Display.calculatedValue = CalculatorSingleVariableFunctions.calculateArcTangent(Display.initialValue);
                Display.displayAfterCalculating();
                break;

            case "todegrees":
                System.out.println("Choice switch : todegrees message received");
                Display.calculatedValue = CalculatorSingleVariableFunctions.convertToDegrees(Display.initialValue);
                Display.displayAfterCalculating();
                break;

            case "toradians":
                System.out.println("Choice switch : toradians message received");
                Display.calculatedValue = CalculatorSingleVariableFunctions.convertToRadians(Display.initialValue);
                Display.displayAfterCalculating();
                break;
        }
    }
}
