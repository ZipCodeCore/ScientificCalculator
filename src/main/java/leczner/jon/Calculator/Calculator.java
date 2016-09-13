package leczner.jon.Calculator;

import java.util.Scanner;

/**
 * Created by jonathanleczner on 9/12/16.
 */
public class Calculator {
    BasicMath basicMathUnit;
    Display display;
    Memory memory;

    public Calculator() {
        basicMathUnit = new BasicMath();
        display = new Display();
        Memory = new Memory();
    }

    public void run() {
        Scanner s = display.getScanner();
        while (s.next() != "quit") {
            getInput();
            update();
            render();
        }
    }

    public void getInput() {
        Scanner s = display.getScanner();
        String input = s.next();
        double value;
        switch (input) {
            case "add":
                value = s.nextDouble();
                basicMathUnit.add(value);
                break;
            case "subtract":
                value = s.nextDouble();
                basicMathUnit.subtract(value);
                break;
            case "multiply":
                value = s.nextDouble();
                basicMathUnit.multiply(value);
                break;
            case "divide":
                value = s.nextDouble();
                basicMathUnit.divide(value);
                break;
            case "square":
                basicMathUnit.square();
                break;
            case "square root":
                basicMathUnit.squareRoot();
                break;
            case "exponent":
                value = s.nextDouble();
                basicMathUnit.exponent(value);
                break;
            case "inverse":
                basicMathUnit.inverse();
                break;
            case "switchSign":
                basicMathUnit.switchSign();
                break;
            case "factorial":
                basicMathUnit.factorial();
                break;
            case "mode":
                display.switchDisplayMode();
                break;
            case "binary":
                display.switchDisplayMode(Display.Mode.BINARY);
                break;
            case "hex":
                display.switchDisplayMode(Display.Mode.HEX);
                break;
            case "decimal":
                display.switchDisplayMode(Display.Mode.DECIMAL);
                break;
            case "octal":
                display.switchDisplayMode(Display.Mode.OCTAL);
                break;
            case "digits":
                value = s.nextInt();
                display.setSignificantDigits(value);
                break;
            case "store":
                memory.store();
                break;
            case "reset":
                memory.reset();
                break;
            case "recall":
                memory.recall();
                break;
            default:
                // do nothing
                break;
        }
    }

    public void update() {

    }

    // input
    // update
    // render

}
