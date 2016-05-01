package io.brianabbott;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by brianabbott on 4/30/16.
 */
public class CalculatorSpec {

    @Test
    public void sumTest(){
        Calculator sumTester = new Calculator();
        double expectedValue = 10.5;
        double actualValue = sumTester.sum(5.5,5);
        Assert.assertEquals("The sum method does not add the two arguments",expectedValue,actualValue,0);
    }

    @Test
    public void subtractTest(){
        Calculator subtractTester = new Calculator();
        double expectedValue = 4.4;
        double actualValue = subtractTester.subtract(10,5.6);
        Assert.assertEquals("10 minus 5.6 should equal 4.4",expectedValue,actualValue,0);
    }

    @Test
    public void multiplyTest(){
        Calculator multiplyTester = new Calculator();
        double expectedValue = 12.5;
        double actualValue = multiplyTester.multiply(6.25,2);
        Assert.assertEquals("6.25 times 2 should equal 12.5",expectedValue,actualValue,0);
    }

    @Test
    public void divideTest(){
        Calculator divideTester = new Calculator();
        double expectedValue = 24;
        double actualValue = divideTester.divide(48,2);
        Assert.assertEquals("48 divided by two should equal 24",expectedValue,actualValue,0);
    }

    @Test
    public void squareTest(){
        Calculator squareTester = new Calculator();
        double expectedValue = 225;
        double actualValue = squareTester.square(15);
        Assert.assertEquals("15 squared equal 225",expectedValue,actualValue,0);
    }

    @Test
    public void squareRootTest(){
        Calculator squareRootTester = new Calculator();
        double expectedValue = 8;
        double actualValue = squareRootTester.squareRoot(64);
        Assert.assertEquals("The square root of 16 is 4",expectedValue,actualValue,.00000000001);
    }

    @Test
    public void exponentTest(){
        Calculator exponentTester = new Calculator();
        double expectedValue = 1024;
        double actualValue = exponentTester.exponent(4,5);
        Assert.assertEquals("4^5 should equal is 1024",expectedValue,actualValue,0);
    }

    @Test
    public void inverseTest(){
        Calculator inverseTester = new Calculator();
        double expectedValue = .2;
        double actualValue = inverseTester.inverse(5);
        Assert.assertEquals("The inverse of 5 should be 1/5",expectedValue,actualValue,0);
    }

    @Test
    public void invertSignTest(){
        Calculator invertSignTester = new Calculator();
        double expectedValue = -5;
        double actualValue = invertSignTester.invertSign(5);
        Assert.assertEquals("Positive 5 should be converted to negative 5",expectedValue,actualValue,0);
    }

    @Test
    public void factorialTest(){
        Calculator factorialTester = new Calculator();
        double expectedValue = 720;
        double actualValue = factorialTester.factorial(6);
        Assert.assertEquals("The factorial of 6 should be 720",expectedValue,actualValue,0);
    }

    @Test
    public void timesPiTest(){
        Calculator timesPiTester = new Calculator();
        double expectedValue = 12.5663706143591;
        double actualValue = timesPiTester.timesPi(4);
        Assert.assertEquals("PI times 4 should be 12.5663706143591",expectedValue,actualValue,.00000001);
    }

    @Test
    public void convertToRadiansTest(){
        Calculator convertToRadiansTester = new Calculator();
        double expectedValue = 0.401426;
        double actualValue = convertToRadiansTester.convertToRadians(23);
        Assert.assertEquals("Converting 23 degrees to radians should be .401426",expectedValue,actualValue,.000001);
    }

    @Test
    public void convertToDegreesTest(){
        Calculator convertToDegreesTester = new Calculator();
        double expectedValue = 23.00001;
        double actualValue = convertToDegreesTester.convertToDegrees(.401426);
        Assert.assertEquals("Converting .401426 radians to degrees should be 23 ",expectedValue,actualValue,.0001);
    }

    @Test
    public void sineIfDegreesTest(){
        Calculator sineDegTester = new Calculator();
        double expectedValue = .98480775301;
        sineDegTester.unitsMode = MathTerms.DEGREES;
        double actualValue = sineDegTester.sine(80);
        Assert.assertEquals("Sin 90(Degrees) should equal 1",expectedValue,actualValue,.00000001);
    }

    @Test
    public void sineIfRadiansTest(){
        Calculator sineRadTester = new Calculator();
        double expectedValue = -.99388865392;
        sineRadTester.unitsMode = MathTerms.RADIANS;
        double actualValue = sineRadTester.sine(80);
        Assert.assertEquals("Sin 80 (Radians) should equal .99388865392",expectedValue,actualValue,.00000001);
    }

    @Test
    public void cosineIfDegreesTest(){
        Calculator cosineDegTester = new Calculator();
        double expectedValue = .64278760968;
        cosineDegTester.unitsMode = MathTerms.DEGREES;
        double actualValue = cosineDegTester.cosine(50);
        Assert.assertEquals("Cosine 50(Degrees) should equal .62478760968",expectedValue,actualValue,.00000001);
    }

    @Test
    public void cosineIfRadiansTest(){
        Calculator cosineRadTester = new Calculator();
        double expectedValue = .96496602849;
        cosineRadTester.unitsMode = MathTerms.RADIANS;
        double actualValue = cosineRadTester.cosine(50);
        Assert.assertEquals("Cosine 50 (Radians) should equal .96496602849",expectedValue,actualValue,.00000001);
    }

