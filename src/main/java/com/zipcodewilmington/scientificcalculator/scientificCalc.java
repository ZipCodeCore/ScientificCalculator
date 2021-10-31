import java.lang.Math;
public class scientificCalc {

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
    public scientificCalc() {
    }

    public static double sine() {

        return Math.sin(i);
    }

    public double cosign() {

        return Math.cos(i);
    }

    public double tangent() {

        return Math.tan(i);
        // will return a double
    }

    public double inverseSine() {

        return (int) Math.asin(i);
        //will return a int;
    }

    public double inverseCoSine() {

        return (int) Math.acos(i);
        //will return a int;
    }

    public double inverseTangent() {

        return Math.atan(i);
        // will print double
    }

    public double logarithm() {
        // natural
        return Math.log(i);
    }

    public double logarithm10() {

        return Math.log10(i);
    }

        public long factorial() {
            long num = i;
            // probably need to incorporate BigInteger;
            int i=1;
            int fact=1;
            while(i<=num) {
                fact=fact*i;
                i++;
            }
            return(fact);
        }
    }





