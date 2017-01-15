package Calculator;

import java.util.Scanner;

/**
 * Created by randallcrame on 1/13/17.
 */
public class Command {
    Scanner inputNumeral = new Scanner(System.in).useDelimiter("\\s\\D");


    Scanner inputString = new Scanner(System.in).useDelimiter("\\s\\d");

    public Command (){}

    public void requestLine(){
        System.out.print("Enter Number/Command");
    }

    public void requestFirstNumber(double input){
        requestLine();
        Input.setLeftValue(input);
    }

    public void requestSecondNumber(double input){
        requestLine();
        Input.setRightValue(input);
    }

    public void requestCommand(String input){
        requestLine();
        Input.setCommand(input);
    }

}
