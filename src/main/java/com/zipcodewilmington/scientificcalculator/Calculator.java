package com.zipcodewilmington.scientificcalculator;

public class Calculator extends Console {
    static String[] oneSidedOp = {"SIN","COS","TAN","ASIN","ACOS","ATAN","LOG","LN","E^X","10^X","!",
            "SQ","SQRT","INV","INVSIGN"};
    static String[] twoSidedOp = {"+","-","*","/","^"};
    static String[] command = {"C","M+","MC","MRC"};

    private String userInput;
    private boolean isWaitingForNumInput;
    private boolean isErr;
    private Core core;
    private Extended extended;

    public Calculator() {
        userInput = "";
        isWaitingForNumInput = false;
        isErr = false;
        core = new Core();
        extended = new Extended();

    }

    public void run() {

        while (!userInput.equals("Q")) {
//            println(Double.toString(core.getCurNum()));
//            println(userInput);
            if(isErr) {
                if(userInput.equals("C")) {
                    core.clear();
                    isErr = false;
                }
            }
            else {
                if(isWaitingForNumInput) {
                    if(isNumeric(userInput)) {
                        doTwoSideOp(userInput);
                        isWaitingForNumInput = false;
                    }
                    else {
                        core.setDisplayErr("Syntax Error");
                        isErr = true;
                    }
                }
                else {
                    if(isNumeric(userInput)) {
                        core.setCurNum(Double.parseDouble(userInput));
                        core.setDisplay(extended.convertOutput(core.getCurNum()));
                    }
                    else if (validOperator(userInput)==1)
                        doOneSideOp(userInput);
                    else if (validOperator(userInput)==2) {
                        isWaitingForNumInput = true;
                        core.addToDisplay(userInput);
                    }
                    else if (validOperator(userInput)==3)
                        doCommand(userInput);
                    else if (userInput.equals("")) {
                        // do nothing
                    }
                    else if (userInput.length() < 8) {
                        core.setDisplayErr("Invalid input");
                        isErr = true;
                    }
                    else if (userInput.substring(0,8).equals("SWITCHDR")) {
                        switch (userInput) {
                            case "SWITCHDR": {
                                extended.switchUnitsMode();
                                break;
                            }
                            case "SWITCHDR DEGREES": {
                                extended.switchUnitsMode("degrees");
                                break;
                            }
                            case "SWITCHDR RADIANS": {
                                extended.switchUnitsMode("radians");
                                break;
                            }
                            default: {
                                core.setDisplayErr("Invalid input");
                                isErr = true;
                                break;
                            }
                        }
                        if (!isErr)
                            core.setDisplay("Trig mode: " + extended.getCurTrigUnitsName());
                    }
                    else if (userInput.substring(0,10).equals("SWITCHDISP")) {
                        switch (userInput) {
                            case "SWITCHDISP": {
                                extended.switchDisplayMode();
                                break;
                            }
                            case "SWITCHDISP BIN": {
                                extended.switchDisplayMode("binary");
                                break;
                            }
                            case "SWITCHDISP OCT": {
                                extended.switchDisplayMode("octal");
                                break;
                            }
                            case "SWITCHDISP DEC": {
                                extended.switchDisplayMode("decimal");
                                break;
                            }
                            case "SWITCHDISP HEX": {
                                extended.switchDisplayMode("hexadecimal");
                                break;
                            }
                            default: {
                                core.setDisplayErr("Invalid input");
                                isErr = true;
                                break;
                            }
                        }
                        if (!isErr)
                            core.setDisplay("Display mode: " + extended.getCurDisplayModeName());
                    }
                    else {
                        core.setDisplayErr("Invalid input");
                        isErr = true;
                    }
                }
            }
            println(core.getDisplay());
            getUserInput();
        }
    }

    private void getUserInput(){
        userInput = getStringInput("");
        userInput = userInput.trim();
        userInput = userInput.toUpperCase();
    }

