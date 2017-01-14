package Calculator;


import java.util.Scanner;

/**
 * Created by randallcrame on 1/13/17.
 */
public class Input {

    public Input(){}

    static public double getLeftValue() {
        return Storage.storeFirstInput;
    }

    static public double getRightValue(){
        return Storage.storeSecondInput;
    }

    static public double getSingleMemory() {
        return Storage.singleMemory;
    }

    static public void setLeftValue(double firstInput) {
        Storage.storeFirstInput = firstInput;
    }

    static public void setRightValue(double secondInput) {
        Storage.storeSecondInput = secondInput;
    }

    static public void setResults(double results) {
        Storage.singleMemory = results;
        Storage.storeFirstInput = results;
    }
}
