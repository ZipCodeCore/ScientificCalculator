package lindsay.devon.Calculator;

import java.util.Scanner;

import static java.lang.Double.isInfinite;

/**
 * Created by devonlindsay on 9/13/16.
 */
public class Calculator {
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




    public double basicMath(int input) {
        System.out.println(currentValue.getCurrentValue());
        switch (input) {
            case 1:
                currentValue.setCurrentValue(basic.add(currentValue.getCurrentValue(), getuserNum()));
                double addResult = (basic.add(currentValue.getCurrentValue(), getuserNum()));
                return addResult;
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
                break;
            case 10:
                currentValue.setCurrentValue(basic.factorial(currentValue.getCurrentValue()));
            default:
                currentValue.setCurrentValue(currentValue.getCurrentValue());
        }
        return currentValue.getCurrentValue();
    }


    public double trigInRadians(int input) {
        currentValue.setCurrentValue(Math.toRadians(currentValue.getCurrentValue()));
        System.out.println(currentValue.getCurrentValue());
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
            case 7:
                currentValue.setCurrentValue(Math.toRadians(getuserNum()));
                break;

            default: currentValue.setCurrentValue(currentValue.getCurrentValue());

        }
        return currentValue.getCurrentValue();
    }


    public double trigInDegrees(int input) {
        currentValue.setCurrentValue(Math.toDegrees(currentValue.getCurrentValue()));
        System.out.println("Your current value is: " + currentValue.getCurrentValue() + " degrees");
        switch (input) {
            case 1:
                currentValue.setCurrentValue(trig.sine(Math.toDegrees(currentValue.getCurrentValue())));
                break;
            case 2:
                currentValue.setCurrentValue(trig.cosine(Math.toDegrees(currentValue.getCurrentValue())));
                break;
            case 3:
                currentValue.setCurrentValue(trig.tangent(Math.toDegrees(currentValue.getCurrentValue())));
                break;
            case 4:
                currentValue.setCurrentValue(trig.inverseSine(Math.toDegrees(currentValue.getCurrentValue())));
                break;
            case 5:
                currentValue.setCurrentValue(trig.inverseCosine(Math.toDegrees(currentValue.getCurrentValue())));
                break;
            case 6:
                currentValue.setCurrentValue(trig.inverseTangent(Math.toDegrees(currentValue.getCurrentValue())));
                break;
            case 7:
                currentValue.setCurrentValue(Math.toDegrees(getuserNum()));
                break;
            default:
                currentValue.setCurrentValue(currentValue.getCurrentValue());
        }
        return currentValue.getCurrentValue();
    }

    public double memory(int input) {
        System.out.println(currentValue.getCurrentValue());
        switch(input) {
            case 1:
                currentValue.setCurrentValue(memory.storedValue);
            case 2:
                currentValue.setCurrentValue(memory.resetStoredValue());
            case 3:
                currentValue.setCurrentValue(memory.getStoredValue());
        }
        return currentValue.getCurrentValue();
    }



    public double logs(int input) {
        System.out.println(currentValue.getCurrentValue());
        switch (input) {
            case 1:
                currentValue.setCurrentValue(log.log(currentValue.getCurrentValue()));
                break;
            case 2: currentValue.setCurrentValue(log.log10x(currentValue.getCurrentValue()));
                break;
            case 3: currentValue.setCurrentValue(log.logln(currentValue.getCurrentValue()));
                break;
            case 4: currentValue.setCurrentValue(log.logEx(currentValue.getCurrentValue()));
            default: currentValue.setCurrentValue(currentValue.getCurrentValue());
        }
        return currentValue.getCurrentValue();
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
        // welcomeMenu();
    }

}
