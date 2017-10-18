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
        Lexer.iterator(input, lexed);
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
        private String functionOperation;
        private String functionState;

        public ParseObject() {
            for (String instruction : lexed) {
                String[] details = instruction.split(" ");
                if (details[0].equals(Lexer.WHITESPACE.name()))  { continue; }
                else if (details[0].equals(Lexer.NUMBER.name())) {
                    handleNumbers(details[1]);
                }
                else if (details[0].equals(Lexer.BASICOP.name())) {
                    basicOperationHandler(details[1]);
                }
                else if (details[0].equals(Lexer.TRIG.name())) {
                    trigHandler(details[1]);
                }
                else if (details[0].equals(Lexer.BEGIN.name())) functionState = Lexer.BEGIN.name();
                else if (details[0].equals(Lexer.END.name())) runFunction();
            }
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

        private void basicOperationHandler(String operation) {
            basicOperation = operation;
            previous = currentValue;
        }

        private void trigHandler(String operation) {
            functionOperation = operation;
        }

        private void runFunction() {
            functionState = null;
            currentValue = TrigFunctions.process(functionOperation, currentValue);
        }
    }
}
