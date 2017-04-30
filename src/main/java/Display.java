import java.util.Scanner;

/**
 * Created by andrewwong on 4/28/17.
 */
public class Display {

    private Scanner scanner;
    private Memory memory;
    private String displayMode;

    public Display(Memory memory, Scanner scanner) {
        this.memory = memory;
        this.scanner = scanner;
        this.displayMode = "default";
    }

    public void printDisplayValue() {
        double displayValue = memory.getDisplayValue();
        System.out.println(displayValue);
    }


    public void printString(String input) {
        System.out.println(input);
    }
    public void printValue(double value){
        System.out.println(value);
    }

    public void updateDisplayToError() {
        System.out.println("Err");
    }

    public String userStringInput(String request) {
        System.out.println(request);
        return scanner.nextLine();
    }



}
