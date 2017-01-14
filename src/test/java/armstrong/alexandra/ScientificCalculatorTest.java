package armstrong.alexandra;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alexandraarmstrong on 1/13/17.
 */
public class ScientificCalculatorTest {
    ScientificCalculator sciCalc;

    @Before
    public void setUp(){
        sciCalc = new ScientificCalculator();
    }

    @Test
    public void addDisplayToMemoryTest(){
        sciCalc.setDisplay(4);
        sciCalc.addDisplayToMemory();
        double expected = 4;
        double actual = sciCalc.getMemory();
        assertEquals(expected, actual);
    }

    @Test
    public void resetMemoryTest(){
        sciCalc.setMemory(4);
        sciCalc.resetMemory();
        double expected = 0;
        double actual = sciCalc.getMemory();
        assertEquals(expected, actual);
    }

    @Test
    public void recallStoredValueFromMemoryTest(){
        sciCalc.setMemory(4);
        sciCalc.recallStoredValueFromMemory();
        double expected = 4;
        double actual = sciCalc.getDisplay();
        assertEquals(expected, actual);
    }


    @Test
    @Ignore
    public void switchDisplayModeTest(){}

    @Test
    @Ignore
    public void switchDisplayModeStringTest(){}

    @Test
    @Ignore
    public void toggleScientificNotationTest(){}

    @Test
    @Ignore
    public void sineTest(){}

    @Test
    @Ignore
    public void cosineTest(){}

    @Test
    @Ignore
    public void tangentTest(){}

    @Test
    @Ignore
    public void inverseSineTest(){}

    @Test
    @Ignore
    public void inverseCosineTest(){}

    @Test
    @Ignore
    public void inverseTangentTest(){}

    @Test
    @Ignore
    public void switchUnitsModeTest(){}

    @Test
    @Ignore
    public void switchUnitsModeStringTest(){}
}
