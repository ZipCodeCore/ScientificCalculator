package lindsay.devon.CalculatorTest;


import lindsay.devon.Calculator.BasicCalculations;
import lindsay.devon.Calculator.LogarithmicCalculations;
import lindsay.devon.Calculator.TrigCalculations;
import lindsay.devon.Calculator.UserInterfaceMenus;
import org.junit.*;

/**
 * Created by devonlindsay on 9/13/16.
 */
public class calculatorTest {


    UserInterfaceMenus userTest;
    BasicCalculations mathTest;
    TrigCalculations trigTest;
    LogarithmicCalculations logTest;
 @Before

    public void myMethod() {
     mathTest = new BasicCalculations();
     trigTest = new TrigCalculations();
     logTest = new LogarithmicCalculations();
 }

@Test
    public void addTest() {Assert.assertEquals(55,mathTest.add(50,5),1);}
@Test
    public void subtractTest() {Assert.assertEquals(45,mathTest.subtract(50,5),1);}
@Test
    public void multiplyTest() {Assert.assertEquals(250,mathTest.multiply(50,5),1);}
@Test
    public void divideTest() {Assert.assertEquals(10,mathTest.divide(50,5),1);}
@Test
    public void squareTest(){Assert.assertEquals(25,mathTest.square(5),1); }
@Test
    public void sqrtTest() {Assert.assertEquals(3,mathTest.squareRoot(9),1);}
@Test
    public void exponentTest () {Assert.assertEquals((Math.pow(3,2)), (mathTest.exponent(3,2)),1);}
@Test
    public void inverseTest() {Assert.assertEquals(1/19, mathTest.inverse(19),1);}
@Test
    public void switchSignTest() {Assert.assertEquals(-1, mathTest.switchSign(1),1);}
@Test
    public void factorialTest() {Assert.assertEquals(15, mathTest.factorial(5),1);}

//////TRIG TESTS//////////
@Test
    public void sineTest() {Assert.assertEquals((Math.sin(100)),(trigTest.sine(100)),1);}
@Test
    public void cosineTest() {Assert.assertEquals((Math.cos(100)), (trigTest.cosine(100)),1);}
@Test
    public void tangentTest() {Assert.assertEquals((Math.tan(100)),(trigTest.tangent(100)),1);}
@Test
    public void inverseSineTest () {Assert.assertEquals((Math.sinh(100)), (trigTest.inverseSine(100)), 1);}
@Test
    public void inverseCosineTest () {Assert.assertEquals((Math.cosh(100)), (trigTest.inverseCosine(100)),1);}
@Test
    public void inverseTangentTest () {Assert.assertEquals((Math.tanh(100)), (trigTest.inverseTangent(100)),1);}


//////LOG TESTS///////////
@Test
    public void logLogTest() {Assert.assertEquals((Math.log10(100)),(logTest.log(100)),1);}
@Test
    public void log10Test()  {Assert.assertEquals(((Math.pow(Math.E,Math.log10(100)))),(logTest.log10x(100)),1);}
@Test
    public void logNaturalTest() {Assert.assertEquals((Math.log(100)), (logTest.logln(100)),1);}
@Test
    public void logExTest() {Assert.assertEquals((Math.pow(Math.E,Math.log(100))), (logTest.logEx(100)),1);}




}






