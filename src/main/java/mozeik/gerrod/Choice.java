package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/14/17.
 */
public class Choice {

    static public void pickChoice(String Choice) {
        switch(Choice) {
            case "add":
                CalculatorBasicFunctions.calculateAddition(CalculatorEngine.initialValue, CalculatorEngine.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
                break;
        }
    }

}
