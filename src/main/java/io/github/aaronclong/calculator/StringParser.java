package io.github.aaronclong.calculator;

/**
 * Created by aaronlong on 4/29/17.
 */
public class StringParser {

    private final String input;

    private StringParser(String inputVal) {
        input = inputVal;
    }

    public static StringParser makeStringParser(String inputVal) {
        return new StringParser(inputVal);
    }

    public double getValue() {
        return 0.0;
    }
}
