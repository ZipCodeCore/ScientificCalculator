/**
 * Created by mattwu on 4/30/17.
 */
import java.util.Scanner;

public class Display {

    public static void main (String args[]){

        //default state, showing instruction
        System.out.println("\n");
        System.out.println("*********************  Calculator in CommandLine   **************************");
        System.out.println("  1: Addition   2: Subtraction    3: Multiplication    4: Division");
        System.out.println("  5: Clear      6: Exit");
        System.out.println("*****************************************************************************");

        MethodSelect selectComputationMethod = new MethodSelect();
        selectComputationMethod.pickMethod();

    }
}
