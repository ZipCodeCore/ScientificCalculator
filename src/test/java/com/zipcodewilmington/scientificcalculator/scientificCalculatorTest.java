<<<<<<< HEAD
//package com.zipcodewilmington.scientificcalculator;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class scientificCalculatorTest extends Calculator {
//
//    @Test
//    public void switchDisplayMode() {
//    }
//
//    @Test
//    public void switchDisplayMode1() {
//    }
//
//    @Test
//    public void saveNumber() {
//    }
//
//    @Test
//    public void sine() {
//        Double input = 5.0;
//
//        scientificCalculator testCalc = new scientificCalculator();
//        Double result = testCalc.sine(input);
//        Double expected = -0.959;
//        assertEquals( expected, result, 0.01 );
//    }
//
//    @Test
//    public void cosine() {
//        Double input = 5.0;
//
//        scientificCalculator testCalc = new scientificCalculator();
//        Double result = testCalc.cosine(input);
//        Double expected = 0.284;
//
//        assertEquals( expected, result, 0.01 );
//    }
//
//    @Test
//    public void tangent() {
//        Double input = 5.0;
//
//        scientificCalculator testCalc = new scientificCalculator();
//        Double result = testCalc.tangent(new Double(input));
//        Double expected = -3.381;
//        assertEquals( expected, result, 0.01 );
//    }
//
//    @Test
//    public void arcSine() {
//        Double input = 0.5;
//
//        scientificCalculator testCalc = new scientificCalculator();
//        Double result = testCalc.arcSine(new Double(input));
//        Double expected = 0.524;
//        assertEquals( expected, result, 0.01 );
//    }
//
//    @Test
//    public void arcCos() {
//        Double input = 0.5;
//
//        scientificCalculator testCalc = new scientificCalculator();
//        Double result = testCalc.arcCos(new Double(input));
//        Double expected = 1.047;
//        assertEquals( expected, result, 0.01 );
//    }
//
//    @Test
//    public void arcTan() {
//        Double input = 0.5;
//
//
//        scientificCalculator testCalc = new scientificCalculator();
//        Double result = testCalc.arcTan(input);
//        Double expected = 0.464;
//        assertEquals( expected, result, 0.01 );
//    }
//
//    @Test
//    public void switchUnitsMode() {
//    }
//
//    @Test
//    public void switchUnitesMode() {
//    }
//
//    @Test
//    public void log() {
//        Double input = 5.0;
//
//        scientificCalculator testCalc = new scientificCalculator();
//        Double result = testCalc.log(input);
//        Double expected = 0.699;
//        assertEquals( expected, result, 0.01 );
//    }
//
//    @Test
//    public void invLog() {
//        Double input = 5.0;
//
//        scientificCalculator testCalc = new scientificCalculator();
//        Double result = testCalc.invLog(input);
//        Double expected = 100000.0;
//        assertEquals( expected, result, 0.01 );
//    }
//
//    @Test
//    public void ln() {
//        Double input = 5.0;
//
//        scientificCalculator testCalc = new scientificCalculator();
//        Double result = testCalc.ln(input);
//        Double expected = 1.609;
//        assertEquals( expected, result, 0.01 );
//    }
//
//    @Test
//    public void invLn() {
//        Double input = 5.0;
//
//        scientificCalculator testCalc = new scientificCalculator();
//        Double result = testCalc.invLn(input);
//        Double expected = 148.413;
//        assertEquals( expected, result, 0.01 );
//    }
//
//    @Test
//    public void factorial() {
//        Double input = 5.0;
//
//        scientificCalculator testCalc = new scientificCalculator();
//        Double result = testCalc.factorial(input);
//        Double expected = 120.0;
//        assertEquals( expected, result, 0.01 );
//
//    }
//}
=======
package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class scientificCalculatorTest extends Calculator {

    @Test
    public void switchDisplayMode() {
    }

    @Test
    public void switchDisplayMode1() {
    }

    @Test
    public void saveNumber() {
    }

    @Test
    public void sine() {

        Double a = 5.0;
        ScientificCalculator c = new ScientificCalculator();

        c.sine(a);
        Double result = c.getCurrentNumber();
        Double expected = -0.959;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void sine2() {

        Double a = 30.0;
        ScientificCalculator c = new ScientificCalculator();

        c.sine(a);
        Double result = c.getCurrentNumber();
        Double expected = -0.988;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void cosine() {
        Double a = 5.0;

        ScientificCalculator c = new ScientificCalculator();
        c.cosine(a);
        Double result = c.getCurrentNumber();
        Double expected = 0.284;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void cosine2() {
        Double a = 55.0;

        ScientificCalculator c = new ScientificCalculator();
        c.cosine(a);
        Double result = c.getCurrentNumber();
        Double expected = 0.022;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void tangent() {
        Double a = 5.0;

        ScientificCalculator c = new ScientificCalculator();
        c.tangent(a);
        Double result = c.getCurrentNumber();
        Double expected = -3.381;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void tangent2() {
        Double a = 45.0;

        ScientificCalculator c = new ScientificCalculator();
        c.tangent(a);
        Double result = c.getCurrentNumber();
        Double expected = 1.619;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void arcSine() {
        Double a = 0.5;

        ScientificCalculator c = new ScientificCalculator();
        c.arcSine(a);
        Double result = c.getCurrentNumber();
        Double expected = 0.523;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void arcSine2() {
        Double a = 0.3;

        ScientificCalculator c = new ScientificCalculator();
        c.arcSine(a);
        Double result = c.getCurrentNumber();
        Double expected = 0.304;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void arcCos() {
        Double a = 0.5;

        ScientificCalculator c = new ScientificCalculator();
        c.arcCos(a);
        Double result = c.getCurrentNumber();
        Double expected = 1.047;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void arcCos2() {
        Double a = 0.8;

        ScientificCalculator c = new ScientificCalculator();
        c.arcCos(a);
        Double result = c.getCurrentNumber();
        Double expected = 0.643;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void arcTan() {
        Double a = 0.5;

        ScientificCalculator c = new ScientificCalculator();
        c.arcTan(a);
        Double result = c.getCurrentNumber();
        Double expected = 0.464;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void arcTan2() {
        Double a = 0.4;

        ScientificCalculator c = new ScientificCalculator();
        c.arcTan(a);
        Double result = c.getCurrentNumber();
        Double expected = .380;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void switchUnitsMode() {
    }

    @Test
    public void switchUnitesMode() {
    }

    @Test
    public void log() {
        Double a = 5.0;

        ScientificCalculator c = new ScientificCalculator();
        c.log(a);
        Double result = c.getCurrentNumber();
        Double expected = 0.698;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void log2() {
        Double a = 7.0;

        ScientificCalculator c = new ScientificCalculator();
        c.log(a);
        Double result = c.getCurrentNumber();
        Double expected = 0.845;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void invLog() {
        Double a = 5.0;

        ScientificCalculator c = new ScientificCalculator();
        c.invLog(a);
        Double result = c.getCurrentNumber();
        Double expected = 100000.0;
        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void invLog2() {
        Double a = 2.0;

        ScientificCalculator c = new ScientificCalculator();
        c.invLog(a);
        Double result = c.getCurrentNumber();
        Double expected = 100.0;
        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void ln() {
        Double a = 5.0;

        ScientificCalculator c = new ScientificCalculator();
        c.ln(a);
        Double result = c.getCurrentNumber();
        Double expected = 1.609;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void ln2() {
        Double a = 3.0;

        ScientificCalculator c = new ScientificCalculator();
        c.ln(a);
        Double result = c.getCurrentNumber();
        Double expected = 1.098;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void invLn() {
        Double a = 5.0;

        ScientificCalculator c = new ScientificCalculator();
        c.invLn(a);
        Double result = c.getCurrentNumber();
        Double expected = 148.413;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void invLn2() {
        Double a = 7.0;

        ScientificCalculator c = new ScientificCalculator();
        c.invLn(a);
        Double result = c.getCurrentNumber();
        Double expected = 1096.633;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void factorial() {
        Double a = 5.0;

        ScientificCalculator c = new ScientificCalculator();
        c.factorial(a);
        Double result = c.getCurrentNumber();
        Double expected = 120.0;

        assertEquals( expected, result, 0.01 );

    }

    @Test
    public void factorial2() {
        Double a = 4.0;

        ScientificCalculator c = new ScientificCalculator();
        c.factorial(a);
        Double result = c.getCurrentNumber();
        Double expected = 24.0;

        assertEquals( expected, result, 0.01 );

    }
}
>>>>>>> ec9fa74777f3c3416d706487f65f68e1a04b20e9
