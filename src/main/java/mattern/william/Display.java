package mattern.william;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by williammattern on 1/13/17.
 */
public class Display {
    Scanner scanner = new Scanner(System.in);

    public void clearDisplay() throws IOException {
        CalculatorEngine.initialValue = 0;
        System.out.println(CalculatorEngine.initialValue);
        Runtime.getRuntime().exec("clear");
    }

    public void getInitialValue(){
        System.out.println("give me a number");
        CalculatorEngine.initialValue = scanner.nextDouble();
    }

    public void getCurrentValue() {
        System.out.println("give me another number");
        CalculatorEngine.currentValue = scanner.nextDouble();
    }

    public void getOperatorCode(){
        System.out.println("Give me an operation - add - mulitply - subtract - divide  - exit");
        CalculatorEngine.operatorCode = scanner.next();
    }

    public void showOutputValue(Double outputValue){
        System.out.println(outputValue);
    }

    public void sendErrorMessage(){
        System.out.println("ERR");
    }


}
