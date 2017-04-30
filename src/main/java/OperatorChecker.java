/**
 * Created by danzygmund-felt on 4/30/17.
 */
public class OperatorChecker {
    public static final String[] binaryOperations =
            {"+", "-", "*", "/", "^"};
    public static final String[] unaryOperations =
            {"sq", "sqrt", "inv", "opp",
                    "sin", "cos", "tan", "asin", "acos", "atan",
                    "log10", "tenPower", "log", "ePower", "factorial"};

    public boolean isUnaryOperation(String input) {
        for(String s : unaryOperations) {
            if(input.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public boolean isBinaryOperation(String input) {
        for(String s : binaryOperations) {
            if(input.equals(s)) {
                return true;
            }
        }
        return false;
    }
}
