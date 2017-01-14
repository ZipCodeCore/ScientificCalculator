package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class CalculatorProject {
    static boolean exitConditionMet = false;

    public static void main(String[] ars) {
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        calculatorEngine.startEngine();
        calculatorEngine.runEngine();
    }
}
