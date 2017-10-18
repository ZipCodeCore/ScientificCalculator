package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/16/17.
 */
public class Controller {
    private SimpleCalculationsModel simpleCalculationsModel = new SimpleCalculationsModel();
    private SquaredCalculationModel squaredCalculationModel = new SquaredCalculationModel();
    private SquareRootCalculationModel squareRootCalculationModel = new SquareRootCalculationModel();
    //private DetermineEquationToRun determineEquationToRun = new DetermineEquationToRun();
    private Display displayModel = new Display();
    private UserInterface userInterface = new UserInterface();
    private MemoryModel memoryModel = new MemoryModel();

    public String operand;
    public Double inputFirstValue;
    public Double inputSecondValue;

    public void runCalculator(){

        //Clear the display
        displayModel.clearDisplay();
        System.out.println();

        //Get the first number value
        inputFirstValue = userInterface.captureUserInputValue();
        memoryModel.memoryValue = inputFirstValue;

        //Get user operand value
        operand = userInterface.captureOperandValue();

        //determineEquationToRun.runFunction(operand, inputFirstValue);

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
