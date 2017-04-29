package haas.justin;

/**
 * Created by justinhaas on 4/29/17.
 */
public class Main {

    public static void main(String[] args){
        Input input = new Input();
        Calculate calculate = new Calculate();
        Display display = new Display();

        display.printDefault();

        System.out.println(calculate.addition(input.userInput(), input.userInput()));
        System.out.println(calculate.subtraction(input.userInput(), input.userInput()));
        System.out.println(calculate.multiplication(input.userInput(), input.userInput()));
        System.out.println(calculate.division(input.userInput(), input.userInput()));
        System.out.println(calculate.squareRoot(input.userInput()));
        System.out.println(calculate.square(input.userTwoInput(), input.userTwoInput()));
    }
}