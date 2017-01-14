package mattern.william;

/**
 * Created by williammattern on 1/13/17.
 */
public class CalculatorEngine {
    Double currentValue;


    public void StartEngine(){
        Display display = new Display();
        currentValue = display.getCurrentValue();
        System.out.println("Display: " + currentValue);
        currentValue = display.getCurrentValue();
        System.out.println("Display: " + currentValue);

    }

}
