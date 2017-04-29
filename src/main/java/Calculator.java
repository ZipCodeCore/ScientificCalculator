/**
 * Created by danzygmund-felt on 4/28/17.
 */
public class Calculator {

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if(y == 0) {
            return Double.NaN;
        }

        return x / y;
    }

}
