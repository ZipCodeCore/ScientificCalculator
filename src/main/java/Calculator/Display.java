package Calculator;
import java.util.Arrays;

/**
 * Created by randallcrame on 1/15/17.
 */
public class Display {
    static String borderDisplay = "**********************************";
    static String equationBorderDisplay = "**                              **"; //Remembers equation and displays if time permits
    static String numeralBorderDisplay;
    static String stringBorderDisplay;
    static String storeMemoryBorderDisplay;
    static String defaultBorderDisplay = String.format("**%30.1f**", 0.0);

    public void clearScreen() {

        /*char c = '\n'; //really dirty way to 'clear' screen
        int length = 25;
        char[] chars = new char[length];
        Arrays.fill(chars, c);
        System.out.print(String.valueOf(chars));*/
    }

    static public void getDefaultState() {
        System.out.println(borderDisplay);
        System.out.println(equationBorderDisplay);
        System.out.println(defaultBorderDisplay) ; // formatting %f
        System.out.println(borderDisplay);
    }

    static private void setNumeralValueForBorder(){
        numeralBorderDisplay = String.format("**%30.1f**", Input.getNumeralCommand());
    }

    static private void setStringValueForBorder(){
        stringBorderDisplay = String.format("**%30s**", Input.getCommand());
    }

    static private void setSingleMemoryBorder(){
        storeMemoryBorderDisplay = String.format("**%30s**", Input.getSingleMemory());

    }

    static public void getNumeralBorderDisplay(){
        setNumeralValueForBorder();
        System.out.println(borderDisplay);
        System.out.println(equationBorderDisplay);
        System.out.println(numeralBorderDisplay);
        System.out.println(borderDisplay);
    }

    static public void getStringBorderDisplay(){
        setStringValueForBorder();
        System.out.println(borderDisplay);
        System.out.println(equationBorderDisplay);
        System.out.println(stringBorderDisplay) ;
        System.out.println(borderDisplay);
    }

    static public void getStoredMemoryDisplay(){
        setSingleMemoryBorder();
        System.out.println(borderDisplay);
        System.out.println(equationBorderDisplay);
        System.out.println(storeMemoryBorderDisplay);
        System.out.println(borderDisplay);
    }
}
