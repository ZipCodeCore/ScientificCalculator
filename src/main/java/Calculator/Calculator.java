package Calculator;

import java.util.Scanner;

/**
 * Created by randallcrame on 1/13/17.
 */

public class Calculator {

    static public void runCalculator() {
        do{
            Display.getDefaultState();
            Command.firstValueInquiry();
            Display.getNumeralBorderDisplay();
            do {
                Command.commandInquiry();
                Command.secondValueInquiry();
                CalculatorEngine.executeEquations();
                Display.getStoredMemoryDisplay();
            } while (Input.getCommand()!= EngineCommands.CLEAR);
        } while (Input.getCommand()!= EngineCommands.EXIT);
    }
    public static void main(String[] args){
        Calculator.runCalculator();
    }
}

