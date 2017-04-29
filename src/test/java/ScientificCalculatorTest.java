/**
 * Created by danzygmund-felt on 4/29/17.
 */
import org.junit.*;

public class ScientificCalculatorTest {

    @Test
    public void sinTest() {
        //Given
        ScientificCalculator calc = new ScientificCalculator();
        double expected = 1.0;
        //When
        double actual = calc.sin(Math.PI / 2);
        //Then
        Assert.assertEquals("sin(pi/2) = 1", expected, actual, 0);
    }

    @Test
    public void cosTest() {
        //Given
        ScientificCalculator calc = new ScientificCalculator();
        double expected = 0.0;
        //When
        double actual = calc.cos(Math.PI / 2);
        //Then
        Assert.assertEquals("cos(pi/2) = 0", expected, actual, 0);
    }

    @Test
    public void tanTest() {
        //Given
        ScientificCalculator calc = new ScientificCalculator();
        double expected = 1.0;
        //When
        double actual = calc.tan(Math.PI / 4);
        //Then
        Assert.assertEquals("tan(pi/4) = 1", expected, actual, 0);
    }

    @Test
    public void tanCosineEqualsZeroTest() {
        //Given
        ScientificCalculator calc = new ScientificCalculator();
        //When
        double result = calc.tan(Math.PI / 2);
        //Then
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void asinTest() {
        //Given
        ScientificCalculator calc = new ScientificCalculator();
        double expected = Math.PI / 3;
        //When
        double actual = calc.asin(Math.sqrt(3.0) / 2);
        //Then
        Assert.assertEquals("arcsin of root three over two is pi/3", expected, actual, 0);
    }

    @Test
    public void acosTest() {
        //Given
        ScientificCalculator calc = new ScientificCalculator();
        double expected = Math.PI / 3;
        //When
        double actual = calc.acos(0.5);
        //Then
        Assert.assertEquals("arccos(0.5) = pi/3", expected, actual, 0);
    }

    @Test
    public void atanTest() {
        //Given
        ScientificCalculator calc = new ScientificCalculator();
        double expected = 0.0;
        //When
        double actual = calc.atan(0.0);
        //Then
        Assert.assertEquals("arctan(0) = 0", expected, actual, 0);
    }

}
