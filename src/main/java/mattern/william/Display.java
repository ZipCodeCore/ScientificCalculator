package mattern.william;

import java.util.Scanner;

/**
 * Created by williammattern on 1/13/17.
 */
public class Display {
    Double currentValue;
    char operatorCode;
    Scanner scanner = new Scanner(System.in);

    public Display(){
        this.clearDisplay();
    }

    public void clearDisplay(){
        System.out.println("0");
    }

    public Double getCurrentValue() {
        currentValue = scanner.nextDouble();
        return currentValue;
    }

    public char getOperatorCode(){
        operatorCode = scanner.next().charAt(0);
        return operatorCode;
    }

    public void showOutputValue(Double outputValue){
        System.out.println(outputValue);
    }

    public void sendErrorMessage(){
        System.out.println("ERR");
    }


}
