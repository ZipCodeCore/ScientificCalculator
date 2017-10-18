package io.github.aaronclong.calculator;

/**
 * Created by aaronlong on 4/28/17.
 */
public class InputBuffer {
    private final String input;
    private double value;

    private InputBuffer(String inputValue) {
        input = inputValue;
    }

    public static InputBuffer makeInputBuffer(String inputValue) {
        if (inputValue == null) return null;
        return new InputBuffer(inputValue);
    }

    public double getValue() {
        computeValue();
        return value;
    }

    private void computeValue() {
        StringParser parser = StringParser.makeStringParser(input);
        value = parser.getValue();
    }
}
