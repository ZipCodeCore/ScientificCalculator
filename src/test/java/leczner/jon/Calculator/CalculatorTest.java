package leczner.jon.Calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jonathanleczner on 9/12/16.
 */
public class CalculatorTest {


    @Test
    public void calculatorTest() { // check init
        Calculator calc = new Calculator();
        assertNotNull(calc);
        assertNotNull(calc.basicMathUnit);
        assertNotNull(calc.display);
        assertNotNull(calc.memory);
    }

}
