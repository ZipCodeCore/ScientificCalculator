package com.zipcodewilmington.scientificcalculator;

public class Submenu {

    public static Integer arithmeticMenu() {

        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Add \n" +
                        "2. Subtract \n" +
                        "3. Multiply \n" +
                        "4. Divide \n" +
                        "5. Return to Arithmetic Menu \n" +
                        "6. Return to Main Menu \n");

        Operations.performArithmeticOperation(input2);

        return null;
    }

    public static Integer trigonometryMenu() {

        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Tangent \n" +
                        "2. Sine \n" +
                        "3. Cosine \n" +
                        "4. Inverse Tangent \n" +
                        "5. Inverse Cosine \n" +
                        "6. Inverse Sine \n" +
                        "7. Return to Trig Menu \n" +
                        "8. Return to Main Menu \n");

        Operations.performTrigonometryOperation(input2);

        return null;
    }

    public static Integer exponentsMenu() {

        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Square \n" +
                        "2. Cube \n" +
                        "3. Variable Exponent \n" +
                        "5. Square Root \n" +
                        "4. Return to Exponent Menu \n" +
                        "5. Return to Main Menu \n");

        Operations.performExponentOperation(input2);

        return null;
    }

    public static Integer inversionMenu() {

        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Invert Sign \n" +
                        "2. Return to Inversion Menu \n" +
                        "3. Return to Main Menu \n");

        Operations.performInversionOperation(input2);

        return null;
    }


}