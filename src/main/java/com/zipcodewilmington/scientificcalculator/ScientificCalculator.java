package com.zipcodewilmington.scientificcalculator;

import javax.xml.transform.Result;
import java.sql.ResultSet;


public class ScientificCalculator extends Calculator {

    public Boolean resultInRadians = true;

//    public String switchDisplayMode() {
//        String[] displayModes = {"d", "h", "o", "b"};
//        //toggle something
//        return;
//    }

    public static String switchDisplayMode(String currentDisplayMode, Double x) {
        String displayNum;
        switch (currentDisplayMode) {
            case "b":
                displayNum = Long.toBinaryString(Double.doubleToRawLongBits(x));
                break;
            case "o":
                displayNum = Long.toOctalString(Double.doubleToRawLongBits(x));
                break;
            case "h":
                displayNum = Long.toHexString(Double.doubleToRawLongBits(x));
                break;
            case "d":
                displayNum = String.valueOf(x);
                break;
            default:
                displayNum = "That is not a valid display mode!";
                break;

        }
        return displayNum;
    }



    public Double roundDecTen (Double num) {
        Double result = Double.parseDouble(String.format("%.6f %n", num));
        return result;
    }


    //Switch between radians and degrees which is handled in each method.
//


     public Double sine(Double x){
        if(resultInRadians) {
           return roundDecTen(Math.sin(x));
        }

         return roundDecTen(Math.toDegrees(Math.sin(x)));
     }
     public Double cosine(Double x){
         if(resultInRadians) {
             return roundDecTen(Math.cos(x));
         }

         return roundDecTen(Math.toDegrees(Math.cos(x)));
     }
     public Double tangent(Double x){
         if(resultInRadians) {
             return roundDecTen(Math.tan(x));
         }

         return roundDecTen(Math.toDegrees(Math.tan(x)));
     }

     public Double arcSine(Double x){
         if(resultInRadians) {
             return roundDecTen(Math.asin(x));
         }
         return roundDecTen(Math.toDegrees(Math.asin(x)));
         //need err handling for nums < -1 or > 1
     }

     public Double arcCos(Double x){
         if(resultInRadians) {
             return roundDecTen(Math.acos(x));
         }
         return roundDecTen(Math.toDegrees(Math.acos(x)));
         //need err handling for nums < -1 or > 1
     }

     public Double arcTan(Double x){
         if(resultInRadians) {
             return roundDecTen(Math.atan(x));
         }
         return roundDecTen(Math.toDegrees(Math.atan(x)));
         //need err handling for nums < -1 or > 1
     }


     public Double log(Double x)
     {
        return roundDecTen(Math.log10(x));
     }
     public Double invLog(Double x) {

        return roundDecTen(Math.pow(10, x));
     }
     public Double ln(Double x) {

        return roundDecTen(Math.log(x));
     }
     public Double invLn(Double x) {

        return roundDecTen(Math.exp(x));
     }
     public Double factorial(Double x) {

         Double holder = 1.0;
         for(int i = 2; i <= x; i++) {
             holder *= i;
         }
         Double result = roundDecTen(holder) ;
         return result;
     }



}