    private void doTwoSideOp(String userInput)
    {
        int length = core.getDisplay().length();
        String operator = core.getDisplay().substring(length-1);

        switch (operator) {
            case "+":{
                core.setCurNum(core.add(core.getCurNum(),Double.parseDouble(userInput))); break;
            }
            case "-":{
                core.setCurNum(core.subtract(core.getCurNum(),Double.parseDouble(userInput))); break;
            }
            case "*":{
                core.setCurNum(core.multiply(core.getCurNum(),Double.parseDouble(userInput))); break;
            }
            case "/":{
                core.setCurNum(core.divide(core.getCurNum(),Double.parseDouble(userInput))); break;
            }
            default: {
                core.setDisplayErr("Invalid input");
                break;
            }
        }
        if (Double.isNaN(core.getCurNum())) {
            core.setDisplayErr("Division by zero");
            isErr = true;
        }
        else
            core.setDisplay(extended.convertOutput(core.getCurNum()));
}
    private void doOneSideOp(String operator)
    {
        switch (operator) {
            case "SIN": {
                core.setCurNum(extended.sine(core.getCurNum())); break;
            }
            case "COS": {
                core.setCurNum(extended.cosine(core.getCurNum())); break;
            }
            case "TAN": {
                core.setCurNum(extended.tangent(core.getCurNum())); break;
            }
            case "ASIN": {
                core.setCurNum(extended.invSine(core.getCurNum())); break;
            }
            case "ACOS": {
                core.setCurNum(extended.invCosine(core.getCurNum())); break;
            }
            case "ATAN": {
                core.setCurNum(extended.invTan(core.getCurNum())); break;
            }
            case "LOG": {
                core.setCurNum(extended.log(core.getCurNum())); break;
            }
            case "LN": {
                core.setCurNum(extended.ln(core.getCurNum())); break;
            }
            case "E^X": {
                core.setCurNum(extended.invLn(core.getCurNum())); break;
            }
            case "10^X": {
                core.setCurNum(extended.invLog(core.getCurNum())); break;
            }
            case "!": {
                core.setCurNum(extended.factorial(core.getCurNum()));break;
            }
            case "C": {
                core.clear();
            }
            case "SQ": {
                core.setCurNum(core.square(core.getCurNum())); break;
            }
            case "SQRT": {
                core.setCurNum(core.squareRoot(core.getCurNum())); break;
            }
            case "INV": {
                core.setCurNum(core.inverse(core.getCurNum())); break;
            }
            case "SIGN": {
                core.setCurNum(core.invertSign(core.getCurNum()));break;
            }
            default:{
                core.setDisplayErr("Invalid input");
                isErr = true;
                break;
            }
        }
        if (Double.isNaN(core.getCurNum()))
        {
            core.setDisplayErr("Division by zero");
            isErr = true;
        }
        else
            core.setDisplay(extended.convertOutput(core.getCurNum()));
    }

    private void doCommand(String command)
    {
        switch (command)
        {
            case "C":{
                core.clear();   break;
            }
            case "M+":{
                extended.memPlus(core.getCurNum()); break;
            }
            case "MC":{
                extended.memClear();    break;
            }
            case "MRC":{
                core.setCurNum(extended.memRecal());
                core.setDisplay(extended.convertOutput(core.getCurNum()));
                break;
            }
            default: {
                core.setDisplay("Invalid input");
                isErr = true;
            }
        }
    }

    public static Integer validOperator (String inputTest) {

        for (String operator : oneSidedOp) {
            if (inputTest.equals(operator)) {
                return 1;
            }
        }
        for (String operator : twoSidedOp) {
            if (inputTest.equals(operator)) {
                return 2;
            }
        }
        for (String operator : command) {
            if (inputTest.equals(operator)) {
                return 3;
            }
        }
        return 0;
    }

    private static boolean isNumeric(String str){
            try {
                Double.parseDouble(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }


}
