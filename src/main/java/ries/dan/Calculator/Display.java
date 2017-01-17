package ries.dan.Calculator;
import java.lang.*;
import java.util.*;
/**
 * Created by danries on 1/13/17.
 */
public class Display {

    static double memoryValue = 0;
    static String current = "";
    static Convert convert = new Convert();

    public static void storeDiplayedValueMemory(double x){
        memoryValue = x;
        //return memoryValue; (used for test)
    }

    public static void clearMemory(){
        memoryValue = 0;
    }

    public static double callMemory(){
        return memoryValue;
    }

    public static String switchUnitsMode(boolean change){
        current = "radian";

        if(change){
            current = "degree";
        }

        return current;
    }

    public static void displayModeLists(int i){
//        ArrayList modes = new ArrayList();
//        modes.add(0, "binary");
//        modes.add(1,"octal");
//        modes.add(2,"decimal");
//        modes.add(3,"hexadecimal");
    }

    public static String switchDisplayMode(){
        int rotate = 0;

        ArrayList modes = new ArrayList();
//        modes.add(0, "binary");
//        modes.add(1,"octal");
        modes.add(0,"decimal");
        modes.add(1,"hexadecimal");

        rotate += 1;

        if (rotate > 1){
            rotate = 0;
        }



        return (String)(modes.get(rotate));
    }

    public static String switchDisplayMode(String mode){

        ArrayList modes = new ArrayList();
//        modes.add(0, "binary");
//        modes.add(1,"octal");
        modes.add(0,"decimal");
        modes.add(1,"hexadecimal");

        int element = modes.indexOf("mode");

        return (String)(modes.get(element));

    }

    public static void displayAnswer(double answer){
        if ("decimal" == switchDisplayMode()){
            System.out.println(answer);
        }
        if ("hexadecimal" == switchDisplayMode()){
            String printOut = convert.answerToHex(answer);
            System.out.println(printOut);
        }


    }

//    public static void displayAnswer(String answer){
//        System.out.println(answer);
//    }

}
