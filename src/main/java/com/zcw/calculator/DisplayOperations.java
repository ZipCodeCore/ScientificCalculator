package com.zcw.calculator;

public class DisplayOperations {
    String[] modes = {"binary","hexa","octa"};
    int modeindex = 0;
    public String switchDisplayMode(double result) {
        String mode = null;
        if(modeindex == modes.length - 1){
            modeindex = 0;
            mode = modes[0];
        } else {
            modeindex++;
            mode = modes[modeindex];
        }
        return switchDisplayMode(mode, result);
    }
    public String switchDisplayMode(String mode, double operand) {

        if (operand != (long)operand) {
            return "ERR";
        }

        String result = Long.toString((long)operand);
        for (int i=0; i<modes.length; i++) {
            if (mode.equals(modes[i])) {
                modeindex = i;
            }
        }
        switch (modeindex) {
            case 0:
                result = Long.toBinaryString((long)operand);
                break;
            case 1:
                result = Long.toHexString((long)operand);
                break;
            case 2:
                result = Long.toOctalString((long)operand);
                break;
        }
        return result;
    }
}
