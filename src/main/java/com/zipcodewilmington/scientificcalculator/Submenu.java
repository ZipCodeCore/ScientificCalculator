package com.zipcodewilmington.scientificcalculator;

public class Submenu {

    public static Integer arithmeticMenu() {

        Integer input2 = Console.getIntegerInput(
                "Enter an operation \n" +
                        "1. Add \n" +
                        "2. Subtract \n" +
                        "3. Multiply \n" +
                        "4. Divide \n");

        Operations.performArithmeticOperation(input2);

        return null;
    }

    public static Integer trigonometryMenu() {

        Integer input2 = Console.getIntegerInput(
                "Enter an operation \n" +
                        "1. Tangent \n" +
                        "2. Sine \n" +
                        "3. Cosine \n" +
                        "4. Inverse Tangent \n" +
                        "5. Inverse Cosine \n" +
                        "6. Inverse Sine \n");

        Operations.performTrigonometryOperation(input2);

        return null;
    }

    public static Integer exponentsMenu() {

        Integer input2 = Console.getIntegerInput(
                "Enter an operation \n" +
                        "1. Square \n" +
                        "2. Cube \n" +
                        "3. Variable Exponent \n" +
                        "4. Square Root \n");

        Operations.performExponentOperation(input2);

        return null;
    }

    public static Integer inversionMenu() {

        Integer input2 = Console.getIntegerInput(
                "Enter an operation \n" +
                        "1. Invert Sign \n");

        Operations.performInversionOperation(input2);

        return null;
    }


}