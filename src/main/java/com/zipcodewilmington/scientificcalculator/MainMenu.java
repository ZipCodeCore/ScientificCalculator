package com.zipcodewilmington.scientificcalculator;

public class MainMenu {


    public static String mainMenu() {

        Integer input;



        input = Console.getIntegerInput(
                "\nWhat would you like to do? Input a number and press enter. \n" +
                        "1. Arithmetic \n" +
                        "2. Trigonometry \n" +
                        "3. Exponents \n" +
                        "4. Logarithms \n" +
                        "5. Inversions \n" +
                        "6. Miscellaneous \n" +
                        "7. M+ \n" +
                        "8. MRC \n" +
                        "9. MC \n" +
                        "10. Exit \n");

        switch (input) {
            case 1:
                Submenu.arithmeticMenu();
                break;
            case 2:
                Submenu.trigonometryMenu();
                break;
            case 3:
                Submenu.exponentsMenu();
                break;
            case 4:
                Submenu.logarithmsMenu();
                break;
            case 5:
                Submenu.inversionMenu();
                break;
            case 6:
                Submenu.miscMenu();
                break;
            case 7:
                Memory.memorySave();
                MainMenu.mainMenu();
                break;
            case 8:
                Memory.memoryReturn();
                MainMenu.mainMenu();
                break;
            case 9:
                Memory.memoryClear();
                MainMenu.mainMenu();
                break;
            case 10:
                Console.println("Bye!");
                System.exit(0);
                break;
            default:
                Console.println("\n Invalid selection. Please try again.");
                MainMenu.mainMenu();
        }

        return null;
    }

}