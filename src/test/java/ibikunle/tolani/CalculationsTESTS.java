package ibikunle.tolani;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by tolaniibikunle on 1/15/17.
 */
public class CalculationsTESTS {
    Calculations calc = new Calculations();

    @Test
    public void addCalculationTEST() {
        double actual = calc.addValue(7, 6);
        double expected = 13;
        assertEquals("Expected 13", actual, expected);
    }

    @Test
    public void subtractCalculationTEST() {
        double actual = calc.subtractValue(7, 2);
        double expected = 5;
        Assert.assertEquals("Expected 5", actual, expected);
    }

    @Test
    public void multiplyCalculationTEST() {
        double actual = calc.multiplyValue(6, 7);
        double expected = 42;
        assertEquals("Expected 42", actual, expected);
    }

    @Test
    public void divisionCalculationTEST() {
        double actual = calc.divideValue(10, 5);
        double expected = 2;
        assertEquals("Expected 2", actual, expected);
    }

    @Test
    public void squareCalculationTEST() {
        double actual = calc.calculateSquareValue(7);
        double expected = 49;
        assertEquals("Expected 49", actual, expected);
    }

    @Test
    public void squareRootCalculationTEST() {
        double actual = calc.calculateSquareRootValue(16);
        double expected = 4;
        assertEquals("Expected 4", actual, expected);
    }

    @Test
    public void calculateExponentValueTEST() {
        double actual = calc.calculateExponentValue(3, 4);
        double expected = 81;
        assertEquals("Expected 81", actual, expected);
    }

    @Test
    public void inverseValueTEST() {
        double actual = calc.inverseValue(7);
        double expected = 0.14285714285714285;
        assertEquals("Expected 14285714285714285", actual, expected);
    }

    @Test
    public void sinValueTEST() {
        double actual = calc.sinValue(45);
        double expected = 0.8509035245341184;
        assertEquals("Expected 8509035245341184", actual, expected);
    }

    @Test
    public void inverseSinValueTEST() {
        double actual = calc.inverseSinValue(.5);
        double expected = 0.5235987755982989;
        assertEquals("Expected 0.5235987755982989", actual, expected);
    }

    @Test
    public void cosineValueTEST() {
        double actual = calc.cosineValue(5);
        double expected = 0.28366218546322625;
        assertEquals("Expected 28366218546322625", actual, expected);
    }

    @Test
    public void cosineInverseValueTEST() {
        double actual = calc.cosineInverseValue(.2);
        double expected = 1.369438406004566;
        assertEquals("Expeceted 1.369438406004566", actual, expected);
    }

    @Test
    public void tangentValueTeST() {
        double actual = calc.tangentValue(.6);
        double expected = 0.6841368083416923;
        assertEquals("Expected 0.6841368083416923", actual, expected);

    }
    @Test
    public void inverseTangentValueTEST(){
        double actual = calc.inverseTangentValue(8);
        double expected = 1.446441332248135;
        assertEquals(" Expected 1.446441332248135",actual,expected);
    }
    @Test
    public void calculateTheNaturalLogValueTEST(){
        double actual = calc.calculateTheNaturalLogValue(7);
        double expected = 1.9459101490553132;
        assertEquals("Expected 1.9459101490553132",actual, expected);
    }
    @Test
    public void calculateLogOfValueTEST(){
        double actual = calc.calculateLogOfValue(10);
        double expected = 1;
        assertEquals(" Expected 1",actual,expected);
    }
    @Test
    public void clearNumberOnDisplayTEST(){
        double actual = calc.clearNumberOnDisplay();
        double expected = 0;
        assertEquals("Expected 0",actual, expected);
    }
    @Test
    public void calculateFactorialValueTEST(){
        double actual = calc.calculateFactorialValue(7);
        double expected = 42;
        assertEquals("Expected 42",actual,expected);
    }
    @Test
    public void calculateInverseNaturalLogTEST(){
        double actual = calc.calculateInverseNaturalLog(1);
        double expected = 2.718281828459045;
        assertEquals("Expected 2.718281828459045",actual, expected);
    }
    @Test
    public void volumeOfASphereTEST(){
        double actual = calc.volumeOfASphere(5);
        double expected = 392.6990816987241;
        assertEquals("expected 392.6990816987241",actual,expected);
    }
    @Test
    public void volumeOfACylinderTEST(){
        double actual = calc.volumeOfACylinder(7,6);
        double expected = 923.6282401553991;
        assertEquals("Expected 923.6282401553991",actual,expected);
    }
}