package Ravikumar.Sujatha.Project1Calculator;

import com.sun.javafx.geom.transform.BaseTransform;

/**
 * Created by sujatharavikumar on 9/10/16.
 */
public class Calculator {

    Display display = new Display();

    public int sum(int n){
        int count = 0;
        for (int i=1; i<=n; i++){
            count += i;
        }
        return count;
    }

    public int product(int n){
        int prod = 1;
        for (int i=1; i<=n; i++){
            prod *= i;
        }
        return prod;
    }

    public double sumOfNumbers(double num1, double num2){
        double sum = num1+num2;
        return sum;
    }

    public double difference(double num1, double num2){
        double diff = num1-num2;
        return diff;
    }

    public double productOfNumbers(double num1, double num2){
        double product = num1*num2;
        return product;
    }

    public double divide(double num1, double num2){
        double div = 0;
        if (num2 != 0)
            div = num1/num2;
        else
            display.displayExpression("Error");
        return div;
    }

    public double factorial (double number){
        number = Math.round(number);
        //System.out.println(number);
        return number == 1 ? 1 : number * factorial(number-1);
    }

    public String switchToHex (double number){
        String hex_String = Integer.toHexString((int)number);
        return hex_String;
    }

    /*public double switchTrigUnitsMode(double number){
        double degrees = Math.toRadians(radians);
        return degrees;
    }*/

    /*public double switchUnitsMode(double degrees){
        double radians =
    }*/
    public String switchToBinary(double number){
        String binary_String = Integer.toBinaryString((int)number);
        return binary_String;
    }
    public String switchToOctal(double number){
        String octal_String = Integer.toOctalString((int)number);
        return octal_String;
    }


}
