package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/14/17.
 */
public class Controller {

    private CalculatorModel calculatorModel;
    private Display displayModel;
    private UserInterface userInterface;
    private String operand;
    private Double inputValue;

    public void runCalculator(){

        //Clear the display
        displayModel.clearDisplay();

        //Get first user input value
        inputValue = userInterface.captureUserInputValue(userInterface.setUserInputValue());

        //Update the display
        displayModel.setCurrentDisplayValue(userInterface.setUserInputValue());

        //Get operand
        operand = userInterface.captureOperandValue(userInterface.setUserOperandValue());
        if (operand.equals("^"))
            calculatorModel.performUnaryOperation(inputValue, '^');
        if (operand.equals("s"))
            calculatorModel.performUnaryOperation(inputValue, 's');

        //Do operation (Model)

        //Update display

        }


    public void captureErrorMessage(){
        displayModel.displayErrorMessage();
    }


}

