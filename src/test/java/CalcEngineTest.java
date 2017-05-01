import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;



public class CalcEngineTest {

    CalcEngine calc;

    @Before
    public void setUp() {
        calc = new CalcEngine();
    }

    @Test
    public void testCalculateAddition() {
        //: Given
        double firstNumber = 5;
        double secondNumber = 4;

        double expectedSum = 9;

        //: When
        double actualSum = calc.add(firstNumber, secondNumber); // ... Take actual sum

        //: Then
        // ... The result should be the average of the array, with an epsilon of 0
        Assert.assertEquals("The expected sum is 9", expectedSum, actualSum, 0.001);

    }

    @Test
    public void testCalculateSubtraction() {
        //: Given
        double firstNumber = 5;
        double secondNumber = 4;

        double expectedSum = 1;

        //: When
        double actualSum = calc.subtract(firstNumber, secondNumber); // ... Take actual sum

        //: Then
        Assert.assertEquals("The expected answer is 1", expectedSum, actualSum, 0.001);

    }

    @Test
    public void testCalculateDivision() {
        //: Given
        double firstNumber = 6;
        double secondNumber = 3;

        double expectedSum = 2;

        //: When
        double actualSum = calc.divide(firstNumber, secondNumber); // ... Take actual sum

        //: Then
        Assert.assertEquals("The expected answer is 2", expectedSum, actualSum, 0.001);

    }

    @Test
    public void testCalculateMultiplication() {
        //: Given
        double firstNumber = 5;
        double secondNumber = 4;

        double expectedSum = 20;

        //: When
        double actualSum = calc.multiply(firstNumber, secondNumber); // ... Take actual sum

        //: Then
        Assert.assertEquals("The expected answer is 20", expectedSum, actualSum, 0.001);

    }

    @Test
    public void testCalculateSquare() {
        //: Given
        double firstNumber = 5;

        double expectedSum = 25;

        //: When
        double actualSum = calc.square(firstNumber);

        //: Then
        Assert.assertEquals("The expected answer is 25", expectedSum, actualSum, 0.001);

    }

    @Test
    public void testCalculateSquareRoot() {
        //: Given
        double firstNumber = 25;

        double expectedSum = 5;

        //: When
        double actualSum = calc.squareRoot(firstNumber);

        //: Then
        Assert.assertEquals("The expected answer is 5", expectedSum, actualSum, 0.001);

    }
}
