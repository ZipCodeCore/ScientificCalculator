
package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    @Test
    public void test1()
    {
        Calculator c1 = new Calculator();
        assertEquals(55.0 ,c1.add(10.0, 45.0), 0.01);
    }
    @Test
    public void test2()
    {
        Calculator c1 = new Calculator();
        assertEquals(10.0 ,c1.subtract(55.0, 45.0), 0.01);
    }
    @Test
    public void test3()
    {
        Calculator c1 = new Calculator();
        assertEquals(50.0 ,c1.multiply(10.0, 5.0), 0.01);
    }
    @Test
    public void test4()
    {
        Calculator c1 = new Calculator();
        assertEquals(2.0, c1.divide(10.0, 5.0), 0.01);
    }
    @Test
    public void test5()
    {
        Calculator c1 = new Calculator();
        assertEquals(25.0, c1.square( 5.0), 0.01);
    }
    @Test
    public void test6() {
        Calculator c1 = new Calculator();
        assertEquals(5.0, c1.squareRoot(25.0), 0.01);
    }
    @Test
    public void test7() {
        Calculator c1 = new Calculator();
        assertEquals(32.0, c1.exponent(2.0, 5.0), 0.01);
    }
    @Test
    public void test8() {
        Calculator c1 = new Calculator();
        assertEquals(0.01, c1.inverse(100.0), 0.01);
    }
    @Test
    public void test9() {
        Calculator c1 = new Calculator();
        assertEquals(-7.0, c1.signSwitch(7.0), 0.01);
    }
    @Test
    public void test10() {
        Calculator c1 = new Calculator();
        assertEquals(-0.98, c1.sin(30.0), 0.01);
    }

    @Test
    public void test11() {
        Calculator c1 = new Calculator();
        assertEquals(0.154, c1.cos(30.0), 0.01);
    }

    @Test
    public void test12() {
        Calculator c1 = new Calculator();
        assertEquals(-1.995, c1.tangent(90.0), 0.01);
    }

    @Test
    public void test13() {
        Calculator c1 = new Calculator();
        assertEquals(1.57, c1.InverseSin(1.0), 0.01);
    }
    @Test
    public void test14() {
        Calculator c1 = new Calculator();
        assertEquals(0.98, c1.InverseCos(30.0), 0.01);
    }
    @Test
    public void test15() {
        Calculator c1 = new Calculator();
        assertEquals(0.98, c1.InverseTangent(30.0), 0.01);
    }
    @Test
    public void test16() {
        Calculator c1 = new Calculator();
        assertEquals(4.499, c1.log(90.0), 0.01);
    }
    @Test
    public void test17() {
        Calculator c1 = new Calculator();
        assertEquals(0.301, c1.log10X(2.0), 0.01);
    }
    @Test
    public void test18() {
        Calculator c1 = new Calculator();
        assertEquals(100.00, c1.invLog(2.0), 0.01);
    }
    @Test
    public void test19() {
        Calculator c1 = new Calculator();
        assertEquals(148.41, c1.invNatLog(5.0), 0.01);
    }
    @Test
    public void test20() {
        Calculator c1 = new Calculator();
        assertEquals(720, c1.factorial(6), 0.01);
    }
    @Test
    public void test21() {
        Calculator c1 = new Calculator();
        assertEquals("ff", c1.DecimalToOther(255, 16));
    }
    @Test
    public void test22() {
        Calculator c1 = new Calculator();
        assertEquals("10", c1.DecimalToOther(2, 2));
    }
    @Test
    public void test23() {
        Calculator c1 = new Calculator();
        assertEquals(3.14, c1.toRadians(180), 0.01);
    }
    @Test
    public void test24() {
        Calculator c1 = new Calculator();
        assertEquals(180.00, c1.toDegrees(Math.PI), 0.001);
    }

}
