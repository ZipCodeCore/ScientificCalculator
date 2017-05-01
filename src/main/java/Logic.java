/**
 * Created by andrewwong on 4/30/17.
 */
public class Logic {

    private TaskAssigner taskDelegater;
    private Display display;
    private Memory memory;


    public Logic(TaskAssigner taskDelegater, Display display, Memory memory) {
        this.taskDelegater = taskDelegater;
        this.display = display;
        this.memory = memory;
    }

    public void run(){
        boolean power = true;
        display.printString("Display value:");
        display.printDisplayValue();
        do {
            String operation = display.userStringInput("What operation would you like to do? (Enter off to turn calculator off)");
            if (operation.equalsIgnoreCase("off")) {
                power = false;
                break;
            }
            String secondOperand = display.userStringInput("Enter the second operand");
            double secondNumber = Double.parseDouble(secondOperand);

            taskDelegater.doOperation(operation, secondNumber);

            if(memory.hasError()){
                display.updateDisplayToError();
            }
            else {
                display.printString("Display value:");
                display.printDisplayValue();
                memory.setMemoryValue(memory.getDisplayValue());
            }

        }while (power);


    }

}
