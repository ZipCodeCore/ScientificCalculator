package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    private double currentValue;
    private int calculatorType;

    // Initialize all required fields
    private BasicCalculator basicCalc;
    private ScFunction scientificCalc;
    private Fibonacci fibo;

    public MainApplication() {
        basicCalc = new BasicCalculator();
        scientificCalc = new ScFunction();
        fibo = new Fibonacci();
        currentValue = 0.0;
        Console.setDisplayMode(1);
    }

    public static void main(String[] args) {

        MainApplication mainApplication = new MainApplication();
        mainApplication.runCalculator();
    }

    private void runCalculator() {

        // Print Welcome Note
        Console.println("Welcome to Our Calculator!");

        // Get Calculator Type
        calculatorType = Console.getIntegerInput("Please select between 1) Basic Calculator and 2) Scientific Calculator", 1, 2);

        // Get First Number to start
        currentValue = Console.getDoubleInput("Please enter the number");
        Console.displayValue(currentValue);

        double operandValue = 0.0;

        // Creating infinite loop until user choose to exit
        while (true) {

            if (calculatorType == 1) {

                int choice = Console.getIntegerInput("Please select from the options below\n " +
                        "1) Add \n " +
                        "2) Subtract\n " +
                        "3) Multiply \n " +
                        "4) Divison\n " +
                        "5) Exponential\n" +
                        "6) Square\n" +
                        "7) SquareRoot\n" +
                        "8) Inverse\n" +
                        "9) Invert\n" +
                        "10) Percentage\n" +
                        "11) Switch to Scientific Calculator\n" +
                        "12) Switch to Display Mode\n" +
                        "13) Clear\n" +
                        "14) Exit", 1, 13);

                if (choice >= 1 && choice <= 5) {
                    operandValue = Console.getDoubleInput("Please enter the operand number");
                }

                switch (choice) {
                    case 1:
                        currentValue = basicCalc.add(currentValue, operandValue);
                        Console.displayValue(currentValue);
                        break;
                    case 2:
                        currentValue = basicCalc.subtract(currentValue, operandValue);
                        Console.displayValue(currentValue);
                        break;
                    case 3:
                        currentValue = basicCalc.multiply(currentValue, operandValue);
                        Console.displayValue(currentValue);
                        break;
                    case 4:
                        currentValue = basicCalc.divide(currentValue, operandValue);
                        Console.displayValue(currentValue);
                        break;
                    case 5:
                        currentValue = basicCalc.exponentiation(currentValue, operandValue);
                        Console.displayValue(currentValue);
                        break;
                    case 6:
                        currentValue = basicCalc.square(currentValue);
                        Console.displayValue(currentValue);
                        break;
                    case 7:
                        currentValue = basicCalc.squareRoot(currentValue);
                        Console.displayValue(currentValue);
                        break;
                    case 8:
                        currentValue = basicCalc.inverse(currentValue);
                        Console.displayValue(currentValue);
                        break;
                    case 9:
                        currentValue = basicCalc.invertNumber(currentValue);
                        Console.displayValue(currentValue);
                        break;
                    case 10:
                        currentValue = basicCalc.percentage(currentValue);
                        Console.displayValue(currentValue);
                        break;
                    case 11:
                        calculatorType = 2;
                        Console.println("Switching to Scientific Calculator");
                        Console.displayValue(currentValue);
                        break;
                    case 12:
                        Console.println("Switching to Display Mode");
                        int displayMode = Console.getIntegerInput("Please select display mode\n 1) Decimal\n 2) Binary\n 3) Octal\n 4) HexaDecimal", 1, 4);
                        Console.setDisplayMode(displayMode);
                        Console.displayValue(currentValue);
                        break;
                    case 13:
                        currentValue = 0.0;
                        Console.displayValue(currentValue);
                        currentValue = Console.getDoubleInput("Please enter the number");
                        Console.displayValue(currentValue);
                        break;
                }

                if (choice == 14) {
                    break;
                }
            }
            else {

                int choice = Console.getIntegerInput("Please select from the options below\n " +
                        "1) natural log\n" +
                        "2) base log\n" +
                        "3) inverse log\n" +
                        "4) change sign\n" +
                        "5) sine\n" +
                        "6) cos\n" +
                        "7) tan\n" +
                        "8) inverseCosine\n" +
                        "9) inverseTangent\n" +
                        "10) inverseSine\n" +
                        "11) factorial\n" +
                        "12) fibonacci\n"+
                        "13) Switch Unit Mode\n" +
                        "14) Choose Unit Mode\n" +
                        "15) Switch to Scientific Calculator\n" +
                        "16) Clear\n" +
                        "17) Exit", 1, 21);

                switch (choice) {
                    case 1:
                        currentValue = scientificCalc.inverseNaturalLog(currentValue);
                        Console.displayValue(currentValue);
                        break;
                    case 2:
                        currentValue = scientificCalc.log(currentValue);
                        Console.displayValue(currentValue);
                        break;
                    case 3:
                        currentValue = scientificCalc.inverseLog(currentValue);
                        Console.displayValue(currentValue);
                        break;
                    case 4:
                        currentValue = scientificCalc.changesign(currentValue);
                        Console.displayValue(currentValue);
                        break;
                    case 5:
                        currentValue = scientificCalc.sin(currentValue);
                        Console.displayValue(currentValue, scientificCalc.getUnitMode());
                        break;
                    case 6:
                        currentValue = scientificCalc.cosine(currentValue);
                        Console.displayValue(currentValue, scientificCalc.getUnitMode());
                        break;
                    case 7:
                        currentValue = scientificCalc.tangent(currentValue);
                        Console.displayValue(currentValue, scientificCalc.getUnitMode());
                        break;
                    case 8:
                        currentValue = scientificCalc.inverseCosine(currentValue);
                        Console.displayValue(currentValue, scientificCalc.getUnitMode());
                        break;
                    case 9:
                        currentValue = scientificCalc.inverseTangent(currentValue);
                        Console.displayValue(currentValue, scientificCalc.getUnitMode());
                        break;
                    case 10:
                        currentValue = scientificCalc.inverseSin(currentValue);
                        Console.displayValue(currentValue, scientificCalc.getUnitMode());
                        break;
                    case 11:
                        currentValue = scientificCalc.factorial(currentValue);
                        Console.displayValue(currentValue);
                        break;
                    case 12:
                        fibo.fibonacci(currentValue);
                        currentValue = Console.getDoubleInput("Please enter the number");
                        Console.displayValue(currentValue);
                        break;
                    case 13:
                        scientificCalc.switchUnitMode();
                        scientificCalc.applyUnitMode(currentValue);
                        Console.displayValue(currentValue, scientificCalc.getUnitMode());
                        break;
                    case 14:
                        int choosenUnitMode = Console.getIntegerInput("Please select unit mode\n 1) Degree\n 2) Radian\n", 1, 2);
                        scientificCalc.setUnitMode(choosenUnitMode);
                        break;
                    case 15:
                        calculatorType = 1;
                        break;
                    case 16:
                        currentValue = 0.0;
                        Console.displayValue(currentValue);
                        currentValue = Console.getDoubleInput("Please enter the number");
                        Console.displayValue(currentValue);
                        break;
                }

                if (choice == 17) {
                    break;
                }
            }
        }
        Console.println("Exit! Thank you");
    }
}