package io.github.aaronclong.calculator;

import java.util.ArrayList;

/**
 * Created by aaronlong on 4/29/17.
 */
public enum Lexer {
    NUMBER("NUMBER"),
    BASICOP("BASICOP"),
    WHITESPACE("WHITESPACE"),
    TRIG("TRIG"),
    BEGIN("BEGIN"),
    END("END");

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
        else type = "NOT";
        return type;
    }

    public static String analyze(String s) {
        String type = "";
        if (s.equals("sin")) type = Lexer.TRIG.name();
        return type;
    }

    public static void iterator(String text, ArrayList<String> list) {
        new LexerObject(text, list);
    }

    private static class LexerObject {

        private ArrayList<String> list;
        private String text;
        private StringBuilder data;
        private StringBuilder tmp;
        private String type;

        public LexerObject(String textParam, ArrayList<String> listParam) {
            list = listParam;
            text = textParam;
            data = new StringBuilder(20);
            tmp = new StringBuilder(40);
            for (char i : text.toCharArray()) {
                String lexerResult = Lexer.analyze(i);
                if (!lexerResult.equals("NOT")) handleSingleCharacter(lexerResult, i);
                else if (lexerResult.equals("NOT")) handleFunctionStrings(i);
            }
            String lex = String.format("%s %s", type, data.toString());
            list.add(lex);
        }

        private void handleFunctionStrings(char i) {
            if (!checkForParenths(i)) { tmp.append(i); }
            else if (i == '(') {
                String result = Lexer.analyze(tmp.toString());
                String lex = String.format("%s %s", result, tmp.toString());
                list.add(lex);
                list.add(String.format("%s ", Lexer.BEGIN.name()));
            }
            else if (i == ')') {
                list.add(String.format("%s ", Lexer.END.name()));
            }
        }

        private void handleSingleCharacter(String result, char i) {
            String lexerResult = Lexer.analyze(i);
            if (type == null) {
                type = result;
                data.append(i);
            }
            else if (!type.equals(lexerResult)) {
                String lex = String.format("%s %s", type, data.toString());
                list.add(lex);
                data = new StringBuilder(20);
                data.append(i);
                type = lexerResult;
            }
            else data.append(i);
        }

        private boolean checkForParenths(char c) {
            boolean exist = false;
            if (c == ')') exist = true;
            else if (c == '(') exist = true;
            return exist;
        }


    }
}
