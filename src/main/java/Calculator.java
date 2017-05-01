/**
 * Created by mattwu on 4/30/17.
 */
import java.util.Scanner;

public class Calculator {

    public static void main (String args[]){

        //first window: getting instruction
        Instruction intro = new Instruction();
        intro.print();

        //choosing method
        MethodSelect selectComputationMethod = new MethodSelect();
        boolean quit = false;
        selectComputationMethod.pickMethod(quit);


    }
}
