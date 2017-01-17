package humphrey.jeriah.Calculator;
import java.lang.Math;

/**
 * Created by jeriahhumphrey on 1/16/17.
 */
public class Calculator {
    public double currentNumber;

    public Calculator(){
        this.displayNumber();
    }

    public double displayNumber(){
        System.out.println(currentNumber);
        return currentNumber;
    }
    public double clearDisplay(){
        Calculator c = new Calculator();
        return c.currentNumber;

    }
    public double changeNumber(double newNumber){
        currentNumber = newNumber;
        this.displayNumber();
        return currentNumber;
    }

    public double add(double addNumber){
        currentNumber += addNumber;
        this.displayNumber();
        return currentNumber;
    }

    public double subtract(double subtractNumber){
        currentNumber -= subtractNumber;
        this.displayNumber();
        return currentNumber;
    }

    public double multiply(double multiplyNumber){
        currentNumber *= multiplyNumber;
        this.displayNumber();
        return currentNumber;
    }
    public double divide (double divideNumber){
        if(divideNumber != 0) {
            currentNumber /= divideNumber;
            this.displayNumber();
        }
        else{

            System.out.println("Err");
            this.clearDisplay();
        }
        return this.currentNumber;
    }

    public double squareNumber(){
        currentNumber *=currentNumber;
        this.displayNumber();
        return currentNumber;
    }

    public double squareRootNumber(){
        currentNumber = Math.sqrt(currentNumber);
        this.displayNumber();
        return currentNumber;

    }

    public double variableExponentation(double exponent){
        currentNumber= Math.pow(currentNumber,exponent);
        this.displayNumber();
        return currentNumber;
    }

    public double inverseNumber(){
        if (currentNumber != -0) {
            currentNumber = 1 / currentNumber;
            this.displayNumber();
        }
        else{
            System.out.println("Err");
            this.clearDisplay();
        }
        return currentNumber;
    }

    public double switchSign(){
        currentNumber= currentNumber * -1;
        this.displayNumber();
        return currentNumber;
    }

    public double absoluteValue(){
        if (currentNumber<0){
            currentNumber = currentNumber *-1;
        }
        this.displayNumber();
        return currentNumber;
    }

    public double percent(double number){
        currentNumber= (currentNumber/number)* 100;
        this.displayNumber();
        return currentNumber;
    }

}
