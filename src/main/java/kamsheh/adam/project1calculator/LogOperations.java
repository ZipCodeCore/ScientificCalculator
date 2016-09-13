package kamsheh.adam.project1calculator;

/**
 * Created by adam on 9/12/16.
 */
public class LogOperations {
    public static double log(double state) {
        return Math.log10(state);
    }

    public static double inverseLog(double state) {
        return Math.pow(10, state);
    }

    public static double naturalLog(double state) {
        return Math.log(state);
    }

    public static double inverseNaturalLog(double state) {
        return Math.exp(state);
    }
}
