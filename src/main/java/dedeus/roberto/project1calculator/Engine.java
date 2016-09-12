package dedeus.roberto.project1calculator;

/**
 * Created by robertodedeus on 9/11/16.
 */
public class Engine {
    public void logic(){
        Display display = new Display();
        UserInterface userInterface = new UserInterface();
        CoreCalculator coreCalculator = new CoreCalculator();
        Memory memory = new Memory();

        int mainMenuSelection = userInterface.drawMainMenu();
        double operand = userInterface.promptOperand();

        switch (mainMenuSelection){
            case 1: display.setDisplayValue(coreCalculator.addition(display.getDisplayValue(), operand));
                break;
            case 2: display.setDisplayValue(coreCalculator.subtraction(display.getDisplayValue(), operand));
                break;
            case 3: display.setDisplayValue(coreCalculator.multiplication(display.getDisplayValue(), operand));
                break;
            case 4: display.setDisplayValue(coreCalculator.division(display.getDisplayValue(), operand));
                break;
        }
        
        System.out.println(display.getDisplayValue());

    }
}
