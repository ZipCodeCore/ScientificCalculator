import java.util.Scanner;
/**
 * Created by andrewwong on 4/30/17.
 */
public class Logic {

    private Calculator calculator;
    private Display display;


    public Logic(Calculator calculator, Display display) {
        this.calculator = calculator;
        this.display = display;
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

            calculator.doOperation(operation, secondNumber);

            display.printString("Display value:");
            display.printDisplayValue();

        }while (power);


    }

}
