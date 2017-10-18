package Calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by randallcrame on 1/13/17.
 */
public class InputTests {

    Input test = new Input();
/*
     @Test
     public void (){
        Double expected = 0.0;
        Double actual = ;
        Assert.assertEquals(expected, actual);
    }
*/
    @Test
    public void getLeftValueTest(){
        double expected = 0.0;
        double actual = test.getLeftValue();
        Assert.assertEquals(expected, actual, 0.0);

    }
    @Test
    public void getRightValueTest(){
        double expected = 0.0;
        double actual = test.getRightValue();
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void getSingleMemoryTest(){
        Double expected = 0.0;
        Double actual = test.getSingleMemory();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setLeftValueTest(){
        Double expected = 1.0;
        test.setLeftValue(1.0);
        Double actual = test.getLeftValue();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setRightValueTest (){
        Double expected = 1.0;
        test.setRightValue(1.0);
        Double actual = test.getRightValue();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setResultsSingleMemoryTest(){
        Double expected = 1.0;
        test.setResults(1.0);
        Double actual = test.getSingleMemory();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setResults(){
        Double expected = 1.0;
        test.setResults(1.0);
        Double actual = test.getLeftValue();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAndSetCommandTest(){
        EngineCommands expected = EngineCommands.ADD;
        test.setCommand(EngineCommands.ADD);
        EngineCommands actual = test.getCommand();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAndSetNumeralCommandTest() {
        double expected = 1.0;
        test.setNumeralCommand(1.0);
        double actual = test.getNumeralCommand();
        Assert.assertEquals(expected, actual, 0.0);
    }

}
