package mattern.william;

/**
 * Created by williammattern on 1/13/17.
 */
public class CalculatorProject {
    static boolean exitConditionMet = false;

    public static void main(String[] args) {
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        calculatorEngine.startEngine();
        while (!exitConditionMet) {
            calculatorEngine.runEngine();
        }
    }
}
