package lindsay.devon.Calculator;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import com.sun.tools.internal.xjc.model.SymbolSpace;

import java.util.Scanner;
import java.lang.Double;

import static java.lang.Double.*;

/**
 * Created by devonlindsay on 9/12/16.
 */
public class UserInterfaceMenus {
    BasicCalculations basic = new BasicCalculations();
    TrigCalculations trig = new TrigCalculations();
    LogarithmicCalculations log = new LogarithmicCalculations();
    CurrentValueDisplay currentValue = new CurrentValueDisplay();
    Memory memory = new Memory();


    public double getuserNum() {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        double userNum = scanner.nextDouble();
        return userNum;
    }

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

        /// ERROR CHECK - ISNAN
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
            case 1: mathMenu();
                break;
            case 2: displayModeMenu();
                break;
            case 3: currentValue.date();
                welcomeMenu();
                break;
            case 4: currentValue.frustration();
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
            case 1: basicMathMenu();
                break;
            case 2: trigMenu();
                break;
            case 3: logMenu();
                break;
            case 4: memoryMenu();
                break;
            case 5: currentValue.resetCurrentValue();
                welcomeMenu();
                break;
            case 6: currentValue.setCurrentValue(getuserNum());
                welcomeMenu();
                break;
        }
    }

    public void basicMathMenu() {
        System.out.println("What would you like to do? ");
        System.out.println("[1] Add [2] Subtract [3] Multiply [4] Divide [5] Square [6] Square Root [7] Exponent [8] Inverse Num [9] Switch +/- [10] Factorial");
        Scanner scanner2 = new Scanner(System.in);
        int basicMath = scanner2.nextInt();
        basicMath(basicMath);

    }

    public void basicMath(int input) {

        switch (input) {
            case 1:
                currentValue.setCurrentValue(basic.add(currentValue.getCurrentValue(), getuserNum()));
                break;
            case 2:
                currentValue.setCurrentValue(basic.subtract(currentValue.getCurrentValue(), getuserNum()));
                break;
            case 3:
                currentValue.setCurrentValue(basic.multiply(currentValue.getCurrentValue(), getuserNum()));
                break;
            case 4:
                currentValue.setCurrentValue(basic.divide(currentValue.getCurrentValue(), getuserNum()));
                break;
            case 5:
                currentValue.setCurrentValue(basic.square(currentValue.getCurrentValue()));
                break;
            case 6:
                currentValue.setCurrentValue(basic.squareRoot(getuserNum()));
                break;
            case 7:
                currentValue.setCurrentValue(basic.exponent(currentValue.getCurrentValue(), getuserNum()));
                break;
            case 8:
                currentValue.setCurrentValue(basic.inverse(currentValue.getCurrentValue()));
                break;
            case 9:
                currentValue.setCurrentValue(basic.switchSign(currentValue.getCurrentValue()));
            case 10:
                currentValue.setCurrentValue(basic.factorial(currentValue.getCurrentValue()));
                default: welcomeMenu();
        }
        welcomeMenu();
    }

    public void trigMenu() {
        System.out.println("What would you like to do? ");
        System.out.println("[1] Sine [2] Cosine [3] Tangent [4] Inverse Sine [5] Inverse Cosine [6] Inverse Tangent");
        Scanner scanner2 = new Scanner(System.in);
        int trigonometry = scanner2.nextInt();
        trigonometry(trigonometry);

    }

    public void trigonometry(int input) {
        switch (input) {
            case 1:
                currentValue.setCurrentValue(trig.sine(currentValue.getCurrentValue()));
                break;
            case 2:
                currentValue.setCurrentValue(trig.cosine(currentValue.getCurrentValue()));
                break;
            case 3:
                currentValue.setCurrentValue(trig.tangent(currentValue.getCurrentValue()));
                break;
            case 4:
                currentValue.setCurrentValue(trig.inverseSine(currentValue.getCurrentValue()));
                break;
            case 5:
                currentValue.setCurrentValue(trig.inverseCosine(currentValue.getCurrentValue()));
                break;
            case 6:
                currentValue.setCurrentValue(trig.inverseTangent(currentValue.getCurrentValue()));
                break;
            default: welcomeMenu();

        }
        welcomeMenu();
    }

    public void logMenu() {
        System.out.println("What would you like to do? ");
        System.out.println("[1] log [2] 10^x [3] Ln [4] e^x");
        Scanner scanner2 = new Scanner(System.in);
        int logs = scanner2.nextInt();
        logs(logs);

    }

    public void logs(int input) {
        switch (input) {
            case 1:
                currentValue.setCurrentValue(log.log(currentValue.getCurrentValue()));
                break;
            case 2: currentValue.setCurrentValue(log.log10x(currentValue.getCurrentValue()));
                break;
            case 3: currentValue.setCurrentValue(log.logln(currentValue.getCurrentValue()));
                break;
            case 4: currentValue.setCurrentValue(log.logEx(currentValue.getCurrentValue()));
                default: welcomeMenu();
        }
        welcomeMenu();
    }

    public void displayModeMenu() {
        System.out.println("Do you want to cycle through or type your choice of Mode?");
        System.out.println("[1] Cycle through [2] Type my choice ");
        Scanner scanner3 = new Scanner(System.in);
        int modeDisplay = scanner3.nextInt();
        modeDisplay(modeDisplay);
    }
    public void modeDisplay(int input) {
        switch(input) {
            case 1:
                currentValue.cycleDisplayMode(currentValue.currentDisplayMode);
            case 2:
                currentValue.changeDisplayMode(currentValue.currentDisplayMode);
                    }
            welcomeMenu();
    }

    public void memoryMenu() {

        System.out.println("What do you want to do? ");
        System.out.println("[1] Store current value [2] Reset stored value to 0 [3] Recall stored value");
        Scanner scanner4 = new Scanner(System.in);
        int memory = scanner4.nextInt();
        memory(memory);
    }

    public void memory(int input) {
        switch(input) {
            case 1:
                currentValue.setCurrentValue(memory.storedValue);
            case 2:
                currentValue.setCurrentValue(memory.resetStoredValue());
            case 3:
                currentValue.setCurrentValue(memory.getStoredValue());
        }
        welcomeMenu();
    }
}


