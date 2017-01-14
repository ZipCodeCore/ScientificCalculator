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

            if (Double.isNaN(calculatorModel.getCurrentValue())) {
                currentValue = "Err";
            }
            else {
                currentValue = Double.toString(calculatorModel.getCurrentValue());
            }

            calculatorDisplay.displayCurrentState(currentValue);

            calculatorDisplay.displayAvailableOperations(calculatorModel.getOperations().getAvailableOperations());
            calculatorDisplay.displayInputPrompt();

            String userInput = calculatorInput.getUserInput();

            splitUserInput = calculatorParser.parseUserInput(userInput);

            calculatorModel.updateState(splitUserInput);
        }
    }
}
