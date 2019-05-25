package com.zcw.calculator;

import java.util.Stack;

public class ExpressionEvaluator {
    public String evaluate(String expression) {
        Stack<String> values = new Stack<String>();
        Stack<String> operators = new Stack<String>();
        String[] exSplit = expression.split(" ");
        for(int i = 0; i < exSplit.length; i++) {
            if (isNumeric(exSplit[i])) {
                values.push(exSplit[i]);
            }
            else {
                operators.push(exSplit[i]);
            }
        }
        System.out.println(values);
        System.out.println(operators);

        return null;
    }
    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
