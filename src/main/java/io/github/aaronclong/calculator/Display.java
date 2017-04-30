package io.github.aaronclong.calculator;

/**
 * Created by aaronlong on 4/28/17.
 */
public class Display {

    public void addInput(String input) {
        InputBuffer buffer = InputBuffer.makeInputBuffer(input);
        Display.addToScreen(Double.toString(buffer.getValue()));
    }

    private static void addToScreen(String input) {
        System.out.println(input);
    }
}
