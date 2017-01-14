package mccann.kevin.calculator;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kevinmccann on 1/13/17.
 */
public class Display {

    Scanner scanner = new Scanner(System.in);
    public static String displayValue = "";
    double firstValue = 0;
    double currentValue = 0;
    double memory = 0;
    String command;
    public DisplayMode currentMode = DisplayMode.DECIMAL;
    boolean errorStatus = false;
    double answer;
    ArrayList<String> commandList = new ArrayList<String>(Arrays.asList("ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "POWER", "FACTORIAL", "SQUARE", "SQUAREROOT", "INVERSE", "SINE", "COSINE", "TANGENT", "INVERSESIN", "INVERSECOS", "INVERSETAN", "LOG", "INVERSELOG", "LN", "INVERSELN");

    public void run() {
        Calculator calc = new Calculator();
        UserInterface UI = new UserInterface();
        System.out.println("What would you like to do? CALCULATE  CHANGE DISPLAY");
        firstValue = UI.getNumInput();
        command = UI.getCommandInput();
        if (commandList.indexOf(command) < 5) {
            currentValue = UI.getNumInput();
            answer = calc.evaluateTwo(command, firstValue, currentValue);
        } else {
            answer = calc.evaluate(command, firstValue);
        }


    }

    public String display(double input) {
        displayValue = Double.toString(input);
        this.firstValue = input;
        System.out.println(displayValue);
        return displayValue;
    }

    public String display(String input) {
        displayValue = input;
        System.out.println(displayValue);
        return displayValue;
    }

    public double getCurrentValue() {
        return this.currentValue;
    }

    public void setCurrentValue(double value) {
        this.currentValue = value;
    }

    public void clearCurrentValue() {
        currentValue = 0;
    }

    public void errorDisplay() {
        displayValue = "ERR";
    }

    public double switchSign(double x) {
        return -x;
    }

    public void storeToMemory(double x){
        this.memory = x;
    }

    public void clearMemory(){
        this.memory = 0;
    }

    public void recallMemory(){
        String m = Double.toString(memory);
        displayValue = m;
    }

    public void setDisplayMode(DisplayMode displayMode) {
        this.currentMode = displayMode;

        switch(displayMode) {
            case BINARY:
                binaryMode();
                break;
            case HEX:
                hexMode();
                break;
            case OCTAL:
                octalMode();
                break;
            default:
                break;
        }


    }

    public void switchDisplayMode() {
        int i = DisplayMode.valueOf(currentMode.toString()).ordinal();
        if(i<4)
            i++;
        else
            i=0;
        setDisplayMode(DisplayMode.values()[i]);
        }

    public String binaryMode() {
        int currentInt = (int) firstValue;
        return Integer.toBinaryString(currentInt);
    }

    public String hexMode() {
        int currentInt = (int) firstValue;
        return Integer.toHexString(currentInt);
    }

    public String octalMode() {
        int currentInt = (int) firstValue;
        return Integer.toOctalString(currentInt);
    }
}