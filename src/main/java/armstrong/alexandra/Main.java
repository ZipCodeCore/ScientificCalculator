package armstrong.alexandra;

import static armstrong.alexandra.InputHelper.blankScanner;
import static armstrong.alexandra.DisplayMode.*;
import static armstrong.alexandra.Notation.*;
import static armstrong.alexandra.TrigUnit.*;
/**
 * Created by alexandraarmstrong on 1/14/17.
 */
public class Main {
    static CalculatorController calcCont;
    static boolean off = false;
    public static void main(String[] args){
        PrintPackage.mockDisplay(0);
        while(!off){
            pickAConstructor();
            PrintPackage.mockDisplay(calcCont.calc.getDisplay());
        }
    }

    public static Object[] inputParse(){
        Object[] input = {blankScanner(), blankScanner(), blankScanner()};
        return input;
    }

    public static void pickAConstructor(){
        Object[] input = inputParse();
        if (input[0].getClass() == Double.class){
            if (input[1].getClass() == Character.class){
                if (input[2].getClass() == Double.class){
                    calcCont = new CalculatorController((Double)input[0], (Character)input[1], (Double)input[2]);
                } else {
                    calcCont = new CalculatorController((Double)input[0], (Character)input[1]);
                }
            }
        } else if (input[0].getClass() == TrigUnit.class){
            calcCont = new CalculatorController((TrigUnit)input[0]);
        } else if (input[0].getClass() == Notation.class){
            calcCont = new CalculatorController((Notation)input[0]);
        } else if (input[0].getClass() == DisplayMode.class){
            calcCont = new CalculatorController((DisplayMode)input[0]);
        } else if (input[0].getClass() == Character.class){
            if (input[1].getClass() == Double.class){
                calcCont = new CalculatorController((Character)input[0], (Double)input[1]);
            } else {
                calcCont = new CalculatorController((Character)input[0]);
            }

        } else {
            off = true;
        }
    }
}
