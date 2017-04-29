package io.github.aaronclong;

/**
 * Created by aaronlong on 4/28/17.
 */
public class InputBuffer {
    private final String value;

    private InputBuffer(String inputValue) {
        value = inputValue;
    }

    public static InputBuffer makeInputBuffer(String inputValue) {
        if (inputValue == null) return null;
        return new InputBuffer(inputValue);
    }

    public String getValue() {
        return value;
    }
}
