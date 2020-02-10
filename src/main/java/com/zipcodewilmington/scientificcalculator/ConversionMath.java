package com.zipcodewilmington.scientificcalculator;

public class ConversionMath {

    public static Double feetToMeters (Double numberOne) {
        return numberOne / 3.2810;
    }
    public static Double metersToFeet (Double numberOne) {
        return  numberOne *  3.28084;
    }
    public static Double poundsToKilos(Double numberOne) {
        return  numberOne / 2.205;
    }
    public static Double kilosToPounds(Double numberOne) {
        return numberOne * 2.205;
    }
    public static Double fahrenheitToCelsius (Double numberOne) {
        return ((numberOne - 32) * 5 / 9);
    }
    public static Double celsiusToFahrenheit (Double numberOne) {
            return ((numberOne * 9 / 5) + 32);
        }


}


