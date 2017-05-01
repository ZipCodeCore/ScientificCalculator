/**
 * Created by denniskalaygian on 4/29/17.
 */
import java.util.Scanner;
import java.lang.Math;

public class CoreCalculator {

    private static double value = 2.00; // Change to 0.00; when running

    public double getValue(){
        return value;
    }

    public void displayValue(){
        System.out.println(value);
    }

    public double setGivenNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double givenNumber = 3.00; //Uncomment this line and delete value after testing: in.nextDouble();
        return givenNumber;
    }

    public void add() {
        value += setGivenNumber();
        System.out.println(value);
    }

    public void subtract() {
        value -= setGivenNumber();
        System.out.println(value);
    }

    public void multiply() {
        value *= setGivenNumber();
        System.out.println(value);
    }

    public void divide() {
        try{
            value /= setGivenNumber();
            System.out.println(value);
        }catch (Exception e){
            System.out.println("Err");
            clearDisplay();
        }
    }

    public void square() {
        value *= value;
        System.out.println(value);
    }

    public void squareRoot() {
        try{
            value = Math.sqrt(value);
            System.out.println(value);
        }catch (Exception e){
            System.out.println("Err");
            clearDisplay();
        }
    }

    public void raisePower() {
        try {
            double original = value;
            double power = setGivenNumber();
            for (int i = 1; i < power; i++) {
                value *= original;
            }
            System.out.println(value);
        } catch (Exception e) {
            System.out.println("Err");
            clearDisplay();
        }
    }

    public void inverse() {
        value = 1 / value;
        System.out.println(value);
    }

    public void invertSign() {
        value *= -1;
        System.out.println(value);
    }

    public void clearDisplay() {
        value = 0.00;
        System.out.println(value);
    }
}
