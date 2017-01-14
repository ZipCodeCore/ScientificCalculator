package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/14/17.
 */
public class Controller {

    private SimpleCalculationsModel simpleCalculationsModel;
    private Display displayModel;
    private UserInterface userInterface;
    private String operand;
    private Double inputValue;

    public void runCalculator(){

        //Clear the display
        displayModel.clearDisplay();

        //Get first user operand value
        inputValue = userInterface.captureUserInputValue(userInterface.setUserInputValue());

        //Get the first number value

        //Update the display
        displayModel.setCurrentDisplayValue(userInterface.setUserInputValue());

        //Get operand
//        operand = userInterface.captureOperandValue(userInterface.setUserOperandValue());
//        if (operand.equals("^"))
//            simpleCalculationsModel.performUnaryOperation(inputValue, '^');
//        if (operand.equals("s"))
//            simpleCalculationsModel.performUnaryOperation(inputValue, 's');

        //Do operation (Model)

        //Update display

        }


    public void captureErrorMessage(){
        displayModel.displayErrorMessage();
    }


}

