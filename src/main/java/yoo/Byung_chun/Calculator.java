package yoo.Byung_chun;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Calculator
{
    public static void main( String[] args ) {

        InputController control = new InputController();
        control.turnOn();

        CalcMachine calcMachine = new CalcMachine ();
        boolean isInputCorrect = false;
        while (!isInputCorrect) {
            control.enterInput();
            try {
                if (control.getOpCode() < 6) {
                    calcMachine.calculateTwoNum(control.getInNum1(), control.getInNum2(), control.getOpCode());
                } else {
                    calcMachine.calculateOneNum(control.getInNum1(), control.getOpCode());
                }
                isInputCorrect = true;
            } catch (Exception e) {
                System.out.println("Check your math again");
            }
        }

        Display display = new Display();
        display.showResult(calcMachine.getResult());



    }
}
