package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/14/17.
 */
public class Controller {

    private CalculatorModel calculatorModel;
    private Display displayModel;
    private UserInterface userInterface;

    public void runCalculator(){

        //Clear the display
        displayModel.clearDisplay();

        //Get user input
        userInterface.getInputValue();

        //Update the display
        displayModel.setCurrentDisplayValue();

        //Get operand

        //Do operation (Model)

        //Update display
    }


}

