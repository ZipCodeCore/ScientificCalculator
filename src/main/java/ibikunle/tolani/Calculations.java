package ibikunle.tolani;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.lang.Math;


/**
 * Created by tolaniibikunle on 1/14/17.
 */
public class Calculations {
    static double answer;

    static public double addValue(double input1, double input2) {
        answer = input1 + input2;
        return answer;
    }

    static public double subtractValue(double input1, double input2) {
        answer = input1 - input2;
        return answer;
    }

    static public double multiplyValue(double input1, double input2) {
        answer = input1 * input2;
        return answer;
    }

    static public double divideValue(double input1, double input2) {
        if (input2 == 0) {
            System.out.println("Err");
        } else {
            answer = input1 / input2;
        }
        return answer;
    }

    static public double calculateSquareValue(double input1) {
        answer = input1 * input1;
        return answer;
    }

    static public double calculateSquareRootValue(double input1) {
        answer = Math.sqrt(input1);
        return answer;
    }

    static public double calculateExponentValue(double input1, double input2) {
        answer = Math.pow(input1, input2);
        return answer;
    }

    static public double inverseValue(double input1) {
        answer = (1 / input1);
        return answer;
    }

    static public double sinValue(double input1) {
        answer = Math.sin(input1);
        return answer;
    }

    static public double inverseSinValue(double input1) {
        answer = Math.asin(input1);
        return answer;
    }

    static public double cosineValue(double input1) {
        answer = Math.cos(input1);
        return answer;
    }

    static public double cosineInverseValue(double input1) {
        answer = Math.acos(input1);
        return answer;
    }

    static public double tangentValue(double input1) {
        answer = Math.tan(input1);
        return answer;
    }

    static public double inverseTangentValue(double input1) {
        answer = Math.atan(input1);
        return answer;
    }

    static public double calculateTheNaturalLogValue(double input1) {
        answer = Math.log(input1);
        return answer;
    }

    static public double calculateLogOfValue(double input1) {
        answer = Math.log10(input1);
        return answer;
    }

    static public double clearNumberOnDisplay() {
        return 0;
    }

    static public double calculateInverseNaturalLog(double input1) {
        answer = Math.exp(input1);
        return answer;
    }

    static public double volumeOfASphere(double input1) {
        answer = (4 / 3) * Math.PI * (input1 * input1 * input1);
        return answer;
    }
    static public double volumeOfACylinder(double input1,double input2){
        answer = Math.PI*(input1*input1)*input2;
        return answer;
}
    static public double calculateFactorialValue(double input1) {
        if (input1 == 1) {
            return 1;
        } else {
            return answer = (input1 - 1) * input1;
        }
    }
}


