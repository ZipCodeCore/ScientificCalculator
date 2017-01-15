package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorController {

    private CalculatorInput calculatorInput;
    private CalculatorDisplay calculatorDisplay;
    private CalculatorModel calculatorModel;
    private CalculatorParser calculatorParser;

    public CalculatorController() {
        calculatorInput = new CalculatorInput();
        calculatorDisplay = new CalculatorDisplay();
        calculatorModel = new CalculatorModel();
        calculatorParser = new CalculatorParser();
    }

    public void runCalculator() {

        //boolean keepLooping = true; change loop condition to something more elegant
        String[] splitUserInput = new String[3];
        splitUserInput[0] = "";
        splitUserInput[1] = "";
        splitUserInput[2] = "";

        while (!splitUserInput[0].equalsIgnoreCase("exit")) {

            String currentValue;
            String memoryValue;

            // fill current value
            if (Double.isNaN(calculatorModel.getCurrentValue())) {
                currentValue = "Err";
            }
            else {
                currentValue = Double.toString(calculatorModel.getCurrentValue());
            }

            // fill memory value
            memoryValue = Double.toString(calculatorModel.getMemoryValue());

            calculatorDisplay.displayCurrentState(currentValue, memoryValue, calculatorModel.getDisplayMode());

            calculatorDisplay.displayAvailableOperations(calculatorModel.getOperations().getAvailableOperations());
            calculatorDisplay.displayInputPrompt();

            String userInput = calculatorInput.getUserInput();

            splitUserInput = calculatorParser.parseUserInput(userInput);

            if ( splitUserInput[0].equalsIgnoreCase("sdm") ) {
                calculatorModel.setDisplayMode(calculatorModel.getDisplayMode().advanceDisplayMode());
            }
            else if ( splitUserInput[0].equalsIgnoreCase("M+") ) {
                calculatorModel.setMemoryValue(calculatorModel.getCurrentValue());
            }
            else {
                calculatorModel.updateState(splitUserInput);
            }
        }
    }
}
