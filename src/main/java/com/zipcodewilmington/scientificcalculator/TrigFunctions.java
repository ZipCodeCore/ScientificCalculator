package com.zipcodewilmington.scientificcalculator;

public class TrigFunctions {

    private Boolean inDegreeMode = false;

    public void changeMode() { inDegreeMode = !inDegreeMode; }
    public void radianMode() { inDegreeMode = false; }
    public void degreeMode() { inDegreeMode = true; }


    //Calculate the sine in radians or degrees
    public Double sin(Double arg)  {
        if(!inDegreeMode) return Math.sin(arg);
        else return Math.sin(Math.toRadians(arg));
    }

    //Calculate the cosine in radians or degrees
    public Double cos(Double arg) {
        if(!inDegreeMode) return Math.cos(arg);
        else return Math.cos(Math.toRadians(arg));
    }

    //Calculate the tangent in radians or degrees
    public Double tan(Double arg) {

        if(this.cos(arg) == 0) { /* throw error*/ }

        if(!inDegreeMode) return Math.tan(arg);
        else return Math.tan(Math.toRadians(arg));
    }

    //Calculate the inverse sine in radians or degrees
    public Double arcSin(Double arg) {

        if(arg < -1 || arg > 1 ) { /*throw error*/ }

        if(!inDegreeMode) return Math.asin(arg);
        else return Math.toDegrees(Math.asin(arg));
    }

    //Calculate the inverse cosine in radians or degrees
    public Double arcCos(Double arg) {

        if(arg < -1 || arg > 1 ) { /*throw error*/ }

        if(!inDegreeMode) return Math.acos(arg);
        else return Math.toDegrees(Math.acos(arg));
    }

    //Calculate the inverse tangent in radians or degrees
    public Double arcTan(Double arg) {
        if(!inDegreeMode) return Math.atan(arg);
        else return Math.toDegrees(Math.atan(arg));
    }

}
