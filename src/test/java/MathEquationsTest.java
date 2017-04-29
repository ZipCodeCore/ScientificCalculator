import banuelos.aurora.MathEquations;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aurorabanuelos on 4/29/17.
 */
public class MathEquationsTest {

    @Test
    public void addTest() {
        // Given
        double firstOperand = 1.0;
        double secondOperand = 2.0;
        double expectedSum = firstOperand + secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualSum = equations.add(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedSum, actualSum, 0);
    }

    @Test
    public void addIfOneNumberNegativeTest() {
        // Given
        double firstOperand = -1.0, secondOperand = 2.0;
        double expectedSum = firstOperand + secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualSum = equations.add(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedSum, actualSum, 0);

    }

    @Test
    public void addIfBothNumbersNegativeTest() {
        // Given
        double firstOperand = -1.0, secondOperand = -2.0;
        double expectedSum = firstOperand + secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualSum = equations.add(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedSum, actualSum, 0);

    }

    @Test
    public void subtractTest() {
        //Given
        double firstOperand = 3.0, secondOperand = 1.0;
        double expectedSum = firstOperand - secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualSum = equations.subtract(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedSum, actualSum, 0);
    }

    @Test
    public void subtractGreaterTest() {
        //Given
        double firstOperand = 3.0, secondOperand = 8.0;
        double expectedSum = firstOperand - secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualSum = equations.subtract(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedSum, actualSum, 0);
    }

    @Test
    public void subtractNegativesTest() {
        //Given
        double firstOperand = -3.0, secondOperand = -8.0;
        double expectedSum = firstOperand - secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualSum = equations.subtract(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedSum, actualSum, 0);
    }

    @Test
    public void multiplyTest() {
        //Given
        double firstOperand = 3.0, secondOperand = 2.0;
        double expectedSum = firstOperand * secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualSum = equations.multiply(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedSum, actualSum, 0);
    }

    @Test
    public void multiplyNegativesTest() {
        //Given
        double firstOperand = -3.0, secondOperand = -2.0;
        double expectedSum = firstOperand * secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualSum = equations.multiply(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedSum, actualSum, 0);
    }

    @Test
    public void divideTest() {
        //Given
        double firstOperand = 6.0, secondOperand = 2.0;
        double expectedSum = firstOperand / secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualSum = equations.divide(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedSum, actualSum, 0);
    }

    @Test
    public void divideNegativesTest() {
        //Given
        double firstOperand = -6.0, secondOperand = -2.0;
        double expectedSum = firstOperand / secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualSum = equations.divide(firstOperand, secondOperand);

        //Then
        Assert.assertEquals(expectedSum, actualSum, 0);
    }

    @Test
    public void divideByZeroTest() {
        //Given
        double firstOperand = 6.0, secondOperand = 0.0;
        double expectedSum = firstOperand / secondOperand;
        MathEquations equations = new MathEquations();

        //When
        double actualSum = equations.divide(firstOperand, secondOperand);

        //Then
        Assert.assertTrue(Double.isNaN(actualSum));
    }
}
