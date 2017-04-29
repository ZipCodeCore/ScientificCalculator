package io.github.aaronclong;

/**
 * Created by aaronlong on 4/28/17.
 */
public class InputBuffer {
    private final String input;
    private String value;

    private InputBuffer(String inputValue) {
        input = inputValue;
    }

    public static InputBuffer makeInputBuffer(String inputValue) {
        if (inputValue == null) return null;
        return new InputBuffer(inputValue);
    }

    public String getValue() {
        computeValue();
        return value;
    }

    private void computeValue() {
        value = input;
    }
}
