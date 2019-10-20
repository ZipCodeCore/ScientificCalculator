package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicCalculator;
import com.zipcodewilmington.scientificcalculator.ScientificCalculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static junit.framework.TestCase.assertEquals;

public class ScientificCalcTests {

    private ScientificCalculator sCalc;

    @Before
    public void setup(){
        sCalc = new ScientificCalculator();
    }
}
