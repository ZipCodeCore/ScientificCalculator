/**
 * Created by andrewwong on 4/30/17.
 */
public class TrigMath {

    public static CalculationResult calculateSin(double angle) {
        boolean error = false;
        double resultValue = Math.sin(angle);
        return new CalculationResult(error, resultValue);
    }

    public static CalculationResult calculateCos(double angle) {
        boolean error = false;
        double resultValue = Math.cos(angle);
        return new CalculationResult(error, resultValue);
    }

    public static CalculationResult calculateTan(double angle) {
        boolean error = false;
        double resultValue = Math.tan(angle);
        return new CalculationResult(error, resultValue);
    }

    public static CalculationResult calculateInvSin(double angle) {
        boolean error = false;
        double resultValue = Math.pow(Math.sin(angle), -1);
        return new CalculationResult(error, resultValue);
    }

    public static CalculationResult calculateInvCos(double angle) {
        boolean error = false;
        double resultValue = Math.pow(Math.cos(angle), -1);
        return new CalculationResult(error, resultValue);
    }

    public static CalculationResult calculateInvTan(double angle) {
        boolean error = false;
        double resultValue = Math.pow(Math.tan(angle), -1);
        return new CalculationResult(error, resultValue);
    }
}
