package io.zipcoder.Calculator;

/**
 * Created by mollyarant on 4/29/17.
 */
    public class Engine {
    Instruction instruction;
    Input input;
    MenuLogic logic;


    public Engine() {
        instruction = new Instruction();
        input = new Input();
        logic = new MenuLogic();
    }


    public void runEngine() {
        while (logic.getRun()) {
            instruction.tellClearValue();
            instruction.tellMenuChoice();
            logic.menuChoice(input.takeUserInt());

        }

    }

}

