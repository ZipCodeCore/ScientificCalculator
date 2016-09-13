package lindsay.devon.Calculator;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.lang.Math;

/**
 * Created by devonlindsay on 9/12/16.
 */
public class CurrentValueDisplay {

    BasicCalculations basicMath = new BasicCalculations();
    TrigCalculations trig = new TrigCalculations();
    LogarithmicCalculations log = new LogarithmicCalculations();
    double stateValue;

    String[] displayMode = { "decimal", "binary", "octal", "hexadecimal"};
    String currentDisplayMode = "decimal";


    CurrentValueDisplay() {
        this.stateValue = 0;
    }


   public void setCurrentValue(double input) {
    this.stateValue = input;
   }

   public double getCurrentValue() {
        return this.stateValue;
   }

   public void resetCurrentValue() {
       this.stateValue = 0;
   }


   public void cycleDisplayMode() {
       for(int i = 0; i < displayMode.length; i++) {
           if (displayMode[i].equals(currentDisplayMode)) {
               currentDisplayMode = displayMode[(i + 1)% 4];
               System.out.println(currentDisplayMode);
               return;

           }
       }
       System.out.println("There was a problem and your mode was not changed.");
    }

    public void changeDisplayMode(String userString) {
        for (int i = 0; i < displayMode.length; i++) {
            if (displayMode[i].equals(userString)) {
                currentDisplayMode = displayMode[i];
                System.out.println(currentDisplayMode);
            }
        }
    }

    public String switchDisplayMode (double result, String mode) {
        if (mode.equals("decimal")) {
            return Double.toString(result);
        } else if (mode.equals("binary")) {
            return Integer.toBinaryString((int)result);
        } else if (mode.equals("octal")) {
            return Integer.toOctalString((int)result);
        } else if (mode.equals("hexadecimal")) {
            return (Double.toHexString(result));
        } else {
            return "ERROR invalid selection";
        }

    }



    public void date() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }

    public void frustration() {
        System.out.println("AHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!!!!!");
    }


   }

