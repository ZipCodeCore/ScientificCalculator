package com.zipcodewilmington.scientificcalculator;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static boolean startLoop = true;
    private static String currentMode = "binary";
    private static String currentUnit = "degrees";
    private static double currentValue = 0.0; // Current Value
    private static double memoryValue = 0.0;  // Value Stored in Memory

    public static void main(String[] args) {

        Console.println("Welcome to my calculator!");
        Console.println("What operation would you like to perform?");
        Console.println("ARITHMETIC OPERATIONS: 1-Add 2-Subtract 3-Multiple 4-Divide");
        Console.println("ADVANCED OPERATIONS: 5-Square 6-Square Root 7-Exponentiation 8-Inverse 9-Change Sign 10-Factorial");
        Console.println("TRIG FUNCTIONS: 11-Sine 12-Cosine 13-Tangent");
        Console.println("INVERSE TRIG FUNCTIONS: 14-Inverse Sine 15-Inverse Cosine 16-Inverse Tangent");
        Console.println("SWITCH TRIG UNITS: 17-Switch Trig Units 18-Select Trig Units");
        Console.println("LOGARITHMIC FUNCTIONS: 18-Log 19-Inverse Log 20-Natural Log 21-Inverse Natural Log");
        Console.println("MEMORY FUNCTIONS: 22-Clear memory 23-Add value to memory 24-Recall memory");
        Console.println("DISPLAY CHANGES: 25-Switch Display Mode 26-Choose Display Mode");
        Console.println("99-EXIT CALCULATOR");

        while (startLoop) {
            Integer choice = Console.getIntegerInput("Enter the number of the operation you want to perform.");
            switch (choice) {
                //case 1:
                //    findSum();
                //    break;
                // case 2: findDifference(); break;
                // case 3: findProduct(); break;
                // case 4: findQuotient(); break;
                case 10:
                    userInputDouble = Console.getDoubleInput("Enter a number as a double");
                    findFactorial(userInputDouble);
                    break;
                case 17:
                    switchUnitsMode();
                    break;
                case 18:
                    String trigMode = Console.getStringInput("Enter the desired trig units mode");
                    switchUnitsMode(trigMode);
                    break;
                case 22:
                    clearMemory();
                    break;
                case 23:
                    addCurrentValueToMemory();
                    break;
                case 24:
                    recallMemoryValue();
                    break;
                case 25:
                    switchDisplayMode();
                    break;
                case 26:
                    String mode = Console.getStringInput("Enter the desired mode");
                    switchDisplayMode(mode);
                    break;
                case 98:
                    userInputDouble = Console.getDoubleInput("Enter a number as a double");
                    setCurrentValue(userInputDouble);
                    break;
                case 99:
                    startLoop = false;
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid number.");
                    break;
            }
        }
    }


    public static double userInputDouble = 0.0;

    //IM A BASIC B
    public static double findSum(double a, double b) {
        currentValue = a + b;
        return currentValue;
    }

    public static double findDifference(double a, double b) {
        currentValue = a - b;
        return currentValue;
    }

    public static double findProduct(double a, double b) {
        currentValue = a * b;
        return currentValue;
    }

    public static double findQuotient(double a, double b) {
        currentValue = a / b;
        return currentValue;
    }

    public static double findRemainder(double a, double b) {
        currentValue = a % b;
        return currentValue;
    }


    // MEMORY
    // public static Double acceptUserInput()

    public static double getMemoryValue() {
        return memoryValue;
    }

    // Set the current value
    public static double setCurrentValue(double input) {
        currentValue = input;
        //System.out.println(currentValue);
        return currentValue;
    }

    // Return the current value
    public static double returnCurrentValue() {
        return currentValue;
    }

    // M+ KEY: Recall current value from memory to the display
    public static double recallMemoryValue() {
        System.out.println(memoryValue);
        return memoryValue;
    }

    // MC KEY: Reset the memory & Clear Display
    public static double clearMemory() {
        memoryValue = 0.0;
        System.out.println(memoryValue);
        return memoryValue;
    }


    // MC+ KEY: Add currently displayed value to the value in memory & clear display
    public static double addCurrentValueToMemory() {
        memoryValue = currentValue;
        currentValue = 0.0;
        System.out.println(currentValue);
        return currentValue;
    }

    // BASIC CALCULATOR OPERATIONS


    // SCIENTIFIC CALCULATOR OPERATIONS

    // Find the factorial of a number
    public static double findFactorial(double userInput) {
        double factorial = userInput;
        for (int i = 1; i < factorial; i++) {
            userInput *= i;
        }

        setCurrentValue(userInput);
        System.out.println(currentValue);
        return currentValue;
    }


    //Following methods take a value (num1) for the log equations.
    //Logarithms

    //Takes a value for num2 for the log equation. num1 is not used in this case

    public static double logarithm(double num1) {
        double newNum = Math.log10(num1);
        System.out.println(newNum);
        return newNum;
    }

    //Inverted Logs


    public static double invLog(double num1) {
        double newNum = Math.pow(10,num1);
        System.out.println(newNum);
        return newNum;

    }
    //Natural Logs
    public static double natLog(double num1) {
        double newNum = Math.log(num1);
        System.out.println(newNum);
        return newNum;
    }
    //Inverted Natural Logs


    public static double invNatLog(double num1) {
        double newNum = Math.pow(Math.E,num1);
        System.out.println(newNum);
        return newNum;
    }



    //DISPLAY CHANGES

    public static void getMode() {
        System.out.println(currentMode);
    }
    //public void setMode(String newMode){currentMode = newMode;}

    public static String switchDisplayMode() {

        if (currentMode.equals("binary")) {
            currentMode = "octal";
            System.out.println("octal");
        } else if (currentMode.equals("octal")) {
            currentMode = "decimal";
            System.out.println("decimal");
        } else if (currentMode.equals("decimal")) {
            currentMode = "hexadecimal";
            System.out.println("hexadecimal");
        } else if (currentMode.equals("hexadecimal")) {
            currentMode = "binary";
            System.out.println("binary");
        } else System.out.println("Err");
        return currentMode;
    }


    public static String switchDisplayMode(String mode) {

        if (mode.equals("binary")) {
            currentMode = "binary";
        } else if (mode.equals("octal")) {
            currentMode = "octal";
        } else if (mode.equals("decimal")) {
            currentMode = "decimal";
        } else if (mode.equals("hexadecimal")) {
            currentMode = "hexadecimal";
        } else mode = "Err";
        System.out.println(mode);
        return mode;
    }

    //UNIT CHANGES

    public static void getUnit() {
        System.out.println(currentUnit);
    }

    public static String switchUnitsMode() {
        if (currentUnit.equals("degrees")) {
            currentUnit = "radians";
            System.out.println("radians");
        } else if (currentUnit.equals("radians")) {
            currentUnit = "degrees";
            System.out.println("degrees");
        } else System.out.println("Err");

        return currentUnit;
    }

    public static String switchUnitsMode(String mode) {
        if (mode.equals("degrees")) {
            currentUnit = "degrees";
        } else if (mode.equals("radians")) {
            currentUnit = "radians";
        } else mode = "Err";
        System.out.println(mode);
        return mode;
    }
    // TRIG FUNCTIONS

    public static double getSin (double a) {
        double b=Math.toRadians(a);
        return (Math.sin(b));
    }


    public static double getCos(double a) {
        double b=Math.toRadians(a);
        System.out.println(Math.cos(b));
        return (Math.cos(b));
    }

    public static double getTan(double a) {
        double b=Math.toRadians(a);
        return (Math.tan(b));
    }

    public static double getAsinPi(double a) {
        return (Math.asin(a));
    }

    public double getAsin(double a) {
        double b=Math.toRadians(a);
        return (Math.asin(b));
    }

    public double getAcos (double a){
        double b=Math.toRadians(a);
        return (Math.acos(b));
    }

    public double getAtan (double a){
        return (Math.atan(a));
    }


    public boolean isStartLoop() {
        return startLoop;
    }
}

