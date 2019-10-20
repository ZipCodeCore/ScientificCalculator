package com.zipcodewilmington.scientificcalculator;

public class ScientificCalculator {


    //fields for storing results
    private Double doubleResult;
    private String stringResult;

    //Constructor
    public ScientificCalculator(){
        doubleResult = null;
        stringResult = "0";
    }

    //Scientific Operator functions
    public void square(Double x){
        try {

            if (x == 0) {
                x = Console.getDoubleInput("Square: ");
            }
            x = Console.getDoubleInput(x + " * ");
            this.setDoubleResult(x * x);
            this.setStringResult(Double.toString(x*x));

        }
        //for non-double inputs
        catch(Exception e){
            this.setDoubleResult(null);
            this.setStringResult("ERROR");
        }
    }

    public void squareRoot(Double x){
        try {
            if (x == 0) {
                x = Console.getDoubleInput("Sqaure Root: ");
            }

            x = Console.getDoubleInput(x + " ^ ");
            this.setDoubleResult(Math.sqrt(x));
            this.setStringResult(Double.toString(Math.sqrt(x)));

        }
        //for non double inputs
        catch(Exception e){
            this.setDoubleResult(null);
            this.setStringResult("ERROR");
        }
    }

    public void inverse(Double x){
        try {
            if (x == 0) {
                x = Console.getDoubleInput("Inverse: ");
            }

            Double y = Console.getDoubleInput(x + " * ");
            this.setDoubleResult(x * y);
            this.setStringResult(Double.toString(x * y));

        }
        //for non double inputs
        catch(Exception e){
            this.setStringResult("ERROR");
        }
    }

    public void switchSign(Double x){
        try {
            x = x * -1;

            if (x > 0) {
                x = Console.getDoubleInput("Switch Sign: ");
            }

            while(x == 0){
                x = Console.getDoubleInput("Please enter a non-zero denominator: ");
            }

            this.setDoubleResult(x * -1);
            this.setStringResult(Double.toString(x * -1));

        }
        //for non double inputs and division by zero.
        catch(Exception e){
            this.setStringResult("ERROR");
        }
    }

    public void sine(Double x){
        try {
            if (x > 0) {
                x = Console.getDoubleInput("Sine: ");
            }

            while(x == 0){
                x = Console.getDoubleInput("Please enter a non-zero denominator: ");
            }

            this.setDoubleResult(Math.sin(x));
            this.setStringResult(Double.toString(Math.sin(x)));

        }
        //for non double inputs
        catch (Exception e) {
            this.setDoubleResult(null);
            this.setStringResult("ERROR");
        }
    }

    public void cosine(Double x){
        try {
            if (x > 0) {
                x = Console.getDoubleInput("Cosine: ");
            }

            while(x == 0){
                x = Console.getDoubleInput("Please enter a non-zero denominator: ");
            }

            this.setDoubleResult(Math.cos(x));
            this.setStringResult(Double.toString(Math.cos(x)));

        }
        //for non double inputs
        catch (Exception e) {
            this.setDoubleResult(null);
            this.setStringResult("ERROR");
        }

    }


    public void tangent(Double x) {
        try {

            if (x > 0) {
                x = Console.getDoubleInput("Tangent: ");
            }

            while(x == 0){
                x = Console.getDoubleInput("Please enter a non-zero denominator: ");
            }

                this.setDoubleResult(Math.tan(x));
                this.setStringResult(Double.toString(Math.tan(x)));

            }
            //for non double inputs
            catch (Exception e) {
                this.setDoubleResult(null);
                this.setStringResult("ERROR");
            }

    }

    public void inverseSine(Double x){
        try {
            double degrees = x;
            double radians = Math.toRadians(degrees);
            double sin;

            sin = Math.sin(radians);


            if (x > 0) {
                x = Console.getDoubleInput("Inverse Sine: ");
            }

            while(x == 0){
                x = Console.getDoubleInput("Please enter a non-zero denominator: ");
            }

            this.setDoubleResult(Math.toDegrees(Math.asin(sin)));
            this.setStringResult(Double.toString(Math.toDegrees(Math.asin(sin))));
        }
        //for non double inputs and division by zero.
        catch(Exception e){
            this.setStringResult("ERROR");
        }
    }

    public void inverseCosine(Double x){
            try {

                double degrees = x;
                double radians = Math.toRadians(degrees);
                double cos;

                cos = Math.cos(radians);

                if (x > 0) {
                    x = Console.getDoubleInput("Inverse Cosine: ");
                }

                while(x == 0){
                    x = Console.getDoubleInput("Please enter a non-zero denominator: ");
                }

                this.setDoubleResult(Math.toDegrees(Math.acos(cos)));
                this.setStringResult(Double.toString(Math.toDegrees(Math.acos(cos))));
            }
            //for non double inputs and division by zero.
            catch(Exception e){
                this.setStringResult("ERROR");
            }

    }

    public void inverseTangent(Double x){
        try {
            double degrees = x;
            double radians = Math.toRadians(degrees);
            double tan;

            tan = Math.tan(radians);


            if (x > 0) {
                x = Console.getDoubleInput("Inverse Tangent: ");
            }

            while(x == 0){
                x = Console.getDoubleInput("Please enter a non-zero denominator: ");
            }

            this.setDoubleResult(Math.toDegrees(Math.atan(tan)));
            this.setStringResult(Double.toString(Math.toDegrees(Math.atan(tan))));
        }
        //for non double inputs and division by zero.
        catch(Exception e){
            this.setStringResult("ERROR");
        }
    }

    public void factorial(Double x){
        try {

            int i, fact = 1;

            for(i = 0; i <= x; i++) {

                if (x == 0) {
                    x = Console.getDoubleInput("Factorial: ");
                }

                fact = fact * i;
            }

            // Correct the output
            x = Console.getDoubleInput(x + " ! ");
            this.setDoubleResult(x * fact);
            this.setStringResult(Double.toString(x * fact));

        }
        //for non double inputs
        catch(Exception e){
            this.setDoubleResult(null);
            this.setStringResult("ERROR");
        }
    }


    //Getters and Setters for class fields

    public double getDoubleResult() {
        return doubleResult;
    }

    public void setDoubleResult(Double doubleResult) {
        this.doubleResult = doubleResult;
    }

    public String getStringResult() {
        return stringResult;
    }

    public void setStringResult(String stringResult) {
        this.stringResult = stringResult;
    }




}