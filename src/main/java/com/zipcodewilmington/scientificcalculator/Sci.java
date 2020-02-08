package com.zipcodewilmington.scientificcalculator;

public class Sci {
    public String switchDisplayMode(){
        String displayMode = "";
        return displayMode;
        //binary,octal,decimal,hexadecimal
    }

    public void memPlus(){

        }
        public void memCLear(){


        }
        public float recall(){
            float memNum = 0;
            return memNum;
        }
    public float sine(float a){
        float sin = (float) Math.sin(a);
        return sin;
    }
    public float cosine(float a){
        float cos = (float) Math.cos(a);
        return cos;
    }
    public float tangent(float a){
        float tan = (float) Math.tan(a);
        return tan;
    }
    public float inverseSine(float a){
        float invSin = (float) Math.asin(a);
        return invSin;
    }
    public float inverseCosine(float a){
        float invCos = (float) Math.acos(a);
        return invCos;
    }
    public float inverseTangent(float a){
        float invTan = (float) Math.atan(a);
        return invTan;
    }
    public String switchUnitsModeRotate(){
        String unitsMode = "";
        return unitsMode;
        //degrees,radians
    }
    public String switchUnitsModeString(String unitsModeInput){
        return unitsModeInput;
    }
    public float logarithm(float a){
        float log = (float) Math.log10(a);
        return log;
    }
    public float inverseLogarithm(float a){
        float invLog = (float) (1 / Math.log10(a));
        return invLog;
    }
    public float naturalLogarithm(float a){
        float natLog = (float) Math.log(a);
        return natLog;
    }
    public float inverseNaturalLogarithm(float a){
        float invNatLog = (float) (1/Math.log(a));
        return invNatLog;
    }
    public Integer factorial(Integer a){
        Integer fact = a;
        for (int i = 0; i< a;a++){
            fact *= a-1;
        }
        return fact;
    }
}

