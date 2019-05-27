package com.zipcodewilmington.scientificcalculator;

public class Calculator extends Console {
    static String[] oneSidedOp = {"SIN","COS","TAN","ASIN","ACOS","ATAN","LOG","LN","E^X","10^X","!",
            "SQ","SQRT","INV","INVSIGN"};
    static String[] twoSidedOp = {"+","-","*","/","^"};
    static String[] command = {"C","SWITCHDR","SWITCHDISP","M+","MC","MRC"};

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

        while (!userInput.equals("Q"));
        {
            println(core.getDisplay());
            if(!isErr) {
                if(userInput.equals("C")) {
                    core.clear();
                    isErr = false;
                }
            }
            else
            {
                if(isWaitingForNumInput)
                {
                    if(isNumeric(userInput)){

                    }
                    // if input is number
                    // check the last char in display to determine op
                    // do op with input
                    // set isWaitingForNumInput to false
                    // if input is not number, print err: invalid input
                }
                else {
                    if(isNumeric(userInput)){
                        core.setCurNum(Double.parseDouble(userInput));
                        core.setDisplay(userInput);
                    }
                    else if (validOperator(userInput)==1)
                    {


                    }
                    else if (validOperator(userInput)==2)
                    {
                        isWaitingForNumInput = true;
                        core.addToDisplay(userInput);
                    }
                    else if (userInput.equals(""))
                    {

                    }
                    else if (userInput.substring(0,5).equals("SWITCH"))
                    {
                        switch (userInput)
                        {
                            case "SWITCHDR": {
                                extended.switchUnitsMode(); break;
                            }
                            case "SWITCHDR DEGREES": {
                                extended.switchUnitsMode("degrees"); break;
                            }
                            case "SWITCHDR RADIANS": {
                                extended.switchUnitsMode("radians"); break;
                            }
                            case "SWITCHDISP": {
                                extended.switchDisplayMode(); break;
                            }
                            case "SWITCHDISP BIN": {
                                extended.switchDisplayMode("binary"); break;
                            }
                            case "SWITCHDISP OCT": {
                                extended.switchDisplayMode("octal"); break;
                            }
                            case "SWITCHDISP DEC": {
                                extended.switchDisplayMode("decimal"); break;
                            }
                            case "SWITCHDISP HEX": {
                                extended.switchDisplayMode("hexadecimal"); break;
                            }
                            default: {
                                core.setDisplayErr("Invalid input"); break;
                            }
                        }
                    }
                    else{
                        core.setDisplayErr("Invalid input");
                    }
                    // if input is num, set curr num and set display
                    // if input is single op, do op on curNum
                    // if input is two side op, set isWaitingForNumInput to true, and add op to display
                    // if clear, clear
                    // if switch mode, switch mode
                    // if "", do nothing
                    // else input is invalid, print err: invalid input
                }
            }
            getUserInput();

        }

    }

    private void getUserInput(){
        userInput = getStringInput("");
        userInput = userInput.trim();
        userInput = userInput.toUpperCase();
    }

    private void doOneSideOp(String operator)
    {
        switch (operator) {
/*            case "M+": {
                extended.memPlus(core.getCurNum()); break;
            }
            case "MC": {
                extended.memClear(); break;
            }
            case "MRC": {
                core.setDisplay(Double.toString(extended.memRecal()));
                core.setCurNum(extended.memRecal());
                break;
            }*/
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
                break;
            }
        }
        core.setDisplay(Double.toString(core.getCurNum()));
    }
/*
        else if (validOperator(userInput)==1)
        {

        }
        else if (validOperator(userInput)==2)
        {

        }
        else if (validOperator(userInput)==3)
        {
        }
    }
        else if (userInput.equals(""))
        {}
        else
            core.setDisplay("Err: invalid input");
*/


        // if user entered a number
        //  call core.changeDisplay();
        // else if user entered a operator / command (Example: sine)
        //  call core.changeDisplay(Extended.sine(core.getDisplay()));
        // else if user entered a double-side operator (Example: addition)
        //  isWaitingForNumInput = true;
        // else if user entered switch mode command
        // {
        //      if user entered mode option
        //          Extended.switchMode(userInput);
        //      else
        //          Extended.switchMOdeRotate();
        // }
        // else if user entered emptyString
        //      do nothing;
        // else
        //      print invalid command error
        //


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
