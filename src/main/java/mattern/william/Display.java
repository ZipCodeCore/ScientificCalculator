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
    static String operatorCodeOptionsPrompt = "Give me an operation - add - multiply - subtract - divide - clear - invert";

    static public void clearDisplay(){
        Display.initialValue = 0;
        getInitialValue();
    }


    static public void getInitialValue(){
        System.out.println(Display.initialValue);
        System.out.println("give me a number");
        Display.initialValue = scanner.nextDouble();
        getOperatorCode();
        getCurrentValue();
    }

    static public void getCurrentValue() {
        System.out.println("give me another number");
        Display.currentValue = scanner.nextDouble();
        Choice.pickChoice(Display.operatorCode);
    }

    static public void getOperatorCode(){
        System.out.println(operatorCodeOptionsPrompt);
        Display.operatorCode = scanner.next();
        if (Display.operatorCode.equals("clear")){
            Display.clearDisplay();
        }
    }

    static public void displayAfterCalculating(){
        Display.initialValue = Display.calculatedValue;
        System.out.println(Display.calculatedValue);
        System.out.println(operatorCodeOptionsPrompt);
        Display.operatorCode = scanner.next();
        if (Display.operatorCode.equals("clear")){
            Display.clearDisplay();
        }
    }

    static public void sendErrorMessage(){
        System.out.println("ERR");
    }
}
