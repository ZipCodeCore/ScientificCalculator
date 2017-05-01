package io.github.aaronclong.calculator;

/**
 * Created by aaronlong on 4/28/17.
 */

public class Display {

    private InputStore store;

    public Display() {
        store = new InputStore();
    }

    public void addInput(String input) {
        InputBuffer buffer = InputBuffer.makeInputBuffer(input);
        String screenValue = (Double.compare(buffer.getValue(), Double.NaN) == 1) ? Double.toString(buffer.getValue()) : "Err";
        Display.addToScreen(screenValue);
        store.add(buffer);
    }

    private static void addToScreen(String input) {
        System.out.println(input);
    }
}
