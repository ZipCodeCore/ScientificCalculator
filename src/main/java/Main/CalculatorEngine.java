package Main;

/**
 * Created by jennifermcginty on 4/30/17.
 */
public class CalculatorEngine {
    Instruction intro;
    MenuLogic menu;
    UserInput input;

    public CalculatorEngine() {

        intro = new Instruction();
        menu = new MenuLogic();
        input = new UserInput();
    }

    public void startCalculator(){
        intro.startInstruction();
        menu.menuChoice(input.takeUserInt());
    }


}
