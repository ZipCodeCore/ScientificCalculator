package ibikunle.tolani;

import java.util.Scanner;

import static ibikunle.tolani.NumberFromUser.*;//imported the number from user class

/**
 * Created by tolaniibikunle on 1/15/17.
 */
public class Display {



        static public void choose(String pick){


        switch(pick){
            case "add":
                Calculations.addValue(input1,input2);
                getSolution();
               break;
            case "subtract":
                Calculations.subtractValue(input1,input2);
                getSolution();
                break;
            case "multiply":
                Calculations.multiplyValue(input1,input2);
                getSolution();
                break;
            case "divide":
                Calculations.divideValue(input1,input2);
                getSolution();
                break;
            case "square":
                Calculations.calculateSquareValue(input1);
                getSolution();
                break;
            case "square root":
                Calculations.calculateSquareRootValue(input1);
                getSolution();
                break;
            case "exponent":
                Calculations.calculateExponentValue(input1,input2);
                getSolution();
                break;
            case "inverse":
                Calculations.inverseValue(input1);
                getSolution();
                break;
            case "sin":
                Calculations.sinValue(input1);
                getSolution();
                break;
            case "cosine":
                Calculations.cosineValue(input1);
                getSolution();
                break;
            case "tangent":
                Calculations.tangentValue(input1);
                getSolution();
                break;
            case "inverse sin ":
                Calculations.inverseSinValue(input1);
                getSolution();
                break;
            case "inverse cosine":
                Calculations.cosineInverseValue(input1);
                getSolution();
                break;
            case "inverse tangent":
                Calculations.inverseTangentValue(input1);
                getSolution();
                break;
            case "natural log":
                Calculations.calculateTheNaturalLogValue(input1);
                getSolution();
                break;
            case "log":
                Calculations.calculateLogOfValue(input1);
                getSolution();
                break;
            case "clear number":
                Calculations.clearNumberOnDisplay();
                getSolution();
                break;
            case "inverse natural log":
                Calculations.calculateInverseNaturalLog(input1);
                getSolution();
                break;
            case "factorial":
                Calculations.calculateFactorialValue(input1);
                getSolution();
                break;
            case "volume of sphere":
                Calculations.volumeOfASphere(input1);
                getSolution();
                break;
            case"volume of a cyinder":
                Calculations.volumeOfACylinder(input1,input2);
                getSolution();
                break;

            default:
                System.out.println(Calculations.clearNumberOnDisplay());



             }
        }
    }

