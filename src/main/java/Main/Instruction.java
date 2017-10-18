package Main;

/**
 * Created by jennifermcginty on 4/29/17.
 */
public class Instruction {

    Display display = new Display();

    public void startInstruction(){
        display.print("Select you operation \n Enter 1 for add \n Enter 2 for Subtract " +
                "\n Enter 3 for Multiply \n Enter 4 for Divide. \n Enter 5 for Square" +
                "\n Enter 6 for Square Root \n Enter 7 for Exponents \n Enter 8 for Inversion. \n");
    }

    public void printNumberInstructions(){
        display.print("Enter Your Number \n");
    }

    public void printAnswer(){
        display.print("Your results are \n");
    }
}
