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

    // REFACTOR: this whole method needs broken up just like model
    public void runCalculator() {

        //boolean keepLooping = true; change loop condition to something more elegant
        String[] splitUserInput = new String[3];
        splitUserInput[0] = "";
        splitUserInput[1] = "";
        splitUserInput[2] = "";

        // "game" loop
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

            // update display
            calculatorDisplay.displayCurrentState(currentValue, memoryValue, calculatorModel.getDisplayMode());
            calculatorDisplay.displayAvailableOperations(calculatorModel.getOperations().getAvailableOperations());
            calculatorDisplay.displayInputPrompt();

            // put user input into a string array
            String userInput = calculatorInput.getUserInput();
            splitUserInput = calculatorParser.parseUserInput(userInput);

            // handle special operations
            if ( splitUserInput[0].equalsIgnoreCase("sdm") ) {
                calculatorModel.setDisplayMode(calculatorModel.getDisplayMode().advanceDisplayMode());
            }
            // update memory
            else if ( splitUserInput[0].equalsIgnoreCase("M+") ) {
                // if currentValue is NaN don't update memory
                if ( Double.isNaN(calculatorModel.getCurrentValue()) ) {
                    // do nothing in this case
                }
                else {
                    calculatorModel.setMemoryValue(calculatorModel.getCurrentValue());
                }
            }
            // clear memory
            else if ( splitUserInput[0].equalsIgnoreCase("MC") ) {
                calculatorModel.setMemoryValue(0.0);
            }
            // recall memory
            else if ( splitUserInput[0].equalsIgnoreCase("MRC") ) {
                calculatorModel.setCurrentValue(calculatorModel.getMemoryValue());
            }
            // handle math operations
            else {
                calculatorModel.updateState(splitUserInput);
            }
        }
    }
}
