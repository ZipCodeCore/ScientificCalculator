package dedeus.roberto.project1calculator;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by robertodedeus on 9/12/16.
 */

public class CoreCalculatorTest {
    @Test
    public void additionTest(){
        CoreCalculator coreCalculator = new CoreCalculator();
        State state = new State();
        double expectedValue = 10;
        double actualValue = coreCalculator.addition(state.getStateValue(), 10);
        assertEquals(expectedValue, actualValue, 1);
    }

    @Test
    public void subtractionTest(){
        CoreCalculator coreCalculator = new CoreCalculator();
        State state = new State();
        double expectedValue = -10;
        double actualValue = coreCalculator.subtraction(state.getStateValue(), 10);
        assertEquals(expectedValue, actualValue, 1);
    }

    @Test
    public void multiplicationTest(){
        CoreCalculator coreCalculator = new CoreCalculator();
        State state = new State();
        state.setStateValue(10);
        double expectedValue = 100;
        double actualValue = coreCalculator.multiplication(state.getStateValue(), 10);
        assertEquals(expectedValue, actualValue, 1);
    }

    @Test
    public void divisionTest(){
        CoreCalculator coreCalculator = new CoreCalculator();
        State state = new State();
        state.setStateValue(100);
        double expectedValue = 10;
        double actualValue = coreCalculator.division(state.getStateValue(), 10);
        assertEquals(expectedValue, actualValue, 1);
    }

}
