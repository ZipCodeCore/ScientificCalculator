package Calculator;

import java.util.Scanner;

/**
 * Created by randallcrame on 1/13/17.
 */
public class Command {
    static Scanner input= new Scanner(System.in);//.useDelimiter("\\s\\D");
   // static Scanner inputString = new Scanner(System.in);//.useDelimiter("\\s\\d");

    static public void requestLine(){
        System.out.print("Enter Number/Command: ");
    }

    static public void requestFirstNumber(double input){
        Input.setLeftValue(input);
        Input.setNumeralCommand(input);

    }

    static public void requestSecondNumber(double input){
        Input.setRightValue(input);
    }

    public static void requestCommand(EngineCommands input){
        Input.setCommand(input);
    }

    static public void firstValueInquiry(){
        requestLine();
        requestFirstNumber(input.nextDouble());
    }
    static public void commandInquiry(){
        requestLine();
        requestCommand(EngineCommands.valueOf(input.nextLine()));
    }
    static public void secondValueInquiry(){
        requestLine();
        requestSecondNumber(input.nextDouble());
    }

}
