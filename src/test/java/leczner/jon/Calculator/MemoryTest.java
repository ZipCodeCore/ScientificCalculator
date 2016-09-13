package leczner.jon.Calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jonathanleczner on 9/12/16.
 */
public class MemoryTest {
    Calculator calc = new Calculator();

    @Test
    public void recallTest() {
        calc.basicMathUnit.add(1);
        assertEquals("0", calc.memory.recall());
    }

    @Test
    public void resetTest() {
        calc.basicMathUnit.add(1);
        calc.memory.store();
        calc.memory.reset();
        assertEquals(null, calc.memory.recall());
    }

    @Test
    public void storeTest() {
        calc.basicMathUnit.add(1);
        calc.memory.store();
        assertEquals("1", calc.memory.recall());
    }
}
