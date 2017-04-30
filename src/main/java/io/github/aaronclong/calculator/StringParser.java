package io.github.aaronclong.calculator;

import java.util.ArrayList;

/**
 * Created by aaronlong on 4/29/17.
 */
public class StringParser {

    private final String input;

    private ArrayList<String> lexed;

    private double parsed;

    private StringParser(String inputVal) {
        input = inputVal;
        lexed = new ArrayList<String>();
        iterator();
        parse();
    }

    public static StringParser makeStringParser(String inputVal) {
        return new StringParser(inputVal);
    }

    public double getValue() {
        return parsed;
    }

    private void parse() {
        double previous = 0.0;
        double currentValue = 0.0;
        String basicOperation = null;
        for (String instruction : lexed) {
            String[] details = instruction.split(" ");
            if (details[0].equals(Lexer.WHITESPACE.name()))  { continue; }
            else if (details[0].equals(Lexer.NUMBER.name())) {
                if (basicOperation != null) {
                    currentValue = Double.parseDouble(details[1]);
                    currentValue = BasicMath.findOperation(basicOperation, previous, currentValue);
                    basicOperation = null;
                    continue;
                }
                previous = currentValue;
                currentValue = Double.parseDouble(details[1]);
            }
            else if (details[0].equals(Lexer.BASICOP.name())) {
                basicOperation = details[1];
                previous = currentValue;
            }
        }
        parsed = currentValue;
    }

    private void iterator() {
        StringBuilder cur = new StringBuilder(20);
        String type = null;
        for (char i : input.toCharArray()) {
            String lexerResult = Lexer.analyze(i);
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
