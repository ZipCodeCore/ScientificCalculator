import org.junit.Test;
import org.junit.Assert;

/**
 * Created by cameronsima on 4/29/17.
 */
public class TestCalculator {

    @Test
    public void testAddition() {

        Calculator calculator = new Calculator();
        double expectedValue = 5.0;
        double actualValue = calculator.add(2.5, 2.5);

        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void testAdditionDivideByZero() {

        Calculator calculator = new Calculator();
        String expectedValue = "Err";

        Assert.assertEquals(expectedValue, calculator.divide(5, 0));

    }

    @Test
    public void testSubtraction() {

        Calculator calculator = new Calculator();
        double expectedValue = 5.0;
        double actualValue = calculator.subtract(10.0, 5.0);
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void testMultiplication() {

        Calculator calculator = new Calculator();
        double expectedValue = 50.0;
        double actualValue = calculator.multiply(10.0, 5.0);
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void testDivision() {

        Calculator calculator = new Calculator();
        double expectedValue = 10.0;
        double actualValue = calculator.divide(2.0, 5.0);
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }


    @Test
    public void testGetSetCurrentOperator() {

        Calculator calculator = new Calculator();
        calculator.setCurrentOperator("/");
        String actualValue = calculator.getCurrentOperator();

        Assert.assertEquals("/", actualValue);

    }

    @Test
    public void testClearOperator() {

        Calculator calculator = new Calculator();
        calculator.setCurrentOperator("/");
        calculator.clearOperator();

        String expectedValue = "";
        String actualValue = calculator.getCurrentOperator();

        Assert.assertEquals(expectedValue, actualValue);
    }


}
