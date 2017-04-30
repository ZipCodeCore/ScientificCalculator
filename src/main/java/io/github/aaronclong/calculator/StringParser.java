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
        parsed = new ParseObject().getValue();
    }

    private class ParseObject {
        private double previous;
        private double currentValue;
        private String basicOperation;

        public ParseObject() {
            for (String instruction : lexed) {
                String[] details = instruction.split(" ");
                if (details[0].equals(Lexer.WHITESPACE.name()))  { continue; }
                else if (details[0].equals(Lexer.NUMBER.name())) {
                    handleNumbers(details[1]);
                }
                else if (details[0].equals(Lexer.BASICOP.name())) {
                    basicOperation = details[1];
                    previous = currentValue;
                }
            }
            parsed = currentValue;
        }

        public double getValue() {
            return currentValue;
        }

        private void handleNumbers(String nums) {
            if (basicOperation != null) {
                currentValue = Double.parseDouble(nums);
                currentValue = BasicMath.findOperation(basicOperation, previous, currentValue);
                basicOperation = null;
                return;
            }
            previous = currentValue;
            currentValue = Double.parseDouble(nums);
        }
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
