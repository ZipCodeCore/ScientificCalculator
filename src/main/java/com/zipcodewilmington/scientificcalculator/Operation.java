package com.zipcodewilmington.scientificcalculator;

public class Operation {
    public static Boolean isSetting(String op) {
        if ("c".equals(op) || "m".equals(op) || "m+".equals(op) ||
                "mc".equals(op) || "rad".equals(op)) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean isUnary(String op)
    {
        if ("inv".equals(op) || "bin".equals(op) || "oct".equals(op) || "dec".equals(op) || "hex".equals(op) ||
                "mode".equals(op) || "sq".equals(op) || "sqrt".equals(op) || "sin".equals(op) || "cos".equals(op) ||
                "tan".equals(op) || "invsin".equals(op) || "invcos".equals(op) || "invtan".equals(op) || "log".equals(op) ||
                "nlog".equals(op) || "invlog".equals(op) || "invnlog".equals(op) || "!".equals(op) || "fib".equals(op)) {
            return true;
        } else {
                return false;
        }
    }

    public static Boolean isBinary(String op)
    {
        if("+".equalsIgnoreCase(op) || "-".equalsIgnoreCase(op) || "*".equalsIgnoreCase(op) ||
                "/".equalsIgnoreCase(op) || "exp".equalsIgnoreCase(op)) {
            return true;
        }
        else {
            return false;
        }
    }
}