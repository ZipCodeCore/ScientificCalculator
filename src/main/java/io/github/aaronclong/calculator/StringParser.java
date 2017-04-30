package io.github.aaronclong.calculator;

import java.util.ArrayList;

/**
 * Created by aaronlong on 4/29/17.
 */
public class StringParser {

    private final String input;

    private ArrayList<String> lexed;

    private StringParser(String inputVal) {
        input = inputVal;
        lexed = new ArrayList<String>();
        iterator();
    }

    public static StringParser makeStringParser(String inputVal) {
        return new StringParser(inputVal);
    }

    public double getValue() {
        return 0.0;
    }

    private void iterator() {
        StringBuilder cur = new StringBuilder(20);
        String type = null;
        for (char i : input.toCharArray()) {
            String lexerResult = Lexer.analize(i);
            if (type == null) {
                type = lexerResult;
                cur.append(i);
            }
            else if (!type.equals(lexerResult)) {
                String lex = String.format("%s %s", type, cur.toString());
                lexed.add(lex);
                cur = new StringBuilder(20);
                cur.append(i);
                type = lexerResult;
            }
            else cur.append(i);
        }
        String lex = String.format("%s %s", type, cur.toString());
        lexed.add(lex);
    }

}
