package leczner.jon.Calculator;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by jonathanleczner on 9/12/16.
 */
public class Display {
    private String state;
    private String trueState;
    private int significantDigits;

    public enum Mode {DECIMAL, HEX, BINARY, OCTAL}
    private Mode mode;
    private Scanner scanner;

    public Display() {
        state = "0";
        significantDigits = 6;
        mode = Mode.DECIMAL;
        scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void clear() {
        state = "0";
    }

    public void showState() {
//        formatState();
        System.out.println(state);
    }

    public void switchDisplayMode() {
        switch (mode) {
            case DECIMAL:
                mode = Mode.HEX;
                state = new BigInteger(state, 16).toString(16);
                break;
            case HEX:
                mode = Mode.BINARY;
                state = new BigInteger(state, 16).toString(2); // Mike Samuel on stackoverflow
                break;
            case BINARY:
                mode = Mode.OCTAL;
                long binary = Long.parseLong(state, 2);
                state = Long.toOctalString(binary);
                break;
            case OCTAL:
                mode = Mode.DECIMAL;
                double newState = 0;
                int i = 0;
                double octal = Double.valueOf(state);
                while(octal != 0)
                {
                    newState = newState + (octal%10) * (int) Math.pow(8, i);
                    i++;
                    octal = octal/10;
                }
                state = String.valueOf(newState);
                break;
            default:
                System.out.println("How did it come to this? (no mode available)");
                break;
        }
    }

    public void switchDisplayMode(Mode mode) {
        this.mode = mode;
    }

//    public void setSignificantDigits(int digits) {
//        significantDigits = digits;
//    }

//    public void formatState() {
//        trueState = state;
//        int trueDigits = state.length();
//        if (state.contains("."))
//            trueDigits--;
//        if (state.contains("-"))
//            trueDigits--;
//
//        if (trueDigits > significantDigits) {
//            state = state.substring(0, significantDigits + 1); // trim to significantDigit total + "."
//            if (state.endsWith("."))
//                state = state.substring(0, state.length() - 1);
//        }
//        else
//            return;
//    }

}
