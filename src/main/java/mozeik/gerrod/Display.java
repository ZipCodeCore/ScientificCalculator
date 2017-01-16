package mozeik.gerrod;

import java.util.Scanner;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class Display {

    static Scanner scanner = new Scanner(System.in);
    static double initialValue;
    static double currentValue;
    static double calculatedValue;
    static String operatorCode;

    static public void getInitialValue() {
        System.out.println("Enter a number.");
        Display.initialValue = scanner.nextDouble();
        getOperatorCode();
        getCurrentValue();
    }

    static public void getOperatorCode() {
        System.out.println("add/subtract/divide/multiply/clear\ninvert/square/squareroot/tothepowerof/signinvert/factorial\nsin/cos/tan/asin/acos/atan\ndegreestoradians/radianstodegrees");
        Display.operatorCode = scanner.next();
        if (Display.operatorCode.equals("clear")) {
            Display.clearDisplay();
        } else if (Display.operatorCode.equals("invert")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("square")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("squareroot")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("signinvert")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("factorial")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("sin")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("cos")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("tan")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("asin")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("acos")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("atan")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("radianstodegrees")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("degreestoradians")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else {
            getCurrentValue();
        }
    }

    static public void clearDisplay() {
        getInitialValue();
    }

    static public void getCurrentValue() {
        System.out.println("Enter another number.");
        Display.currentValue = scanner.nextDouble();
        Choice.pickChoice(Display.operatorCode);
    }

    static public void displayAfterCalculating() {
        Display.initialValue = Display.calculatedValue;
        System.out.println(Display.calculatedValue);
        System.out.println("add/subtract/divide/multiply/clear\ninvert/square/squareroot/tothepowerof/signinvert/factorial\nsin/cos/tan/asin/acos/atan\ndegreestoradians/radianstodegrees");
        Display.operatorCode = scanner.next();
        if (Display.operatorCode.equals("clear")) {
            Display.clearDisplay();
        }
        else if (Display.operatorCode.equals("invert")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("square")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("squareroot")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("signinvert")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("factorial")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("sin")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("cos")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("tan")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("asin")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("acos")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("atan")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("radianstodegrees")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else if (Display.operatorCode.equals("degreestoradians")) {
            Choice.pickChoice(Display.operatorCode);
            getInitialValue();
        } else {
            getCurrentValue();
        }
    }

    public static void displayErrorMessage() {
        System.out.println("ERR");
    }

}
