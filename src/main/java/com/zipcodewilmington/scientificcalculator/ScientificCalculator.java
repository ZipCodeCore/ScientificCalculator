package com.zipcodewilmington.scientificcalculator;

import javax.xml.transform.Result;
import java.sql.ResultSet;


public class ScientificCalculator extends Calculator {

    private Double saved;
    private Boolean resultInRadians;
    private String sciState;

    public Double getSaved() {
        return saved;
    }

    public void setSaved(Double saved) {
        this.saved = saved;
    }

    public Boolean getResultInRadians() {
        return resultInRadians;
    }

    public void setResultInRadians(Boolean resultInRadians) {
        this.resultInRadians = resultInRadians;
    }

    public String getSciState() {
        return sciState;
    }

    public void setSciState(String sciState) {
        this.sciState = sciState;
    }

    public ScientificCalculator() {
        resultInRadians = true;
        saved = 0.0;
        sciState = null;
    }

    public void parse(String[] input) {
        Double x = 0.0;
        if (input.length == 2) {
            x = Double.valueOf(input[0]);

        } else if (input.length == 1) {
            x = super.getCurrentNumber();
        } else {
            super.parse(input);
        }
        // String operator = input[input.length-1];

        runOperator(x, input);
    }

    public void runOperator(Double x, String[] input) {
        String operator = input[input.length - 1];
        switch (operator) {
            case "sin":
                sine(x);
                break;
            case "cos":
                cosine(x);
                break;
            case "tan":
                tangent(x);
                break;
            case "asin":
                arcSine(x);
                break;
            case "acos":
                arcCos(x);
                break;
            case "atan":
                arcTan(x);
                break;
            case "log":
                log(x);
                break;
            case "invlog":
                invLog(x);
                break;
            case "ln":
                ln(x);
                break;
            case "factorial":
                factorial(x);
                break;
            case "M+":
                memSet(x);
                break;
            case "MC":
                memReset();
                break;
            case "MRC":
                memSetDisplay();
                break;
            case "base":
                super.setCurrentNumber(x);
                switchDisplayMode();
                break;
            case "trig":
                switchUnitsMode();
                break;
            default:
                super.parse(input);
        }
        if (!operator.equals("base")) {
            setSciState(String.valueOf(super.getCurrentNumber()));
        }

    }

    public void memSet(Double x) {
        setSaved(x);
    }
    public void memReset() {
        setSaved(0.0);
    }
    public void memSetDisplay() {
        Double x = getSaved();
        super.setCurrentNumber(x);
    }

    public void switchDisplayMode() {
        String[] displayModes = {"h", "o", "b", "d"};
        for (String mode : displayModes) {
            switchDisplayMode(mode);
            System.out.println(getSciState());
        }
        setSciState(String.valueOf(super.getCurrentNumber()));
    }

    public void switchDisplayMode(String displayMode) {
        Double x = super.getCurrentNumber();
        switch (displayMode) {
            case "b":
                setSciState("binary: " + Long.toBinaryString(Double.doubleToRawLongBits(x)));
                break;
            case "o":
                setSciState("octal: " + Long.toOctalString(Double.doubleToRawLongBits(x)));
                break;
            case "h":
                setSciState("hexadecimal: " + Long.toHexString(Double.doubleToRawLongBits(x)));
                break;
            case "d":
                setSciState("decimal: " + x);
                break;
            default:
                setSciState("That is not a valid display mode!");
                break;
        }

    }


//    public void Double roundDecTen (Double num) {
//        Double result = Double.parseDouble(String.format("%.6f %n", num));
//        return result;
//    }


  public void switchUnitsMode() {
        Double x = super.getCurrentNumber();
       if (resultInRadians) {
           setResultInRadians(false);
           super.setCurrentNumber(Math.toDegrees(x));
       } else {
           setResultInRadians(true);
           super.setCurrentNumber(Math.toRadians(x));
       }
  }

  public void switchUnitsMode(boolean resultInRadians) {
        switchUnitsMode();
  }


    public void sine(Double x) {
        if (resultInRadians) {
            super.setCurrentNumber(Math.sin(x));
        }

        super.setCurrentNumber(Math.toDegrees(Math.sin(x)));
    }

    public void cosine(Double x) {
        if (resultInRadians) {
            super.setCurrentNumber(Math.cos(x));
        }

        super.setCurrentNumber(Math.toDegrees(Math.cos(x)));
    }

    public void tangent(Double x) {
        if (resultInRadians) {
            super.setCurrentNumber(Math.tan(x));
        }

        super.setCurrentNumber(Math.toDegrees(Math.tan(x)));
    }

    public void arcSine(Double x) {
        if (resultInRadians) {
            super.setCurrentNumber(Math.asin(x));
        }
        super.setCurrentNumber(Math.toDegrees(Math.asin(x)));
        //need err handling for nums < -1 or > 1
    }

    public void arcCos(Double x) {
        if (resultInRadians) {
            super.setCurrentNumber(Math.acos(x));
        }
        super.setCurrentNumber(Math.toDegrees(Math.acos(x)));
        //need err handling for nums < -1 or > 1
    }

    public void arcTan(Double x) {
        if (resultInRadians) {
            super.setCurrentNumber(Math.atan(x));
        }
        super.setCurrentNumber(Math.toDegrees(Math.atan(x)));
        //need err handling for nums < -1 or > 1
    }


    public void log(Double x) {
        super.setCurrentNumber(Math.log10(x));
    }

    public void invLog(Double x) {

        super.setCurrentNumber(Math.pow(10, x));
    }

    public void ln(Double x) {

        super.setCurrentNumber(Math.log(x));
    }

    public void invLn(Double x) {

        super.setCurrentNumber(Math.exp(x));
    }

    public void factorial(Double x) {

        Double holder = 1.0;
        for (int i = 2; i <= x; i++) {
            holder *= i;
        }
        Double result = (holder);
        super.setCurrentNumber(result);
    }


}

