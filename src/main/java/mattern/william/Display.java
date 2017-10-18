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
    static String operatorCodeOptionsPrompt = "Choose an operation:\nadd - multiply - subtract - divide - clear - signinversion(-x)\n" +
            " /invert(1/x)/square/squareroot/tothepowerof/factorial\n" +
            " sin/cos/tan/arcsin/arccos/arctan/todegrees/toradians\n";

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
        } else if (Display.operatorCode.equals("square")) {
            System.out.println("getOperatorCode() received square message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("squareroot")) {
            System.out.println("getOperatorCode() received squareroot message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("signinversion")) {
            System.out.println("getOperatorCode() received signinversion message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("factorial")) {
            System.out.println("getOperatorCode() received factorial message");
             Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("sin")) {
            System.out.println("getOperatorCode() received sine message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("cos")) {
            System.out.println("getOperatorCode() received cosine message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("tan")) {
            System.out.println("getOperatorCode() received tangent message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("arcsin")) {
            System.out.println("getOperatorCode() received arcsine message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("arccos")) {
            System.out.println("getOperatorCode() received arccosine message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("arctan")) {
            System.out.println("getOperatorCode() received arctangent message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("todegrees")) {
            System.out.println("getOperatorCode() received todegrees message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("toradians")) {
            System.out.println("getOperatorCode() received toradians message");
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
        } else if (Display.operatorCode.equals("invert")) {
            System.out.println("displayAfterCalculating() received invert message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("square")) {
            System.out.println("displayAfterCalculating() received square message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("squareroot")) {
            System.out.println("displayAfterCalculating() received squareroot message");
         } else if (Display.operatorCode.equals("signinversion")) {
            System.out.println("displayAfterCalculating() received signinversion message");
            System.out.println(operatorCode);
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("factorial")) {
            System.out.println("displayAfterCalculating() received factorial message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("sine")) {
            System.out.println("displayAfterCalculating() received sine message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("cosine")) {
            System.out.println("displayAfterCalculating() received cosine message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("tangent")) {
            System.out.println("displayAfterCalculating() received tangent message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("arcsin")) {
            System.out.println("displayAfterCalculating() received arcsine message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("arccos")) {
            System.out.println("displayAfterCalculating() received arcosine message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("arctan")) {
            System.out.println("displayAfterCalculating() received arctangent message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("todegrees")) {
            System.out.println("displayAfterCalculating() received todegrees message");
            Choice.pickChoice(Display.operatorCode);
        } else if (Display.operatorCode.equals("toradians")) {
            System.out.println("displayAfterCalculating() received toradians message");
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
