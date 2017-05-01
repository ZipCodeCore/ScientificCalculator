import Main.BasicCalculator;
import org.junit.Assert;
import org.junit.Test;

import static java.lang.Double.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by jennifermcginty on 4/28/17.
 */
public class BasicCalculatorTest {


    @Test
    public void addNumsTest(){
        BasicCalculator calcTest = new BasicCalculator();

        double expected = 11;
        double actual = calcTest.addNums(5,6);

        assertEquals("The results should be 11", expected, actual, .05);
    }

    @Test
    public void subNumsTest(){
        BasicCalculator calcTest = new BasicCalculator();

        double expected = 3;
        double actual = calcTest.subNums(7,4);

        assertEquals("The results should be 3", expected, actual, .05);
    }

    @Test
    public void multiNumsTest(){
        BasicCalculator calcTest = new BasicCalculator();

        double expected = 15;
        double actual = calcTest.multiNums(5,3);

        assertEquals("The results should be 15", expected,actual,.05);
    }

    @Test
    public void divideNumsTest(){
        BasicCalculator calcTest = new BasicCalculator();

        double expected= 5;
        double actual = calcTest.divideNum(30,6);

        assertEquals("The results should be 5", expected, actual, .05);
    }

    @Test
    public void divideNumsZeroTest(){
        BasicCalculator calcTest = new BasicCalculator();

        double expected = Double.NaN;
        double actual = calcTest.divideNum(0,0);

        assertEquals("Testing for Zero", expected, actual, .05);
    }

}
