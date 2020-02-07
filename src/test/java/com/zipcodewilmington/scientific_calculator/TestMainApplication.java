package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CoreFunctions;
import org.junit.Test;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    CoreFunctions mathTests = new CoreFunctions();
}
@Test
public class adderTest{

    int assumed = 3;
    int actual = mathTests.add();
    assertEquals( assumed, actual);
}