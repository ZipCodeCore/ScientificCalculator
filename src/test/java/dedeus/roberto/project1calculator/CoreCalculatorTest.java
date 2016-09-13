package dedeus.roberto.project1calculator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by robertodedeus on 9/12/16.
 */

public class CoreCalculatorTest {

    private CoreCalculator coreCalculator;
    private State state;
    private UserInterface userInterface;

    @Before
    public void initialize(){
        coreCalculator = new CoreCalculator();
        state = new State();
        userInterface = new UserInterface();
    }

    @Test
    public void additionTest(){
        double expectedValue = 10;
        double actualValue = coreCalculator.addition(state.getStateValue(), 10);
        assertEquals(expectedValue, actualValue, 1);
    }

    @Test
    public void subtractionTest(){
        double expectedValue = -10;
        double actualValue = coreCalculator.subtraction(state.getStateValue(), 10);
        assertEquals(expectedValue, actualValue, 1);
    }

    @Test
    public void multiplicationTest(){
        state.setStateValue(10);
        double expectedValue = 100;
        double actualValue = coreCalculator.multiplication(state.getStateValue(), 10);
        assertEquals(expectedValue, actualValue, 1);
    }

    @Test
    public void divisionTest(){
        state.setStateValue(100);
        double expectedValue = 10;
        double actualValue = coreCalculator.division(state.getStateValue(), 10);
        assertEquals(expectedValue, actualValue, 1);
    }

    @Test
    public void squareTest(){
        state.setStateValue(10);
        double expectedValue = 100;
        double actualValue = coreCalculator.square(state.getStateValue());
        assertEquals(expectedValue, actualValue, 1);
    }

    @Test
    public void squareRootTest(){
        state.setStateValue(100);
        double expectedValue = 10;
        double actualValue = coreCalculator.squareRoot(state.getStateValue());
        assertEquals(expectedValue, actualValue, 1);
    }

    @Test
    public void variableExponentiationTest(){
        state.setStateValue(10);
        double expectedValue = 1000;
        double actualValue = coreCalculator.variableExponentiation(state.getStateValue(), 3);
        assertEquals(expectedValue, actualValue, 1);
    }

    @Test
    public void inverseTest(){
        state.setStateValue(10);
        double expectedValue = 1 / 10;
        double actualValue = coreCalculator.inverse(state.getStateValue());
        assertEquals(expectedValue, actualValue, 1);
    }

    @Test
    public void switchSignTest(){
        state.setStateValue(10);
        double expectedValue = -10;
        double actualValue = coreCalculator.switchSign(10);
        assertEquals(expectedValue, actualValue, 1);
    }

    @Test
    public void factorialTest(){
        double expectedValue = 6;
        double actualValue = coreCalculator.factorial(3);
        assertEquals(expectedValue, actualValue, 1);
    }

}
