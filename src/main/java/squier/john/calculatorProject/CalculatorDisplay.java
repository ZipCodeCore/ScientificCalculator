package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorDisplay {


    public void displayCurrentState(double currentValue) {
        System.out.printf("CURRENT VALUE: %f\n");
    }

    public void displayAvailableOperations(String availableOperations) {
        System.out.println(availableOperations);
    }
}
