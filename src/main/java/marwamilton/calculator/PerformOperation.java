package marwamilton.calculator;

/**
 * Created by mkulima on 1/14/17.
 */
public class PerformOperation {
    double num1;
    double num2;
    String desiredOperation;

    public PerformOperation(String num1, String num2, String desiredOperation){
        this.num1 = Double.parseDouble(num1);
        this.num2 = Double.parseDouble(num2);
        this.desiredOperation = desiredOperation;
    }


}
