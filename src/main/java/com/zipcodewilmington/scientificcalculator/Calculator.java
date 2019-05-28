package com.zipcodewilmington.scientificcalculator;

public class Calculator extends Console {
    static String[] oneSidedOp = {"SIN","COS","TAN","ASIN","ACOS","ATAN","LOG","LN","E^X","10^X","!",
            "SQ","SQRT","INV","INVSIGN"};
    static String[] twoSidedOp = {"+","-","*","/","^","FIBTO"};
    static String[] command = {"ZCW","?","C","M+","MC","MRC"};

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
                    core.setDisplay(extended.convertOutput(core.getCurNum()));
                    isErr = false;
                }
            }
            else {
                if(isWaitingForNumInput) {
                    if(isNumeric(userInput)) {
                        doTwoSideOp(userInput);
                    }
                    else if (userInput.equals("C")){
                        core.clear();
                        core.setDisplay(extended.convertOutput(core.getCurNum()));
                    }
                    else if (userInput.equals("MRC")) {
                        doTwoSideOp(Double.toString(extended.memRecal()));
                    }
                    else {
                        core.setDisplayErr("Syntax Error");
                        isErr = true;
                    }
                    isWaitingForNumInput = false;
                }
                else {
                    if(isNumeric(userInput)) {
                        core.setCurNum(Double.parseDouble(userInput));
                        setConvertibleToDisplay();
                    }
                    else if (validOperator(userInput)==1)
                        doOneSideOp(userInput);
                    else if (validOperator(userInput)==2) {
                        isWaitingForNumInput = true;
                        if (isConvertible(core.getCurNum()))    //!!! should remove?//
                            core.setDisplay(extended.convertOutput((core.getCurNum()))+userInput);
                        else {
                            core.setDisplayErr("Cannot convert to "+extended.getCurDisplayModeName()
                                    + ", changing back to decimal mode");
                            isErr = true;
                            extended.switchDisplayMode("decimal");
                        }
                    }
                    else if (validOperator(userInput)==3)
                        doCommand(userInput);
                    else if (userInput.equals("")) {
                        setConvertibleToDisplay();
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
                        if (!isErr){
                            if (isConvertible(core.getCurNum()))
                            core.setDisplay("Trig mode: " + extended.getCurTrigUnitsName() + "\n"
                                    + extended.convertOutput(core.getCurNum()));
                            else{
                                core.setDisplayErr("Cannot convert to "+extended.getCurDisplayModeName()
                                        + ", changing back to decimal mode");
                                isErr = true;
                                extended.switchDisplayMode("decimal");
                            }
                        }
                    }
                    else if (userInput.length() < 10) {
                        core.setDisplayErr("Invalid input");
                        isErr = true;
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

                        if (!isErr) {
                            if (isConvertible(core.getCurNum())) {
                                core.setDisplay("Display mode: " + extended.getCurDisplayModeName() + "\n"
                                + extended.convertOutput(core.getCurNum()));
                            }
                            else {
                                core.setDisplayErr("Cannot convert to "+extended.getCurDisplayModeName()
                                        + ", changing back to decimal mode");
                                isErr = true;
                                extended.switchDisplayMode("decimal");
                            }
                        }
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
        boolean isFib = false;

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
            case "O":{
                if(isConvertible(core.getCurNum())) {
                    core.setDisplay(extended.fib(core.getCurNum(), Double.parseDouble(userInput)) +
                            "\n" + extended.convertOutput(core.getCurNum()));
                }
                else {
                    core.setDisplayErr("Cannot convert to "+extended.getCurDisplayModeName()+ ", changing back to decimal mode");
                    isErr = true;
                    extended.switchDisplayMode("decimal");
                }
                isFib = true;
                break;
            }
            default: {
                core.setDisplayErr("Invalid operator");
                break;
            }
        }
        if (Double.isNaN(core.getCurNum())) {
            core.setDisplayErr("Division by zero");
            isErr = true;
        }
        else
            if(!isFib)
                setConvertibleToDisplay();
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
           setConvertibleToDisplay();
    }

    private void doCommand(String command)
    {
        switch (command)
        {
            case "ZCW":{
                core.showMePuppy();
                break;
            }
            case "?":{
                core.availableOptions();
                break;
            }
            case "C":{
                core.clear();
                core.setDisplay(extended.convertOutput(core.getCurNum()));
                break;
            }
            case "M+":{
                extended.memPlus(core.getCurNum()); break;
            }
            case "MC":{
                extended.memClear();    break;
            }
            case "MRC":{
                core.setCurNum(extended.memRecal());
                setConvertibleToDisplay();
                break;
            }
            default: {
                core.setDisplay("Invalid input");
                isErr = true;
            }
        }
    }

    private static Integer validOperator (String inputTest) {

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

    private boolean isConvertible(double valToConvert)
    {
        if (extended.convertOutput(valToConvert).equals("NaN"))
            return false;
        else
            return true;
    }

    private void setConvertibleToDisplay() {
        if (isConvertible(core.getCurNum()))
            core.setDisplay(extended.convertOutput(core.getCurNum()));
        else{
            core.setDisplayErr("Cannot convert to "+extended.getCurDisplayModeName()+ ", changing back to decimal mode");
            isErr = true;
            extended.switchDisplayMode("decimal");
        }
    }

    private static boolean isNumeric(String str){
            try {
                Double.parseDouble(str);
                return true;
            }
            catch (NumberFormatException e) {
                return false;
            }
        }


}
