package com.zipcodewilmington.scientificcalculator;

//converts currently-displayed number to binary
public class Sci {
    public String switchDisplayModeToBinary(Integer a){
        String displayMode = "";
        String converted = Integer.toString(a,2);

        return converted;

    }
    public String switchDisplayModeToHexadecimal(Integer a){
        String displayMode = "";
        String converted = Integer.toString(a,16);


        return converted;

    }
    public String switchDisplayModeToOctal(Integer a){
        String displayMode = "";
        String converted = Integer.toString(a,8);

        return converted;

    }
    public String switchDisplayModeToDecimal(Integer a){
        String displayMode = "";
        String converted = Integer.toString(a,10);

        return converted;

    }

    float memNum = 0;
    public void memPlus(float a){
        memNum = a;

        }
        public void memClear(){                                         //needs work



        }
        public float recall(){

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
    String unitsMode = "Radians";
    public float switchUnitsModeRotate(float a){
        float converted = 0;
        if (unitsMode.equals("Radians")) {
            unitsMode = "Degrees";
            converted = (float) Math.toDegrees(a);
        } else {
            unitsMode = "Radians";
            converted = (float) Math.toRadians(a);
        }
        return converted;
        //degrees,radians
    }

    public float switchUnitsModeString(String unitsModeInput, float a){
        float converted = 0;
        if (unitsModeInput.equals("Degrees")){
            converted = (float) Math.toDegrees(a);
            return converted;
        } else if (unitsModeInput.equals("Radians")){
            converted = (float) Math.toRadians(a);
            return converted;
        } else {
            System.out.println("Invalid unit type, try again.");
            return converted;
        }

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

