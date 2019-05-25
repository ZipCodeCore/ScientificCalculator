package com.zipcodewilmington.scientificcalculator;

import javax.xml.transform.Result;
import java.sql.ResultSet;

/*
*
*
*
* commented out bits aren't done
*   -bob
*
*
*
*
* */
public class scientificCalculator extends Calculator {
    public String state;
    public Double currentNumber;
    public char currentDisplayMode = 'd'; ///d = decimals, h = hex, o = oct, b = binary
    public Boolean resultInRadians = true;

    public scientificCalculator() {}

    public scientificCalculator(Double x, Double y) {

    }
    public scientificCalculator(Double x) {}



    /*
    *
    *
    * these next to methods are to covert to other displays.
    * Can just call at the end of each method if to covert to the
    * correct mode. I dont know if it makes any sense, code to implement the
    * change in dispay is not in there but I'm tired and it
    * is late through it in there. feel free to destroy :P
    *
    *
    * */
    ///Changes display mode of
//    public void switchDisplayMode (char modeInput) {
//        this.currentDisplayMode = modeInput;
//    }
//
//
//    public Double covertNumber(Double num, char currentDisplayMode) {
//
//        switch (currentDisplayMode) {
//            case 'b':
//                //covert to binary
//                break;
//            case 'h':
//                //convert to hex
//                break;
//            case 'o':
//                //convert to oct
//                break;
//            case 'd':
//                //convert to decimal
//                break;
//            default:
//                break;
//        }
//        return num;
//    }

    public Double roundDecTen (Double num) {
        Double result = Double.parseDouble(String.format("%.3f %n", num));
        return result;
    }


//    public Double saveNumber(String memStatus) {
//        return null;
//    } //save up to one number for later

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
     }
     public Double arcCos(Double x){
         if(resultInRadians) {
             return roundDecTen(Math.acos(x));
         }

         return roundDecTen(Math.toDegrees(Math.acos(x)));
     }
     public Double arcTan(Double x){
         if(resultInRadians) {
             return roundDecTen(Math.atan(x));
         }

         return roundDecTen(Math.toDegrees(Math.atan(x)));
     }
//     public Double switchUnitsMode()  {
//        return null;
//     }
//
//     public Double switchUnitesMode(String mode) {
//
//        return null;
//     }


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

