package mattern.william;

/**
 * Created by williammattern on 1/14/17.
 */
public class Choice {
    static public void pickChoice(String choice) {
        switch (choice){
            case "add":
                CalculatorBasicFunctions.calculateAddition(CalculatorEngine.initialValue, CalculatorEngine.currentValue);
                Display.displayAfterCalculating();
                Display.getCurrentValue();
        }
    }
}
