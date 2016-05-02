package io.minlee;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by minlee on 4/29/16.
 */
public class scientificCalculatorTest {

    ScientificCalculator calc;
    double delta = 1e-15; //Variable to compare two doubles are close enough

    @Before
    public void initialize(){
        calc = new ScientificCalculator();
    }
    @Test
    public void calculateSumTest(){
        double expectedValue = .6;
        double actualValue = calc.calculateSum(.1,.5);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }

    @Test
    public void calculateSubtractionTest(){
        double expectedValue = -.4;
        double actualValue = calc.calculateSubtraction(.1,.5);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }

    @Test
    public void calculateMultiplication(){
        double expectedValue = .05;
        double actualVaule = calc.calculateMultiplication(.1,.5);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualVaule,delta);
    }

    @Test
    public void calculateDivisionTest(){
        double expectedVaule = .2;
        double actualVaule = calc.calculateDivision(.4,2);
        Assert.assertEquals("Expected value should be "+expectedVaule,expectedVaule,actualVaule,delta);
    }

    @Test
    public void calculateSquareTest(){
        double expectedValue = 9;
        double actualValue = calc.calculateSquare(3);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }

    @Test
    public void calculateSquareRootTest(){
        double expectedValue = 3;
        double actualValue = calc.calculateSquareRoot(9);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void calculateVariaableExponentiation(){
        double expectedValue = 4;
        double actualValue = calc.calculateVariaableExponentiation(2,2);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void calculateInverseTest(){
        double expectedValue = .25;
        double actualValue = calc.calculateInverse(4);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }

    @Test
    public void calculateInvertTest(){
        double expectedValue = .25;
        double actualValue = calc.calculateInvert(-.25);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }

    @Test
    public void calculateLogTest(){
        double expectedValue = 1;
        double actualValue = calc.calculateLog(10);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }

    @Test
    public void calculateInverseLogTest(){
        double expectedValue = 100;
        double actualValue = calc.calculateInverseLog(2);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }

    @Test
    public void calulateNaturalLogTest(){
        double expectedValue = 0;
        double actualValue = calc.calculateNaturalLog(1);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }

    @Test
    public void calulateInverseNaturalLogTest(){
        double expectedValue = Math.E;
        double actualValue = calc.calculateInverseNaturalLog(1);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }

    @Test
    public void calculateFactorialTest(){
        double expectedValue = 24.0;
        double actualValue = calc.calculateFactorial(4.0);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void calculateSineTest(){
        double expectedValue = 0;
        double actualValue = calc.calculateSine(Math.PI);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void calculateCosineTest(){
        double expectedValue = -1.0;
        double actualValue = calc.calculateCosine(Math.PI);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void calculateTangentTest(){
        double expectedValue = 0;
        double actualValue = calc.calculateTangent(Math.PI);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void calculateInverseSineTest(){
        double expectedValue = Math.PI/2;
        double actualValue = calc.calculateInverseSine(1);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void calculateInverseCosineTest(){
        double expectedValue = 0;
        double actualValue = calc.calculateInverseCosine(1);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void calculateInverseTangentTest(){
        double expectedValue = Math.PI/4;
        double actualValue = calc.calculateInverseTangent(1);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }

    @Test
    public void calculateRoundToNearestIntegerTest(){
        int expectedValue = 5;
        int actualValue = calc.calculateRoundToNearestInteger(4.9);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void setIsInRadiansTest(){
        boolean expectedValue = true;
        calc.setIsInRadians(true);
        boolean actualValue = calc.getIsInRadians();
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue);
    }
    @Test
    public void convertDegreesToRadiansTest(){
        double expectedValue = Math.PI/2;
        double actualValue = calc.convertDegreesToRadians(90);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void convertRadiansToDegreesTest(){
        double expectedValue = 180;
        double actualValue = calc.convertRadiansToDegrees(Math.PI);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
    @Test
    public void calculateCompoundInterestTest(){
        double expectedValue = 12762.82;
        double actualValue = calc.calculateCompoundInterest(10000,5,5);
        Assert.assertEquals("Expected value should be "+expectedValue,expectedValue,actualValue,delta);
    }
}
