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
        Double input = 5.0;

        ScientificCalculator testCalc = new ScientificCalculator();
        Double result = testCalc.sine(input);
        Double expected = -0.959;
        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void cosine() {
        Double input = 5.0;

        ScientificCalculator testCalc = new ScientificCalculator();
        Double result = testCalc.cosine(input);
        Double expected = 0.284;

        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void tangent() {
        Double input = 5.0;

        ScientificCalculator testCalc = new ScientificCalculator();
        Double result = testCalc.tangent(new Double(input));
        Double expected = -3.381;
        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void arcSine() {
        Double input = 0.5;

        ScientificCalculator testCalc = new ScientificCalculator();
        Double result = testCalc.arcSine(new Double(input));
        Double expected = 0.524;
        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void arcCos() {
        Double input = 0.5;

        ScientificCalculator testCalc = new ScientificCalculator();
        Double result = testCalc.arcCos(new Double(input));
        Double expected = 1.047;
        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void arcTan() {
        Double input = 0.5;


        ScientificCalculator testCalc = new ScientificCalculator();
        Double result = testCalc.arcTan(input);
        Double expected = 0.464;
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
        Double input = 5.0;

        ScientificCalculator testCalc = new ScientificCalculator();
        Double result = testCalc.log(input);
        Double expected = 0.699;
        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void invLog() {
        Double input = 5.0;

        ScientificCalculator testCalc = new ScientificCalculator();
        Double result = testCalc.invLog(input);
        Double expected = 100000.0;
        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void ln() {
        Double input = 5.0;

        ScientificCalculator testCalc = new ScientificCalculator();
        Double result = testCalc.ln(input);
        Double expected = 1.609;
        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void invLn() {
        Double input = 5.0;

        ScientificCalculator testCalc = new ScientificCalculator();
        Double result = testCalc.invLn(input);
        Double expected = 148.413;
        assertEquals( expected, result, 0.01 );
    }

    @Test
    public void factorial() {
        Double input = 5.0;

        ScientificCalculator testCalc = new ScientificCalculator();
        Double result = testCalc.factorial(input);
        Double expected = 120.0;
        assertEquals( expected, result, 0.01 );

    }
}
>>>>>>> ec9fa74777f3c3416d706487f65f68e1a04b20e9
