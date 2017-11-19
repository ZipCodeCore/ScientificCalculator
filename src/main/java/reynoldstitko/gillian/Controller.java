package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/14/17.
 */
public class Controller {

    private SimpleCalculationsModel simpleCalculationsModel = new SimpleCalculationsModel();
    private SquaredCalculationModel squaredCalculationModel = new SquaredCalculationModel();
    private SquareRootCalculationModel squareRootCalculationModel = new SquareRootCalculationModel();
    private Display displayModel = new Display();
    private UserInterface userInterface = new UserInterface();
    private String operand;
    private Double inputFirstValue;
    private Double inputSecondValue;

    public void runCalculator(){

        //Clear the display
        displayModel.clearDisplay();
        System.out.println();

        //Get the first number value
        //inputValue = userInterface.captureUserInputValue(userInterface.setUserInputValue());
        inputFirstValue = userInterface.captureUserInputValue();

        //Get user operand value
        operand = userInterface.captureOperandValue();

        if(operand.equals("^")){
            System.out.print(squaredCalculationModel.squared(inputFirstValue));
        } else if(operand.equals("s")) {
            System.out.print(squareRootCalculationModel.squareRoot(inputFirstValue));
        } else {
            inputSecondValue = userInterface.captureUserInputValue();
        }

        switch(operand) {
                case "+":
                    System.out.print(simpleCalculationsModel.addition(inputFirstValue, inputSecondValue));
                    break;
                case "-": System.out.print(simpleCalculationsModel.subtraction(inputFirstValue, inputSecondValue));
                    break;
                case "/": System.out.print(simpleCalculationsModel.division(inputFirstValue, inputSecondValue));
                    break;
                case "*": System.out.print(simpleCalculationsModel.multiplication(inputFirstValue, inputSecondValue));
                    break;
            }

        }
}

