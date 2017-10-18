import Main.AdvancedCalculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 4/29/17.
 */
public class AdvancedCalculatorTest {


    @Test
    public void square(){
        AdvancedCalculator advancedCalculatorTest = new AdvancedCalculator();

        double expected = 9;
        double actual = advancedCalculatorTest.square(3);

        Assert.assertEquals("The results should be 9", expected, actual, .05);
    }

    @Test
    public void squareRootTest(){
        AdvancedCalculator advancedCalculatorTest = new AdvancedCalculator();

        double expected = 3;
        double actual = advancedCalculatorTest.squareRoot(9);

        Assert.assertEquals("The results should be 3", expected, actual, .05);
    }

    @Test
    public void exponentsTest(){
        AdvancedCalculator advancedCalculatorTest = new AdvancedCalculator();

        double expected = 512;
        double actual = advancedCalculatorTest.exponents(8,3);


        Assert.assertEquals("The results should be 512", expected, actual, .05);
    }

    @Test
    public void inverseTest(){
        AdvancedCalculator advancedCalculatorTest = new AdvancedCalculator();

        double expected = 5;
        double actual = advancedCalculatorTest.inverse(-5,-1);

        Assert.assertEquals("The results should be five", expected, actual, .05);
    }
}
