package mozeik.gerrod;

/**
 * Created by gerrodmozeik on 1/13/17.
 */
public class CalculatorEngine {

    Double currentValue;

    public void startEngine() {
        Display display = new Display();
        currentValue = display.getCurrentValue();
        System.out.println("Display: " + currentValue);
    }

}
