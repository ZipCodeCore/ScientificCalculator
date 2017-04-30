package io.github.aaronclong.calculator;

/**
 * Created by aaronlong on 4/29/17.
 */
public enum Lexer {
    NUMBER("NUMBER"), BASICOP("BASICOP"), WHITESPACE("WHITESPACE");

    private final String description;

    Lexer(String value) {
        description = value;
    }

    public static String analyze(char c) {
        String type = "";
        if (Character.isDigit(c)) type = Lexer.NUMBER.name();
        else if (c == ',' || c == '.') Lexer.NUMBER.name();
        else if (c == ' ') type = Lexer.WHITESPACE.name();
        else if (c == '*' || c == '+' || c == '-' || c == '/') type = Lexer.BASICOP.name();
        return type;
    }
}
