import java.util.*;

/**
 * Created by stephenpegram on 4/29/17.
 */

public class Engine {


    public void run() {

        Scanner scanner = new Scanner(System.in);
        Display display = new Display();
        Memory memory = new Memory();
        UserInputReader input = new UserInputReader();

        while (!memory.userInput.equals("q")) {
            display.showMenu();
            input.readNumberInput(input, memory, scanner, display);
            if (!memory.userInput.equals("q")) {
                input.translateUserInput(memory, input, scanner, display);
                if (input.validEntry) {
                    display.showCurrentValue(memory);
                    System.out.println("it worked...now we have working line of logic. The rest is just finding ways to shorten it.");
                }
            }
        }
        System.out.println("Thats all folks...");
    }
}