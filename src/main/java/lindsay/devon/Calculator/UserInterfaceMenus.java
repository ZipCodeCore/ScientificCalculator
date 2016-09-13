package lindsay.devon.Calculator;

import java.util.Scanner;
import java.lang.Double;

import static java.lang.Double.*;

/**
 * Created by devonlindsay on 9/12/16.
 */
public class UserInterfaceMenus {
  CurrentValueDisplay currentValue = new CurrentValueDisplay();
    Calculator calculator = new Calculator();


    public boolean checkErrors() {
        return Double.isNaN(currentValue.getCurrentValue()) || isInfinite(currentValue.getCurrentValue());
    }

    public void welcome() {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Welcome to Devon's Calculator!");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        welcomeMenu();
    }

    public int welcomeMenu() {
        if (checkErrors()) {
            System.out.println("ERR");
            System.out.println("Please reset or change current value");
        }

        System.out.println(currentValue.getCurrentValue());
        System.out.println("Please choose a destination: [1] Math  [2] DisplayMode [3] Date [4] Express Frustration");
        Scanner scanner1 = new Scanner(System.in);
        int menuChoice = scanner1.nextInt();
        welcomeMenuChoice(menuChoice);
        return menuChoice;
    }

    public void welcomeMenuChoice(int input) {
        switch (input) {
            case 1:
                mathMenu();
                break;
            case 2:
                displayModeMenu();
                break;
            case 3:
                currentValue.date();
                welcomeMenu();
                break;
            case 4:
                currentValue.frustration();
                welcomeMenu();
            }

    }

    public void mathMenu() {
        System.out.println("What would you like to do? ");
        System.out.println("[1] Basic Math [2] Trig [3] Logs [4] Memory [5] Reset Current Value to 0 [6] Change current value");
        Scanner scanner2 = new Scanner(System.in);
        int mathMenuChoice = scanner2.nextInt();
        mathMenuChoice(mathMenuChoice);


    }

    public void mathMenuChoice(int input) {
        switch (input) {
            case 1:
                basicMathMenu();
                break;
            case 2:
                trigDisplayMenu();
                break;
            case 3:
                logMenu();
                break;
            case 4:
                memoryMenu();
                break;
            case 5:
                currentValue.resetCurrentValue();
                welcomeMenu();
                break;
            case 6:
                currentValue.setCurrentValue(calculator.getuserNum());
                welcomeMenu();
                break;
        }
    }

    public void basicMathMenu() {
        System.out.println("What would you like to do? ");
        System.out.println("[1] Add [2] Subtract [3] Multiply [4] Divide [5] Square [6] Square Root [7] Exponent [8] Inverse Num [9] Switch +/- [10] Factorial");
        Scanner scanner2 = new Scanner(System.in);
        int basicMath = scanner2.nextInt();
        calculator.basicMath(basicMath);
        welcomeMenu();

    }


    public void trigDisplayMenu() {
        // currentValue.setCurrentValue(Math.toRadians(currentValue.getCurrentValue()));
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Current Value Converted to Radians");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Your current value is: " + currentValue.getCurrentValue());
        System.out.println("What would you like to do?");
        System.out.println("[1] Trig in Radians [2] Trig in Degrees");
        Scanner scanner6 = new Scanner(System.in);
        int trigDisplay = scanner6.nextInt();
        trigDisplay(trigDisplay);

    }


    public void trigDisplay(int input) {
        switch (input) {
            case 1:
                trigRadianMenu();
                break;
            case 2:
                trigSwitchToDegrees();
        }
    }


    public void trigRadianMenu() {
        currentValue.setCurrentValue(Math.toRadians(currentValue.getCurrentValue()));
        System.out.println("What would you like to do? ");
        System.out.println("[1] Sine [2] Cosine [3] Tangent [4] Inverse Sine [5] Inverse Cosine [6] Inverse Tangent [7] Convert From Radians to Degrees ");
        Scanner scanner2 = new Scanner(System.in);
        int trigonometry = scanner2.nextInt();
        calculator.trigInRadians(trigonometry);
        trigDisplayMenu();

    }


    public void trigSwitchToDegrees() {
        currentValue.setCurrentValue(Math.toDegrees(currentValue.getCurrentValue()));
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Current Value is now in Degrees");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Your current value is: " + currentValue.getCurrentValue() + " degrees");
        trigDegreesMenu();
    }

    public void trigDegreesMenu() {
        System.out.println("What would you like to do? ");
        System.out.println("[1] Sine [2] Cosine [3] Tangent [4] Inverse Sine [5] Inverse Cosine [6] Inverse Tangent [7] Convert From Degrees to Radians ");
        Scanner scanner2 = new Scanner(System.in);
        int trigInDegrees = scanner2.nextInt();
        calculator.trigInDegrees(trigInDegrees);
        trigDisplayMenu();
    }





    public void logMenu() {
        System.out.println("What would you like to do? ");
        System.out.println("[1] log [2] 10^x [3] Ln [4] e^x");
        Scanner scanner2 = new Scanner(System.in);
        int logs = scanner2.nextInt();
        calculator.logs(logs);
        welcomeMenu();

    }



    public void displayModeMenu() {
        System.out.println("Do you want to cycle through or type your choice of Mode?");
        System.out.println("[1] Cycle through [2] Type my choice ");
        Scanner scanner3 = new Scanner(System.in);
        int modeDisplay = scanner3.nextInt();
        modeDisplay(modeDisplay);
        welcomeMenu();
    }


    public void modeDisplay(int input) {
        Scanner scanner5 = new Scanner(System.in);
        switch(input) {
            case 1:
                currentValue.cycleDisplayMode();
                break;
            case 2:
                System.out.println(" Please type your choice of the following: -decimal -binary -octal -hexadecimal");
                currentValue.changeDisplayMode(scanner5.next());
                break;
                    }
            welcomeMenu();
    }

    public void memoryMenu() {
        System.out.println("What do you want to do? ");
        System.out.println("[1] Store current value [2] Reset stored value to 0 [3] Recall stored value");
        Scanner scanner4 = new Scanner(System.in);
        int memory = scanner4.nextInt();
        calculator.memory(memory);
        welcomeMenu();
    }


}


