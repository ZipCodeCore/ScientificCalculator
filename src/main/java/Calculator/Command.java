package Calculator;

import java.util.Scanner;

/**
 * Created by randallcrame on 1/13/17.
 */
public class Command {
    static Scanner input= new Scanner(System.in);//.useDelimiter("\\s\\D");
   // static Scanner inputString = new Scanner(System.in);//.useDelimiter("\\s\\d");

    static public void requestNumberLine(){
        System.out.println("Enter Number: ");
    }
    static public void requestCommandLine(){
        System.out.println("Enter Command: ");
    }
    static public void requestFirstNumber(double input) {
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
            requestNumberLine();
            requestFirstNumber(input.nextDouble());
    }
    /*
        do {
        try{
            double row1 = Integer.parseInt(inputStr);
        } catch (NumberFormatException e) //If exception occurred it means user has entered 'e'
        {
            if ("e".equals(inputStr)){
                System.out.println("quiting application");
            }
        }
        Input.setLeftValue(input);
        Input.setNumeralCommand(input);

    } while (Loop != true); */



    static public void commandInquiry(){
        requestCommandLine();
        requestCommand(EngineCommands.valueOf(input.next()));
    }
    static public void secondValueInquiry(){
        requestNumberLine();
        requestSecondNumber(input.nextDouble());
    }

}
