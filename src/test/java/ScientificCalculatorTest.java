/**
 * Created by danzygmund-felt on 4/29/17.
 */
import org.junit.*;

public class ScientificCalculatorTest {

    @Test
    public void sinTest() {
        //Given
        Calculator calc = new Calculator();
        double expected = 1.0;
        //When
        double actual = calc.sin(Math.PI / 2);
        //Then
        Assert.assertEquals("sin(pi/2) = 1", expected, actual, 0);
    }

    @Test
    public void cosTest() {
        //Given
        Calculator calc = new Calculator();
        double expected = 0.0;
        //When
        double actual = calc.cos(Math.PI / 2);
        //Then
        Assert.assertEquals("cos(pi/2) = 0", expected, actual, 0);
    }

    @Test
    public void tanTest() {
        //Given
        Calculator calc = new Calculator();
        double expected = 1.0;
        //When
        double actual = calc.tan(Math.PI / 4);
        //Then
        Assert.assertEquals("tan(pi/4) = 1", expected, actual, 0);
    }


}
