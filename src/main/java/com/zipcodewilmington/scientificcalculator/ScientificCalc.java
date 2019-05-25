package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;


public class ScientificCalc{
//String s;
//Integer i;
//Double d;
//
//public ScientificCalc(String s,Integer i,Double d){
//    this.s=s.toUpperCase();
//    this.i=i;
//    this.d=d;
//    }

  public String  switchDisplayMode(String s,int i){

      String mode="";
      switch (s) {
          case "binary": mode = Integer.toBinaryString(i);
                        break;
          case "octal":  mode=Integer.toOctalString(i);
                        break;

          case "hexadecimal":   mode=Integer.toHexString(i);
                        break;
          case "decimal": mode=Integer.toBinaryString(i);
                            break;
           default:
               System.out.println("Please enter a valid input");
      }

        return mode;
    }

    public double trig(String s,Double d){

        Double trigval=0.0;
        switch (s) {
            case "sin":  trigval = Math.sin(d);  //d in radians
                break;
            case "cos":  trigval = Math.cos(d);
                break;
            case "tan":  trigval = Math.tan(d);
                break;
            case "inverse sine":  trigval = Math.asin(d);
                break;
            case "inverse cosine":  trigval = Math.acos(d);
                break;
            case "inverse tan":  trigval = Math.atan(d);
                break;
            default:  System.out.println("Please enter a valid input");
            break;
        }
        return trigval;
    }

    public double trigdeg(String s,Double d) {

        Double trigvald = 0.0;
        switch (s) {
            case "sin":
                trigvald = Math.sin(Math.toRadians(d));  //d in degrees
                break;
            case "cos":
                trigvald = Math.cos(Math.toRadians(d));
                break;
            case "tan":
                trigvald = Math.tan(Math.toRadians(d));
                break;
            case "inverse sine":
                trigvald = Math.asin(Math.toRadians(d));
                break;
            case "inverse cosine":
                trigvald = Math.acos(Math.toRadians(d));
                break;
            case "inverse tan":
                trigvald = Math.atan(Math.toRadians(d));
                break;
            default:
                System.out.println("Please enter a valid input");
                break;
        }
        return trigvald;
    }


    public BigInteger factorial(Integer i){


        BigInteger f=new BigInteger("1");

        for(int j=1;j<=i;j++){
            f=f.multiply(BigInteger.valueOf(j));
        }
        System.out.println("The Factorial of "+f);
        return f;
    }

    public double logfns(String s, Double d){
         Double logres=0.0;
    switch(s) {
        case "log": logres=Math.log(d);
                    break;
        case "log10": logres=Math.log10(d);
                    break;
        case "inverse natural log":logres=Math.pow(Math.E,d);
                    break;
        case "inverse log": logres=Math.pow(10,d);
                break;
        default:
            System.out.println("Please enter a valid input");
                break;

    }
          return logres; }



}