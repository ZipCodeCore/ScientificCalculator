package Calculator;

import org.junit.Test;

/**
 * Created by randallcrame on 1/15/17.
 */
public class DisplayTest {
    Display test = new Display();

    @Test
    public void clearScreenTest(){
        System.out.println("This line should be cleared");
        test.clearScreen();
        test.setDefaultState();
    }

    @Test
    public void setDefaultDisplayTest(){
        test.setDefaultState();
    }
}
