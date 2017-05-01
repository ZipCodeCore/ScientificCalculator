package io.github.aaronclong.calculator;

import java.util.ArrayList;

/**
 * Created by aaronlong on 4/29/17.
 */
public enum Lexer {
    NUMBER("NUMBER"),
    BASICOP("BASICOP"),
    WHITESPACE("WHITESPACE"),
    TRIG("TRIG");

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

    public static void iterator(String text, ArrayList<String> list) {
        StringBuilder cur = new StringBuilder(20);
        String type = null;
        for (char i : text.toCharArray()) {
            String lexerResult = Lexer.analyze(i);
            if (type == null) {
                type = lexerResult;
                cur.append(i);
            }
            else if (!type.equals(lexerResult)) {
                String lex = String.format("%s %s", type, cur.toString());
                list.add(lex);
                cur = new StringBuilder(20);
                cur.append(i);
                type = lexerResult;
            }
            else cur.append(i);
        }
        String lex = String.format("%s %s", type, cur.toString());
        list.add(lex);
    }
}
