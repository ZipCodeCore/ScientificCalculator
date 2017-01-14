package mattern.william;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by williammattern on 1/13/17.
 */
public class Display {
    static Scanner scanner = new Scanner(System.in);

    public void clearDisplay(){
        getInitialValue();
    }

    static public void getInitialValue(){
        System.out.println("give me a number");
        CalculatorEngine.initialValue = scanner.nextDouble();
        getOperatorCode();
        getCurrentValue();
    }

    static public void getCurrentValue() {
        System.out.println("give me another number");
        CalculatorEngine.currentValue = scanner.nextDouble();
        Choice.pickChoice(CalculatorEngine.operatorCode);
    }

    static public void getOperatorCode(){
        System.out.println("Give me an operation - add - mulitply - subtract - divide  - clear");
        CalculatorEngine.operatorCode = scanner.next();
        if (CalculatorEngine.operatorCode.equals("clear")){
            getInitialValue();
        }
    }

    static public void showOutputValue(Double outputValue){
        System.out.println(outputValue);
    }

    static public void displayAfterCalculating(){
        CalculatorEngine.initialValue = CalculatorEngine.calculatedValue;
        System.out.println(CalculatorEngine.calculatedValue);
        System.out.println("Give me an operation - add - mulitply - subtract - divide  - clear");
        CalculatorEngine.operatorCode = scanner.next();
        if (CalculatorEngine.operatorCode.equals("clear")){
            getInitialValue();
        }
    }

    public void sendErrorMessage(){
        System.out.println("ERR");
    }


}
