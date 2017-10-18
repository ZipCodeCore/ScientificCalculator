/**
 * Created by stephenpegram on 4/29/17.
 */

import java.lang.*;
import java.util.*;


public class Display {

        public void showMenu() {

               System.out.println("\nFor two argument operations enter number, operation, number");
               System.out.println("For functions enter number, function (then base for logarithm");
               System.out.println("To quit, enter 'q' ");
        }

        public void promptValidEntry(UserInputReader input, Memory memory, Scanner scanner, Display display){
                System.out.println("Entered input is invalid. Enter a valid input.");
                input.readNumberInput(input, memory, scanner, display);
        }

        public void showCurrentValue (Memory memory){
                System.out.println(memory.currentValue);
        }
}
