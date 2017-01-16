package Calculator;
import java.util.Arrays;

/**
 * Created by randallcrame on 1/15/17.
 */
public class Display {
    String borderDisplay = "**********************************";
    String equationBorderDisplay = "**                              **";
    String numeralBorderDisplay = String.format("**%30d**", 0);

    public Display(){}

    public void clearScreen() {

        /*char c = '\n'; //really dirty way to 'clear' screen
        int length = 25;
        char[] chars = new char[length];
        Arrays.fill(chars, c);
        System.out.print(String.valueOf(chars));*/
    }

    public void setDefaultState() {
        System.out.println(borderDisplay);
        System.out.println(equationBorderDisplay);
        System.out.println(numeralBorderDisplay) ; // formatting %f
        System.out.println(borderDisplay);
    }

}
