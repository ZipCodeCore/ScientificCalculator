package com.zipcodewilmington.scientificcalculator;

//converts currently-displayed number to binary
public class Sci {
    public static String switchDisplayModeToBinary(Integer a){
        String displayMode = "";
        String converted = Integer.toString(a,2);

        return converted;

    }
    public static String switchDisplayModeToHexadecimal(Integer a){
        String displayMode = "";
        String converted = Integer.toString(a,16);


        return converted;

    }
    public static String switchDisplayModeToOctal(Integer a){
        String displayMode = "";
        String converted = Integer.toString(a,8);

        return converted;

    }
    public static String switchDisplayModeToDecimal(Integer a){
        String displayMode = "";
        String converted = Integer.toString(a,10);

        return converted;

    }

    static double memNum;
    static String memoryStatus = "not stored";
    public static void checkMemStatus(){
        if (memNum == 0 || memNum > 0 || memNum < 0){
            memoryStatus = "stored";
        } else {
            memoryStatus = "not stored";
        }
    }
    public static double memPlus(double a) {
        checkMemStatus();
        if (memoryStatus.equals("stored")){
            memNum += a;
        } else {
            memNum = a;
        }

        return memNum;
    }

    public static void memClear(){
        memoryStatus = "not stored";
        memNum = 0;


        }

    public static String noMem() {
        return "no memory stored";
    }

    public static double yesMem(){
        return memNum;
        }

    public static void recall() {
        checkMemStatus();
        if (memoryStatus.equals("not stored")) {
            noMem();
        } else {
            yesMem();
        }
    }
    public static double sine(double a){
        double sin = (double) Math.sin(a);
        return sin;
    }
    public static double cosine(double a){
        double cos = (double) Math.cos(a);
        return cos;
    }
    public static double tangent(double a){
        double tan = (double) Math.tan(a);
        return tan;
    }
    public static double inverseSine(double a){
        double invSin = (double) Math.asin(a);
        return invSin;
    }
    public static double inverseCosine(double a){
        double invCos = (double) Math.acos(a);
        return invCos;
    }
    public static double inverseTangent(double a){
        double invTan = (double) Math.atan(a);
        return invTan;
    }

    public static double switchUnitsModeRotate(double a){
        String unitsMode = "Radians";
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
    public static double logarithm(double a){
        double log = (double) Math.log10(a);
        return log;
    }
    public static double inverseLogarithm(double a, double b){
        double invLog = (double) (Math.pow(a, b));
        return invLog;
        //Request for first input to be 10
    }
    public static double naturalLogarithm(double a){
        double natLog = (double) Math.log(a);
        return natLog;
    }
    public double inverseNaturalLogarithm(double a, double b){
        double invNatLog = (double) (Math.pow(a, b));
        return invNatLog;
        //Request for the first input to be the number e
    }
    public static Integer factorial(Integer a){
        Integer fact = a;
        for (int i = 0; i< a;a++){
            fact *= a-1;
        }
        return fact;
    }
}
