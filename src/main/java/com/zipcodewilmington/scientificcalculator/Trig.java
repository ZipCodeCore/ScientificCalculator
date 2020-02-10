package com.zipcodewilmington.scientificcalculator;

public class Trig {

    Double x;

    public Trig() {

        x = 0.0;
    }

        public static Double Sin(Double x, String unitOfMeasurement)
        {
            if("DEG".equals(unitOfMeasurement))
            {
                if (x >= 360) {
                    x = x % 360;
                }
                // convert degrees to radians
                double radians = Math.toRadians(x);

                return Math.sin(radians);

            }
            else
                    // sin() method to get the value
                    return Math.sin(x);

            }




    public static Double Cos(Double x, String unitOfMeasurement) {
        if ("DEG".equals(unitOfMeasurement)) {

            if (x >= 360) {
                x = x % 360;
            }

            // convert degrees to radians
            double radians = Math.toRadians(x);
            return Math.cos(radians);
        }

            else

                // cos() method to get the value
                return Math.cos(x);

    }

    public static Double Tan(Double x, String unitOfMeasurement) {

        if ("DEG".equals(unitOfMeasurement)) {

            if (x >= 360) {
                x = x % 360;
            }
            // convert degrees to radians
            double radians = Math.toRadians(x);
            return Math.tan(radians);
        }

        else

        // tan() method to get the value
        return Math.tan(x);

    }

    public static Double InvSin(Double x)
    {

        // convert degrees to radians
        double radians = Math.toRadians(x);

        // InvSin() method to get the value
        return  Math.toDegrees(Math.asin(x));
    }

    public static Double InvCos(Double x)
    {
        // convert degrees to radians
        double radians = Math.toRadians(x);

        // InvCos() method to get the value
        return Math.toDegrees(Math.acos(x));

    }

    public static Double InvTan(Double x)
    {
        // convert degrees to radians
        double radians = Math.toRadians(x);

        // InvTan() method to get the value
        return Math.toDegrees(Math.atan(x));
    }

    }
