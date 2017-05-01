import java.util.Scanner;

/**
 * Created by denniskalaygian on 4/30/17.
 */
public class ScientificCalculator extends CoreCalculator {

    private static double memoryValue = 5.00;

    public double getMemoryValue(){
        return memoryValue;
    }

    public void setMemoryValue(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to be stored in memory: ");
        memoryValue = 5.00; //Uncomment this line and delete value after testing: in.nextDouble();
    }

    public void displayMemoryValue(){
        System.out.println(memoryValue);
    }

    public void clearMemoryValue(){
        memoryValue = 0.00;
    }
}
