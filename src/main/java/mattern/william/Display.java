package mattern.william;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by williammattern on 1/13/17.
 */
public class Display {
    static Scanner scanner = new Scanner(System.in);
    static double initialValue = 0;
    static double currentValue;
    static double calculatedValue;
    static String operatorCode;
    static String operatorCodeOptionsPrompt = "Give me an operation - add - multiply - subtract - divide - clear - signinversion(-x) - invert(1/x) - square - squareroot";



    static public void getInitialValue(){
        System.out.println(Display.initialValue);
        System.out.println("getInitialValue asking user for initial value");
        System.out.println("give me a number");
        Display.initialValue = scanner.nextDouble();
        System.out.println("getInitialValue() calling getOperatorCode()");
        getOperatorCode();
    }

    static public void getOperatorCode(){
        System.out.println("getOperatorCode() asking user for operatorCode");
        System.out.println(operatorCodeOptionsPrompt);
        Display.operatorCode = scanner.next();
        if (Display.operatorCode.equals("clear")){
            Display.clearDisplay();
        } else if (Display.operatorCode.equals("invert")){
            System.out.println("getOperatorCode() received invert message");
            System.out.println(initialValue);
            Choice.pickChoice(Display.operatorCode);
        } else {
            System.out.println("getOperatorCode() calling getCurrentValue()");
            getCurrentValue();
        }
    }

    static public void getCurrentValue() {
        System.out.println("getCurrentValue() asking user for currentValue");
        System.out.println("give me another number");
        System.out.println(operatorCode);
        Display.currentValue = scanner.nextDouble();
        Choice.pickChoice(Display.operatorCode);
    }

    static public void displayAfterCalculating(){
        Display.initialValue = Display.calculatedValue;
        System.out.println(Display.calculatedValue);
        System.out.println(operatorCodeOptionsPrompt);
        Display.operatorCode = scanner.next();
        if (Display.operatorCode.equals("clear")){
            Display.clearDisplay();
        } else if (Display.operatorCode.equals("invert")){
            System.out.println("displayAfterCalculating() received invert message");
            System.out.println(initialValue);
            Choice.pickChoice(Display.operatorCode);
        } else {
            System.out.println("displayAfterCalculating() calling getCurrentValue()");
            getCurrentValue();
        }
    }

    static public void clearDisplay(){
        Display.initialValue = 0;
        getInitialValue();
    }

    static public void sendErrorMessage(){
        System.out.println("ERR");
    }
}
