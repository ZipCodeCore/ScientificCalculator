package com.zipcodewilmington.scientificcalculator;

public class Utilities {
    public static double switchFtoC(double a) {
        double far2cel = ((a - 32) / 1.8);
        return far2cel;
        }

    public static double switchCtoF(double a){
        double cel2far = (a * 1.8) + 32;
        return cel2far;
        }

    public static double switchFtoK(double a){
        double far2kel = (a - 32) / 1.8 + 273;
        return far2kel;
        }

    public static double switchKtoF(double a){
        double kel2far = (a - 273) * 1.8 + 32;
        return kel2far;
        }

    public static double switchCtoK(double a){
        double cel2kel = a + 273;
        return cel2kel;
        }

    public static double switchKtoC(double a){
        double kel2cel = a - 273;
        return kel2cel;
        }
}
