import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


/**
 * Created by stephenpegram on 4/29/17.
 */

public class UserInputReader {

    int currentStringIndex;
    boolean validEntry = false;

    UserInputReader() {

        currentStringIndex = 0;
    }


    public void readNumberInput(UserInputReader input, Memory memory, Scanner scanner, Display display) {


        memory.userInput = scanner.nextLine();

        if (memory.userInput.equals("q")) {
            return;
        }

        memory.userInput = memory.userInput.replaceAll("\\s", "");
        int convert = memory.userInput.charAt(0);

        if (convert < 48 || convert > 57) {
            display.promptValidEntry(input, memory, scanner, display);
        }
    }


    public void translateUserInput(Memory memory, UserInputReader input, Scanner scanner, Display display) {
        currentStringIndex = 0;
        String hitherto = " ";
        int convert = memory.userInput.charAt(0);

        while (convert >= 48 && convert <= 57) {
            hitherto = memory.userInput.substring(0, currentStringIndex + 1);
            memory.currentValue = Double.parseDouble(hitherto);


            if (currentStringIndex + 1 == memory.userInput.length()) {
                display.showCurrentValue(memory);
                return;
            } else {
                currentStringIndex++;
                convert = memory.userInput.charAt(currentStringIndex);
            }

            if (convert < 48 || convert > 57) {
                memory.functionInput = String.valueOf(memory.userInput.charAt(currentStringIndex));
                searchForOpOrFunc(memory, input, scanner);
            }

        }
    }

    public void searchForOpOrFunc(Memory memory, UserInputReader input, Scanner scanner) {
        memory.searchTwoArgumentOperations(input, scanner);
    }


    public void resetValidEntryFlag() {
        validEntry = false;
    }


//    public void testValue(Scanner scanner) {
//        String test;
//        System.out.println("Enter a numeric string");
//
//        test = scanner.nextLine();
//
//        if(StringUtils.isNumeric(test))
//        System.out.println("It has passed");
//        else
//            System.out.println("U mad.");
//    }

}


