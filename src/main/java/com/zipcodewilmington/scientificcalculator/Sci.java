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

    double memNum = 0;
    public void memPlus(double a){
        memNum = a;

        }
        public void memClear(){                                         //needs work



        }
        public double recall(){

            return memNum;
        }
    public double sine(double a){
        double sin = (double) Math.sin(a);
        return sin;
    }
    public double cosine(double a){
        double cos = (double) Math.cos(a);
        return cos;
    }
    public double tangent(double a){
        double tan = (double) Math.tan(a);
        return tan;
    }
    public double inverseSine(double a){
        double invSin = (double) Math.asin(a);
        return invSin;
    }
    public double inverseCosine(double a){
        double invCos = (double) Math.acos(a);
        return invCos;
    }
    public double inverseTangent(double a){
        double invTan = (double) Math.atan(a);
        return invTan;
    }
    String unitsMode = "Radians";
    public double switchUnitsModeRotate(double a){
        double converted = 0;
        if (unitsMode.equals("Radians")) {
            unitsMode = "Degrees";
            converted = (double) Math.toDegrees(a);
        } else {
            unitsMode = "Radians";
            converted = (double) Math.toRadians(a);
        }
        return converted;
        //degrees,radians
    }

    public double switchUnitsModeString(String unitsModeInput, double a){
        double converted = 0;
        if (unitsModeInput.equals("Degrees")){
            converted = (double) Math.toDegrees(a);
            return converted;
        } else if (unitsModeInput.equals("Radians")){
            converted = (double) Math.toRadians(a);
            return converted;
        } else {
            System.out.println("Invalid unit type, try again.");
            return converted;
        }

    }
    public double logarithm(double a){
        double log = (double) Math.log10(a);
        return log;
    }
    public double inverseLogarithm(double a){
        double invLog = (double) (1 / Math.log10(a));
        return invLog;
    }
    public double naturalLogarithm(double a){
        double natLog = (double) Math.log(a);
        return natLog;
    }
    public double inverseNaturalLogarithm(double a){
        double invNatLog = (double) (1/Math.log(a));
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

