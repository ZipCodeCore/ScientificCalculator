package ries.dan.Calculator;
import java.util.*;
import java.math.*;
import java.lang.*;
/**
 * Created by danries on 1/13/17.
 */
public class Convert {

    public static double convertRadorDegree(double x){
        if (Display.current.equals("radian")){
            x = Math.toRadians(x);
        }
        else{
            x = Math.toDegrees(x);
        }
        return x;
    }

    public static double invertNumber(double x){
        x = x*(-1);
        return x;
    }

//    public static String answerToBinary(double answer){
//        int converted =(int)Math.floor(answer);
//        return Integer.toBinaryString(converted);
//    }

//    public static String answerToOctal(double answer){
//        int converted = (int)answer;
//        return Integer.toOctalString(converted);
//    }

    public static String answerToHex(double answer){
        return Double.toHexString(answer);
    }

}
