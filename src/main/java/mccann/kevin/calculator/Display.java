package mccann.kevin.calculator;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kevinmccann on 1/13/17.
 */
public class Display {

    public static String displayValue = "";
    double firstValue = 0;
    double currentValue = 0;
    double memory = 0;
    String command;
    public DisplayMode currentMode = DisplayMode.DECIMAL;
    String angleDisplay = "radians";
    boolean notError = true;
    double answer;
    ArrayList<String> commandList = new ArrayList<String>(Arrays.asList("ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "POWER", "FACTORIAL", "SQUARE", "SQUAREROOT", "INVERSE", "SINE", "COSINE", "TANGENT", "INVERSESIN", "INVERSECOS", "INVERSETAN", "LOG", "INVERSELOG", "LN", "INVERSELN", "M+", "MC", "MRC"));

    public void run() {
        Calculator calc = new Calculator();
        UserInterface UI = new UserInterface();
//        while(notError) {
            UI.displaySettingsChoice();
            firstValue = UI.getNumInput();
            command = UI.getCommandInput();
            if (commandList.indexOf(command) < 5) {
                currentValue = UI.getNumInput();
                answer = calc.evaluateTwo(command, firstValue, currentValue);
            } else {
                answer = calc.evaluate(command, firstValue);
            }
            display(answer);

//        };
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

    public void errorDisplay() {
        displayValue = "ERR";
        run();
    }

    public double switchSign(double x) {
        return -x;
    }

    public void setMemory(double value) {
        this.memory = value;
    }

    public double getMemory() {
        return memory;
    }

    public void switchDisplayMode(DisplayMode displayMode) {
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
        switchDisplayMode(DisplayMode.values()[i]);
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

    public void switchUnits() {
        if(angleDisplay.equals("degrees"))
            currentValue = toRadians(currentValue);
        if (angleDisplay.equals("radians"))
            currentValue = toDegrees(currentValue);
    }

    public void switchUnits(String angleDisplay) {
        if (angleDisplay.toLowerCase().equals("degrees"))
            currentValue = toDegrees(currentValue);
        if (angleDisplay.toLowerCase().equals("radians"))
            currentValue = toRadians(currentValue);
    }

    public double toDegrees(double rad) {
        return Math.toDegrees(rad);
    }

    public double toRadians(double deg) {
        return Math.toRadians(deg);
    }



}