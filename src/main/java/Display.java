import java.util.Scanner;

/**
 * Created by cameronsima on 4/29/17.
 */
public class Display {
    private String currentValue;
    private String currentOperator;


    public Display() {
        currentValue = "0";
    }



    public String getCurrentValue() {
        return currentValue;
    }

    public void clear() {
        currentValue = "0";

    }

    public void setCurrentValue(String value) {
    if (validateDouble(value)) {
        currentValue = value;
    } else {
        sendErr();
    }


    }

    public void setCurrentOperator(String operator) {
        currentOperator = operator;
    }

    public String getCurrentOperator() {
        return currentOperator;
    }

    private boolean validateDouble(String input) {
        try {
           Double.parseDouble(input);
        } catch (Exception err) {
            return false;
        }
        return true;
    }

    private void sendErr() {
        setCurrentValue("Err");
    }

}
