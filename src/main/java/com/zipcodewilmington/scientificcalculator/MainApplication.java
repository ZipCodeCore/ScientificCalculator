package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    private static String[] coreFunctions = {"set", "clear", "exit", "help"};
    private static String[] coreMath = {"add", "subtract", "multiply", "divide"};
//    private static String[] sciMath = {};
    private static boolean calcOn = true;

    private static String currentState = "0";
    private static String currentOperation = "none";
    private static double currentMemory = 0;

    public static void main(String[] args) {
        startUpMessage(); // prints welcome message to console and awaits input

        while (calcOn == true) {
            setDisplay();
            // get operation from user input
            currentOperation = Console.getStringInput("Enter your operation: ");


            executeOperation(currentOperation);
            // if valid operation,
                // determine # of params to prompt user for
                // or some other function (clear, mc, m+, m)
            // if invalid operation or "help",
                // return list of valid operations
                // continue (reset while loop)
            // if math operation
                // prompt user for params
                // display params, operation, and result
            // if mem operation
                // complete operation
            //
        } // end while


    } // end main method

    public static void startUpMessage() {
        Console.println("Welcome to my CLI Calculator!");
        Console.println("\ttype 'help' for list of valid operations");
        Console.println("\ttype 'exit' to exit CLI Calculator");
        Console.getStringInput("press enter to begin");
    }

    public static void setDisplay() {
        Console.clear();
        Console.println("CLI Scientific Calculator");
        Console.println("Value: \t\t" + currentState);
        Console.println("prev Operation:\t" + currentOperation + "\n");
        // if help bool true, display more
    }

    public static void executeOperation(String operation) {
//        setDisplay(); //reset display so operation is displayed properly
        // set clear add subtract multiply divide square sqrt inverse invert_sign
        executeCoreOperation(operation);
        executeMathOperation(operation);
        executeSciOperation(operation);
    }

    public static void executeCoreOperation(String operation) {
        if (operation.equals("set")) {
            // prompt user to set currentState
            currentState = Console.getStringInput("Enter a number, x = ");
        }
        else if (operation.equals("clear")) {
            Console.clear();
        }
        else if (operation.equals("exit")) {
            calcOn = false;
        }
        else if (operation.equals("help")) {
            Console.println("set, clear, exit, help");
            Console.println("add, subtract, multiply, divide, inverse, invert sign");
        }
    }

    public static void executeMathOperation(String operation) {
        double x;
        double y;

//        if (currentState.matches("[0-9]+")) {
        x = Double.valueOf(currentState);
//        }
//        else {
//            Console.println("invalid number input, try again");
//            x = Console.getDoubleInput("Enter a number, x = ");
//        }

        if (operation.equals("add")) {
            Console.println("f(y) = " + currentState + " + y");
            y = Console.getDoubleInput("y = ");
            currentState = Calculator.add(x, y);
        }
        else if (operation.equals("subtract")) {
            Console.println("f(y) = " + currentState + " - y");
            y = Console.getDoubleInput("y = ");
            currentState = Calculator.subtract(x, y);
        }
        else if (operation.equals("multiply")) {
            Console.println("f(y) = " + currentState + " * y");
            y = Console.getDoubleInput("y = ");
            currentState = Calculator.multiply(x, y);
        }
        else if (operation.equals("divide")) {
            Console.println("f(y) = " + currentState + " / y");
            y = Console.getDoubleInput("y = ");
            currentState = Calculator.divide(x, y);
        }
        else if (operation.equals("square")) {
            currentState = Calculator.square(x);
        }
        else if (operation.equals("sqrt")) {
            currentState = Calculator.sqrt(x);
        }
        else if (operation.equals("inverse")) {
            currentState = Calculator.inverse(x);
        }
        else if (operation.equals("invert sign")) {
            currentState = Calculator.invertSign(x);
        }
    }

    public static void executeSciOperation(String operation) {
        // m+ currentMemory = currentState
        if (operation.equals("m+")) {
            Console.println(currentState + " saved to memory");
            currentMemory = Double.valueOf(currentState);
        }
        // mc currentMemory = 0
        else if (operation.equals("mc")) {
            Console.println("memory reset to zero");
            currentMemory = 0;
        }
        // mrc currentState = currentMemory
        else if (operation.equals("mrc")) {
            Console.println(currentMemory + " recalled from memory");
            currentState = String.valueOf(currentMemory);
        }
//        else if (operation.equals("m")) {
//            Console.println("Stored in memory: " + currentMemory);
//        }
    }

}
