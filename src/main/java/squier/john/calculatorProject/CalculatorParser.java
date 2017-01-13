package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorParser {

    public String parseOperationFromUserInput(String userInput) {
        String[] splitInput = userInput.split(" ");
        return splitInput[0];
    }

    public String parseNumberFromUserInput(String userInput) {
        String[] splitInput = userInput.split(" ");
        return splitInput[1];
    }
}
