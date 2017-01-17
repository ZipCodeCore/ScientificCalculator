package armstrong.alexandra;

import static armstrong.alexandra.InputHelper.*;
import static armstrong.alexandra.PrintPackage.*;
import static armstrong.alexandra.DisplayMode.*;
import static armstrong.alexandra.Notation.*;
import static armstrong.alexandra.TrigUnit.*;
/**
 * Created by alexandraarmstrong on 1/14/17.
 */
public class Main {
    public static void main(String[] args) {
        CalculatorController calcCont = new CalculatorController();
        boolean off = false;
        mockDisplay(0);
        boolean moodChange = false;
        boolean changeDisplay;

        do{
            println("Would you like to change the displayed number: true or false?");
                changeDisplay = booleanScanner();
                if(changeDisplay){
                    print("Set your display: ");
                    calcCont.calc.setDisplay(doubleScanner());
                }

            print("What operation would you like to do?: ");
                calcCont.setOperator(charScanner());

            if (calcCont.getOperator() == '+'
                    || calcCont.getOperator() == '-'
                    || calcCont.getOperator() == '*'
                    || calcCont.getOperator() == '/'
                    || calcCont.getOperator() == '^') {
                print("Type a second number");
                calcCont.setOperand(doubleScanner());

            }
                calcCont.operatorSwitch();

            println(calcCont.calc.getDisplay());
            mockDisplay(calcCont.calc.getDisplay());

            print("Do you want to change the mode: true or false?");
            moodChange = booleanScanner();
            if (moodChange) {
                modeDisplay();
                println("What mode would you like to use?");
            }
            println("Do you want to turn the calculator off: true or false?");
            off = booleanScanner();
        }while(!off);



        /*//calcCont = new CalculatorController(1d, '*', 3d);
        //PrintPackage.println(calcCont.calc.getDisplay());
        while(!off){
            pickAConstructor();
            System.out.println("Hi");
            PrintPackage.mockDisplay(calcCont.calc.getDisplay());
        }*/
    }

    /*public static Object[] inputParse(){
        Object[] input = {blankScanner(), blankScanner(), blankScanner()};
        for (int i = 0; i < input.length; i++){
            System.out.println(input[i]);
        }
        return null;
    }

    /*public static void pickAConstructor(){
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
    }*/
}