    @Test
    public void tangentIfDegreesTest(){
        Calculator tangentDegTester = new Calculator();
        double expectedValue = 1.42814800674;
        tangentDegTester.unitsMode = MathTerms.DEGREES;
        double actualValue = tangentDegTester.tangent(55);
        Assert.assertEquals("Tangent 55(Degrees) should equal -45.1830879105",expectedValue,actualValue,.00000001);
    }

    @Test
    public void tangentIfRadiansTest(){
        Calculator tangentRadTester = new Calculator();
        double expectedValue = -45.1830879105;
        tangentRadTester.unitsMode = MathTerms.RADIANS;
        double actualValue = tangentRadTester.tangent(55);
        Assert.assertEquals("Tangent 55(Radians) should equal 1.42814800674",expectedValue,actualValue,.00000001);
    }

    @Test
    public void inverseSineIfDegreesTest(){
        Calculator inverseSineDegTester = new Calculator();
        double expectedValue = 30;
        inverseSineDegTester.unitsMode = MathTerms.DEGREES;
        double actualValue = inverseSineDegTester.inverseSine(.5);
        Assert.assertEquals("Inverse Sine (.5) (Degrees) should equal 30",expectedValue,actualValue,.00000001);
    }

    @Test
    public void inverseSineIfRadiansTest(){
        Calculator inverseSineRadTester = new Calculator();
        double expectedValue = .60650585521;
        inverseSineRadTester.unitsMode = MathTerms.RADIANS;
        double actualValue = inverseSineRadTester.inverseSine(.57);
        Assert.assertEquals("Inverse Sine (55) (Radians) should equal .60650585521",expectedValue,actualValue,.00000001);
    }

    @Test
    public void inverseCosineIfRadiansTest(){
        Calculator inverseCosineRadTester = new Calculator();
        double expectedValue = 1.15927948073;
        inverseCosineRadTester.unitsMode = MathTerms.RADIANS;
        double actualValue = inverseCosineRadTester.inverseCosine(.4);
        Assert.assertEquals("Inverse cosine (.4) (Radians) should equal 1.15927948073",expectedValue,actualValue,.00000001);
    }

    @Test
    public void inverseCosineIfDegreesTest(){
        Calculator inverseCosineDegTester = new Calculator();
        double expectedValue = 60;
        inverseCosineDegTester.unitsMode = MathTerms.DEGREES;
        double actualValue = inverseCosineDegTester.inverseCosine(.5);
        Assert.assertEquals("Inverse Cosine (.5) (Degrees) should equal 60",expectedValue,actualValue,.00000001);
    }

    @Test
    public void inverseTangentIfRadiansTest(){
        Calculator inverseTangentRadTester = new Calculator();
        double expectedValue = .463647609;
        inverseTangentRadTester.unitsMode = MathTerms.RADIANS;
        double actualValue = inverseTangentRadTester.inverseTangent(.5);
        Assert.assertEquals("Inverse cosine (.4) (Radians) should equal 1.15927948073",expectedValue,actualValue,.00000001);
    }

    @Test
    public void inverseTangentIfDegreesTest(){
        Calculator inverseTangentDegTester = new Calculator();
        double expectedValue = 26.5650511771;
        inverseTangentDegTester.unitsMode = MathTerms.DEGREES;
        double actualValue = inverseTangentDegTester.inverseTangent(.5);
        Assert.assertEquals("Inverse Cosine (.5) (Degrees) should equal 60",expectedValue,actualValue,.00000001);
    }

    @Test
    public void logTest(){
        Calculator logTester = new Calculator();
        double expectedValue = 3;
        double actualValue = logTester.log(1000);
        Assert.assertEquals("Log(1000) should equal 3",expectedValue,actualValue,.00000001);
    }

    @Test
    public void inverseLogTest(){
        Calculator inverseLogTester = new Calculator();
        double expectedValue = 100;
        double actualValue = inverseLogTester.inverseLog(2);
        Assert.assertEquals("Inverse Log(2) should equal 100",expectedValue,actualValue,.00000001);
    }

    @Test
    public void naturalLogTest(){
        Calculator naturalLogTester = new Calculator();
        double expectedValue = 6.90775527898;
        double actualValue = naturalLogTester.naturalLog(1000);
        Assert.assertEquals("Log(1000) should equal 6.90775527898",expectedValue,actualValue,.00000001);
    }

    @Test
    public void inverseNaturalLogTest(){
        Calculator inverseNaturalLogTester = new Calculator();
        double expectedValue = 54.598150031;
        double actualValue = inverseNaturalLogTester.inverseNaturalLog(4);
        Assert.assertEquals("e^4 should equal 54.598150031",expectedValue,actualValue,.00000001);
    }

    @Test
    public void switchModeByArgTest(){
        Calculator switchModeByArgTester = new Calculator();
        MathTerms expectedValue = MathTerms.DEGREES;
        switchModeByArgTester.switchUnitsMode(MathTerms.DEGREES);
        MathTerms actualValue = switchModeByArgTester.unitsMode;
        Assert.assertEquals("The unit mode should have been switched to degrees",expectedValue,actualValue);
    }

    @Test
    public void switchModeByRotateTest(){
        Calculator switchModeByRotateTester = new Calculator();
        MathTerms expectedValue = MathTerms.DEGREES;
        switchModeByRotateTester.switchUnitsMode();
        MathTerms actualValue = switchModeByRotateTester.unitsMode;
        Assert.assertEquals("The unit mode should have been switched to degrees",expectedValue,actualValue);
    }
}

