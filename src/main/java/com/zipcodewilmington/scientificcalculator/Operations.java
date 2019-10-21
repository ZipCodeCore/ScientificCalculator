package com.zipcodewilmington.scientificcalculator;

public class Operations {
    static Double num1;
    static Double num2;

    public static void performArithmeticOperation(Integer selection) {
        Double output;

        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a number.");
                num2 = Console.getDoubleInput("Enter another number.");
                output = Arithmetic.addition(num1, num2);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 2:
                num1 = Console.getDoubleInput("Enter a number.");
                num2 = Console.getDoubleInput("Enter a another number.");
                output = Arithmetic.subtraction(num1, num2);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 3:
                num1 = Console.getDoubleInput("Enter a number.");
                num2 = Console.getDoubleInput("Enter a another number.");
                output = Arithmetic.multiplication(num1, num2);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 4:
                num1 = Console.getDoubleInput("Enter a number.");
                num2 = Console.getDoubleInput("Enter a another number.");
                output = Arithmetic.division(num1, num2);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 5:
                Submenu.arithmeticMenu();
                break;
            case 6:
                MainMenu.mainMenu();
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.arithmeticMenu();

        }

    }

    public static void performTrigonometryOperation (Integer selection) {
        Double output;

        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a number.");
                output = Trigonometry.tangent(num1);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 2:
                num1 = Console.getDoubleInput("Enter a number.");
                output = Trigonometry.sine(num1);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 3:
                num1 = Console.getDoubleInput("Enter a number.");
                num2 = Console.getDoubleInput("Enter a another number.");
                output = Trigonometry.cosine(num1);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 4:
                num1 = Console.getDoubleInput("Enter a number.");
                num2 = Console.getDoubleInput("Enter a another number.");
                output = Trigonometry.atangent(num1);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 5:
                num1 = Console.getDoubleInput("Enter a number.");
                output = Trigonometry.acos(num1);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 6:
                num1 = Console.getDoubleInput("Enter a number.");
                output = Trigonometry.asin(num1);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 7:
                Submenu.trigonometryMenu();
                break;
            case 8:
                MainMenu.mainMenu();
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.trigonometryMenu();
        }

    }

    public static void performExponentOperation (Integer selection) {
        Double output;

        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a number.");
                output = Exponents.square(num1);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 2:
                num1 = Console.getDoubleInput("Enter a number.");
                output = Exponents.cubed(num1);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 3:
                num1 = Console.getDoubleInput("Enter a number.");
                num2 = Console.getDoubleInput("Enter a number.");
                output = Exponents.variableExponent(num1, num2);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 4:
                num1 = Console.getDoubleInput("Enter a number.");
                output = Exponents.sqrt(num1);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
            case 5:
                Submenu.exponentsMenu();
                break;
            case 6:
                MainMenu.mainMenu();
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.trigonometryMenu();
        }

    }

    public static void performInversionOperation (Integer selection) {
        Double output;

        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a number.");
                output = Inversion.changeSign(num1);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 2:
                num1 = Console.getDoubleInput("Enter a number.");
                output = Inversion.inverseNum(num1);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 3:
                MainMenu.mainMenu();
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.inversionMenu();
        }

    }

    public static void performLogarithmOperation (Integer selection) {
        Double output;

        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a number.");
                output = Logarithmic.naturalLog(num1);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            case 2:
                num1 = Console.getDoubleInput("Enter a number.");
                output = Logarithmic.logBaseTen(num1);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.logarithmsMenu();
        }

    }

    public static void performMiscOperation (Integer selection) {
        Double output;

        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a number.");
                output = Misc.absVal(num1);
                Console.println(DisplayMode.convertToSelectedMode(output));
                MainMenu.mainMenu();
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.miscMenu();
        }
    }


}