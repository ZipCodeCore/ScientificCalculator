/**
 * Created by danzygmund-felt on 4/30/17.
 */
import org.junit.*;

public class CustomScientificCalculatorTest {

    @Test
    public void logbxSimpleTest() {
        //Given
        CustomScientificCalculator calc = new CustomScientificCalculator();
        double expected = 4.0;
        //When
        double actual = calc.logbx(3.0, 81.0);
        //Then
        Assert.assertEquals("log3(81) = 4", expected, actual, 0.00001);
    }

    @Test
    public void logbxBNonIntegerTest() {
        //Given
        CustomScientificCalculator calc = new CustomScientificCalculator();
        //When
        double result = calc.logbx(8.323, 10.0);
        //Then
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void logbxBNegativeTest() {
        //Given
        CustomScientificCalculator calc = new CustomScientificCalculator();
        //When
        double result = calc.logbx(-1.0, 10.0);
        //Then
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void logbxXNotPositiveTest() {
        //Given
        CustomScientificCalculator calc = new CustomScientificCalculator();
        //When
        double result = calc.logbx(3.0, -3.0);
        //Then
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void modulusSimpleTest() {
        //Given
        CustomScientificCalculator calc = new CustomScientificCalculator();
        double expected = 7.0;
        //When
        double actual = calc.modulus(39.0, 8.0);
        //Then
        Assert.assertEquals("39 mod 8 = 7", expected, actual, 0.00001);
    }
}
