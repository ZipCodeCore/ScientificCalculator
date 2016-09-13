package leczner.jon.Calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jonathanleczner on 9/12/16.
 */
public class DisplayTest {
    Calculator calc = new Calculator();

    @Test
    public void clearTest() {
        calc.basicMathUnit.divide(0);
        assertEquals("Err", calc.basicMathUnit.getState());
        calc.display.clear();
        assertEquals("0", calc.basicMathUnit.getState());
        calc.display.clear();
        assertEquals("0", calc.basicMathUnit.getState());
    }

    @Test
    public void showStateTest() {
        assertEquals("0", calc.basicMathUnit.getState());
        calc.display.showState();

    }

    @Test
    public void switchDisplayModeTest1() { // no input
        calc.basicMathUnit.add(2);
        calc.display.switchDisplayMode();
        assertEquals("0200", calc.basicMathUnit.getState());
        calc.display.switchDisplayMode();
        assertEquals("0010", calc.basicMathUnit.getState());
        calc.display.switchDisplayMode();
        assertEquals("2", calc.basicMathUnit.getState());
    }

    @Test
    public void switchDisplayModeTest2() { // with input
        calc.basicMathUnit.add(2);
        calc.display.switchDisplayMode(Display.Mode.BINARY);
        assertEquals("0010", calc.basicMathUnit.getState());
    }
}
