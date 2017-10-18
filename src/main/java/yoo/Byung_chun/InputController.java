package yoo.Byung_chun;

import java.util.Scanner;

/**
 * Created by byung-chunyoo on 4/30/17.
 */
public class InputController {

    private double inNum1;
    private double inNum2;
    private byte opCode;

    public void turnOn() {

        Scanner input = new Scanner(System.in);
        System.out.println("To power on, enter any key");
        String  answer = input.next();
        System.out.println(0);
    }

    public void enterInput ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input number 1 = ");
        this.inNum1 = input.nextDouble();
        System.out.println("Enter Math function number: 1 Addition; 2 Subtraction; 3 Multiplication; 4 Division; \n" +
                "5 Exponent; 6 SquareRoot; 7 Inverse; 8 Invert Sign; 9 Sine; 10 Cosine; 11 Tangent; 12 InverseSine; \n" +
                "13 InverseCosine; 14 InverseTangent; 15 NaturalLog; 16 Log; 17 InverseNaturalLog");
        this.opCode = input.nextByte();
        if(opCode <6){
            System.out.println("Enter input number 2 = ");
            this.inNum2 = input.nextDouble();
        }

    }

    public double getInNum1() {
        return inNum1;
    }

    public double getInNum2() {
        return inNum2;
    }

    public byte getOpCode() {
        return opCode;
    }
}
