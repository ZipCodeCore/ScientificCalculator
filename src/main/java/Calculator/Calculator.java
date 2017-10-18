package Calculator;

import java.util.Scanner;

/**
 * Created by randallcrame on 1/13/17.
 */

public class Calculator {

    static public void runCalculator() {

              Display.getDefaultState();
              Command.firstValueInquiry();

           do {
              Display.getNumeralBorderDisplay();
              Command.commandInquiry();

              Display.getNumeralBorderDisplay();
              Command.secondValueInquiry();

              CalculatorEngine.executeEquations();
              Display.getStoredMemoryDisplay();
          }while ((EngineCommands.EXIT != Storage.storeEngineCommand));

    }
    public static void main(String[] args){
        Calculator.runCalculator();
    }
}

