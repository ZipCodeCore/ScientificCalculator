package lindsay.devon.Calculator;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.Scanner;
/**
 * Created by devonlindsay on 9/12/16.
 */
public class UserInterfaceMenus {
    BasicCalculations basic = new BasicCalculations();
    TrigCalculations trig = new TrigCalculations();
    LogarithmicCalculations log = new LogarithmicCalculations();
    CurrentValueDisplay currentValue = new CurrentValueDisplay();


    public double getuserNum() {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        double userNum = scanner.nextDouble();
        return userNum;
    }



    public void welcome() {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Welcome to Devon's Calculator!");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        welcomeMenu();
    }

    public int welcomeMenu() {
        System.out.println("Please choose a destination: [1] Math  [2] DisplayMode [3] Memory");
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
            case 3: memoryMenu();
                break;
        }
    }

    public void mathMenu() {
        System.out.println("What would you like to do? ");
        System.out.println("[1] Basic Math [2] Trig [3] Logs");
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
        }
    }

    public void basicMathMenu() {
        System.out.println("What would you like to do? ");
        System.out.println("[1] Add [2] Subtract [3] Multiply [4] Divide [5] Square [6] Square Root [7] Exponent [8] Inverse Num [9] Switch +/-");
        Scanner scanner2 = new Scanner(System.in);
        int basicMath = scanner2.nextInt();
        basicMath(basicMath);

    }

    public void basicMath(int input) {

        switch (input) {
            case 1:
                currentValue.setCurrentValue(basic.add(currentValue.getCurrentValue(), getuserNum()));
                mathMenu();
                break;
            case 2:
                currentValue.setCurrentValue(basic.subtract(currentValue.getCurrentValue(), getuserNum()));
                mathMenu();
                break;
            case 3:
                currentValue.setCurrentValue(basic.multiply(currentValue.getCurrentValue(), getuserNum()));
                mathMenu();
                break;
            case 4:
                currentValue.setCurrentValue(basic.divide(currentValue.getCurrentValue(), getuserNum()));
                mathMenu();
                break;
            case 5:
                currentValue.setCurrentValue(basic.square(currentValue.getCurrentValue()));
                mathMenu();
                break;
            case 6:
                currentValue.setCurrentValue(basic.squareRoot(getuserNum()));
                mathMenu();
                break;
            case 7:
                currentValue.setCurrentValue(basic.exponent(currentValue.getCurrentValue(), getuserNum()));
                mathMenu();
                break;
            case 8:
                currentValue.setCurrentValue(basic.inverse(currentValue.getCurrentValue()));
                mathMenu();
                break;
            case 9:
                currentValue.setCurrentValue(basic.switchSign(currentValue.getCurrentValue()));
                mathMenu();
            default: mathMenu();
        }
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
                mathMenu();
                break;
            case 2:
                currentValue.setCurrentValue(trig.cosine(currentValue.getCurrentValue()));
                mathMenu();
                break;
            case 3:
                currentValue.setCurrentValue(trig.tangent(currentValue.getCurrentValue()));
                mathMenu();
                break;
            case 4:
                currentValue.setCurrentValue(trig.inverseSine(currentValue.getCurrentValue()));
                mathMenu();
                break;
            case 5:
                currentValue.setCurrentValue(trig.inverseCosine(currentValue.getCurrentValue()));
                mathMenu();
                break;
            case 6:
                currentValue.setCurrentValue(trig.inverseTangent(currentValue.getCurrentValue()));
                mathMenu();
                break;
            default: mathMenu();

        }

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
                mathMenu();
                break;
            case 2: currentValue.setCurrentValue(log.log10x(currentValue.getCurrentValue()));
                mathMenu();
                break;
            case 3: currentValue.setCurrentValue(log.logln(currentValue.getCurrentValue()));
                mathMenu();
                break;
            case 4: currentValue.setCurrentValue(log.logEx(currentValue.getCurrentValue()));
                mathMenu();
            default: mathMenu();



        }
    }

    public void displayModeMenu() {
        System.out.println("under construction");
    }

    public void memoryMenu() {
        System.out.println("under construction");
    }
}


