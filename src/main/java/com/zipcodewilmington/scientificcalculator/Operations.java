package com.zipcodewilmington.scientificcalculator;

public class Operations {
    static Double num1;
    static Double num2;

    public static void performArithmeticOperation(Integer selection) {


        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a number.");
                num2 = Console.getDoubleInput("Enter another number.");
                Arithmetic.addition(num1, num2);
                MainMenu.mainMenu();
                break;
            case 2:
                num1 = Console.getDoubleInput("Enter a number.");
                num2 = Console.getDoubleInput("Enter a another number.");
                Arithmetic.subtraction(num1, num2);
                MainMenu.mainMenu();
                break;
            case 3:
                num1 = Console.getDoubleInput("Enter a number.");
                num2 = Console.getDoubleInput("Enter a another number.");
                Arithmetic.multiplication(num1, num2);
                MainMenu.mainMenu();
                break;
            case 4:
                num1 = Console.getDoubleInput("Enter a number.");
                num2 = Console.getDoubleInput("Enter a another number.");
                Arithmetic.division(num1, num2);
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

        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a number.");
                Trigonometry.tangent(num1);
                MainMenu.mainMenu();
                break;
            case 2:
                num1 = Console.getDoubleInput("Enter a number.");
                Trigonometry.sine(num1);
                MainMenu.mainMenu();
                break;
            case 3:
                num1 = Console.getDoubleInput("Enter a number.");
                num2 = Console.getDoubleInput("Enter a another number.");
                Trigonometry.cosine(num1);
                MainMenu.mainMenu();
                break;
            case 4:
                num1 = Console.getDoubleInput("Enter a number.");
                num2 = Console.getDoubleInput("Enter a another number.");
                Trigonometry.atangent(num1);
                MainMenu.mainMenu();
                break;
            case 5:
                num1 = Console.getDoubleInput("Enter a number.");
                Trigonometry.acos(num1);
                MainMenu.mainMenu();
                break;
            case 6:
                num1 = Console.getDoubleInput("Enter a number.");
                Trigonometry.asin(num1);
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

        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a number.");
                Exponents.square(num1);
                MainMenu.mainMenu();
                break;
            case 2:
                num1 = Console.getDoubleInput("Enter a number.");
                Exponents.cubed(num1);
                MainMenu.mainMenu();
                break;
            case 3:
                num1 = Console.getDoubleInput("Enter a number.");
                num2 = Console.getDoubleInput("Enter a number.");
                Exponents.variableExponent(num1, num2);
                MainMenu.mainMenu();
                break;
            case 4:
                num1 = Console.getDoubleInput("Enter a number.");
                Exponents.sqrt(num1);
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

        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a number.");
                Inversion.changeSign(num1);
                MainMenu.mainMenu();
                break;
            case 2:
                num1 = Console.getDoubleInput("Enter a number.");
                Inversion.inverseNum(num1);
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

        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a number.");
                Logarithmic.naturalLog(num1);
                MainMenu.mainMenu();
                break;
            case 2:
                num1 = Console.getDoubleInput("Enter a number.");
                Logarithmic.logBaseTen(num1);
                MainMenu.mainMenu();
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.logarithmsMenu();
        }

    }

    public static void performMiscOperation (Integer selection) {

        switch (selection) {
            case 1:
                num1 = Console.getDoubleInput("Enter a number.");
                Misc.absVal(num1);
                MainMenu.mainMenu();
                break;
            default:
                Console.println("Invalid selection. Please try again.");
                Submenu.miscMenu();
        }
    }


}