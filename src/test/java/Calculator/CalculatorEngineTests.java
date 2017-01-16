package Calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by randallcrame on 1/16/17.
 */
public class CalculatorEngineTests {


    @Test
    public void executeTwoInputEquationsTest(){
        Input.setCommand(EngineCommands.ADD);
        Input.setLeftValue(3.0);
        Input.setRightValue(3.0);

        //test.executeTwoInputEquations();
        double expected = 6.0;
        double actual = Input.getSingleMemory();
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void executeOneInputEquationsTest(){
        Input.setCommand(EngineCommands.SQU);
        Input.setLeftValue(3.0);
        //test.executeOneInputEquations();
        double expected = 9.0;
        double actual = Input.getSingleMemory();
        assertEquals(expected,actual, 0.0);
    }
}
