package Calculator;

import static Calculator.Storage.*;

/**
 * Created by randallcrame on 1/13/17.
 */

public class Input {

    public Input(){}

    static public double getLeftValue() {
        return  storeFirstInput;
    }

    static public double getRightValue(){
        return storeSecondInput;
    }

    static public double getSingleMemory() {
        return singleMemory;
    }

    static public EngineCommands getCommand() {
        return storeEngineCommand;
    }

    static public double getNumeralCommand() {
        return storeNumeralCommand;
    }

    static public void setLeftValue(double input) {
        storeFirstInput = input;
    }

    static public void setRightValue(double input) {
        storeSecondInput = input;
    }

    static public void setCommand(EngineCommands input) {
        storeEngineCommand = input;
    }

    static public void setNumeralCommand(double input) {
        storeNumeralCommand = input;
    }

    static public void setSingleMemory (double input) {
        singleMemory = input;
    }

    static public void resetAllValues() {
        setLeftValue(0.0);
        setRightValue(0.0);
        setCommand(EngineCommands.CLEAR);
    }
    static public void setResults(double results) {
        setSingleMemory(results);
        setNumeralCommand(results);
        setLeftValue(results);
    }
}
