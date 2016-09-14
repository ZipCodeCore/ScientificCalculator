package leczner.jon.Calculator;

import java.util.Scanner;

/**
 * Created by jonathanleczner on 9/12/16.
 */
public class Calculator {
    private boolean running;

    BasicMath basicMathUnit;
    Display display;
    Memory memory;

    public Calculator() {
        running = true;
        basicMathUnit = new BasicMath();
        display = new Display();
        memory = new Memory();
    }

    public void run() {
        System.out.println("0");
        while (running) {
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
            case "squareRoot":
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
                display.setState(display.getDisplayState());
                break;
            case "hex":
                display.switchDisplayMode(Display.Mode.HEX);
                display.setState(display.getDisplayState());
                break;
            case "decimal":
                display.switchDisplayMode(Display.Mode.DECIMAL);
                display.setState(display.getDisplayState());
                break;
            case "octal":
                display.switchDisplayMode(Display.Mode.OCTAL);
                display.setState(display.getDisplayState());
                break;
//            case "digits":
//                int digits = s.nextInt();
//                display.setSignificantDigits(digits);
//                break;
            case "store":
                memory.store();
                break;
            case "reset":
                memory.reset();
                break;
            case "recall":
                basicMathUnit.setState(memory.recall());
                break;
            case "clear":
                basicMathUnit.setState("0");
                break;
            case "quit":
                running = false;
                break;
            default:
                // do nothing
                break;
        }
        return;
    }

    public void update() {
        String state = basicMathUnit.getState();
        display.setState(state);
        memory.setCurrentState(state);
        return;
    }

    public void render() {
        display.showState();
        return;
    }
}
