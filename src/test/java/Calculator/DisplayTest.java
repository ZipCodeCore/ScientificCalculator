package Calculator;

import org.junit.Test;
import Calculator.Input;
/**
 * Created by randallcrame on 1/15/17.
 */
public class DisplayTest {
    Display test = new Display();

    @Test
    public void clearScreenTest(){
        System.out.println("This line should be cleared");
        test.clearScreen();
        test.getDefaultState();
    }

    @Test
    public void getDefaultStateTest(){
        test.getDefaultState();
    }

    @Test
    public void getAndSetNumeralBorderDisplayTest(){
        Input.setNumeralCommand(3.0);
        //expected to display 3.0;
        test.getNumeralBorderDisplay();
    }

    @Test
    public void getAndSetStringBorderDisplayTest(){
        Input.setCommand(EngineCommands.ERR);
        //expected to display Err
        test.getStringBorderDisplay();
    }
}
