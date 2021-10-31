package com.zipcodewilmington.scientificcalculator;

  /*
        Scientific Features
        Switch display mode (binary, octal, decimal, hexadecimal)
        switchDisplayMode() should rotate through the options
        switchDisplayMode(String mode) should set the display to the mode given
        Memory - Store up to one numeric value in memory for recall later (default to 0) *

            input =
        (M+ key) Add the currently displayed value to the value in memory (store in memory and update display) *
                (MC key) Reset memory *
                (MRC key) Recall the current value from memory to the display *

                //    Switch trig units mode (Degrees, Radians)
    //    switchUnitsMode() should rotate through the options
    //    switchUnitsMode(String mode) should set the trig units to the type given


//    ex (inverse natural logarithm)
*/

import java.util.Scanner;

public class scientificCalc {

    public scientificCalc() {
    }

    public double promptScreen() {

        Scanner prompt = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(prompt.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(prompt.nextLine());
        System.out.println("Choose your scientific function");
        System.out.println("SIN, SIN-1, COS, COS-1 TAN, TAN-1,LOG, LOG10, FAC, LNBase");
        //String selection = String.valueOf(prompt.nextLine());
        return promptScreen();
    }
}

   if (selection == "SIN") {
            return sine();
   } else if(selection == "SIN=1") {
            return inverseSine();
   } else if(selection == "COS") {
            return cosign();
   } else if(seleciton == "COS-1") {
            return inverseCoSine();
   } else if(selection =="TAN") {
        return tangent();
   } else if(selection =="TAN-1") {
        return inverseTangent();
   } else if(selection =="LOG") {
            return logarithm();
   } else if(selection == "LOG10") {
            return logarithm10();
   } else if (selection == "LNBase") {
            return Math.pow(Math.E, (Math.log(x)));  // needs method
   } else {
            return factorial();
                            }
   public double sine() {
            return Math.sin(first + second);
        }
        public double inverseSine() {
        return (int) Math.asin();
        //will return a int;
        }
        public double cosign() {
        return Math.cos();
        }
        public double inverseCoSine() {
        return (int) Math.acos();
        }
        public double tangent() {
        return Math.tan();
        // will return a double
        }
        public double inverseTangent() {
        return Math.atan();
        // will print double
        }
        public double logarithm() {
        // natural
        return Math.log();
        }
        public double logarithm10() {
        return Math.log10;
        }
        public long factorial() {
            long num = 0;
            // probably need to incorporate BigInteger;
            int i=1;
            int fact=1;
            while(i<=num) {
                fact=fact*i;
                i++;
            }
            return();
        }
    }






