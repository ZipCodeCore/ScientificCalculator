package Ravikumar.Sujatha.Project1Calculator;

/**
 * Created by sujatharavikumar on 9/11/16.
 */
public class Display {

    int defaultValue = 0;
    double memory = 0;

    public void defaultDisplay(){
        System.out.println("*********");
        System.out.println(defaultValue);
        System.out.println("*********");

    }

    public void displayExpression(String expr){
        System.out.println("*******************");
        System.out.println(expr);
        System.out.println("*******************");

    }

    public void displayNumber(double num){
        memory = num;
        System.out.println("*******************");
        System.out.println(num);
        System.out.println("*******************");

    }


    public void displayOperation2(){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Sum                  Difference            Product             Division");
        System.out.println("Clear Display        Exponentiation        Factorial           log");
        System.out.println("Square               Sqrt                  Inverse             Negate");
        System.out.println("Sin In Radians       Cosine In Radians     Tan In Radians");
        System.out.println("Sin In Degrees       Cosine In Degrees     Tan In Degrees");
        System.out.println("Add Memory - M       Clear Memory - MC     Recall Memory - MRC");
        System.out.println("Switch To Hex        Switch To Binary      Switch To Octal");
        System.out.println("Exit");
        System.out.println("----------------------------------------------------------------------");
    }

}
