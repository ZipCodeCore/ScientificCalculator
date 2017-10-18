package yoo.Byung_chun;



/**
 * Created by byung-chunyoo on 4/30/17.
 */
public class CalcMachine {

    private double inNum1;
    private double inNum2;
    private byte opCode;
    private double result = 0;



    public CalcMachine ()
    {
        this.inNum1 = inNum1;
        this.inNum2 = inNum2;
        this.opCode = opCode;
    }

    public void calculateTwoNum (double inNum1, double inNum2, byte opCode)
    {
        switch (opCode) {
            case 1://addition
                result = inNum1 + inNum2;
                break;
            case 2: //subtraction
                result = inNum1 - inNum2;
                break;
            case 3: //multiplication
                result = inNum1 * inNum2;
                break;
            case 4://division, check inNum2 != 0
                if (inNum2 ==0) {
                    throw new ArithmeticException();
                }
                result = inNum1 / inNum2;
                break;
            case 5://pow
                result =Math.pow (inNum1, inNum2);
                break;
        }
    }


    public void calculateOneNum (double inNum1, byte opCode)
    {
        switch (opCode)
        {

            case 6://square root
                result = Math.sqrt(inNum1);
                break;

            case 7://inverse, check inNum1 != 0
                if (inNum1 ==0) {
                throw new ArithmeticException();
                }
                result = 1 / inNum1;
                break;
            case 8://inverse sign
                result = -(inNum1);
                break;
            case 9://sin
                result = Math.sin(inNum1);
                break;
            case 10://cosine
                result = Math.cos(inNum1);
                break;
            case 11://tangent
                result = Math.tan(inNum1);
                break;
            case 12://inverse sin
                result = Math.asin(inNum1);
                break;
            case 13://inverse cosine
                result = Math.acos(inNum1);
                break;
            case 14://inverse tangent
                result = Math.atan(inNum1);
                break;
            case 15://natural log
                result = Math.log(inNum1);
                break;
            case 16://log
                result = Math.log10(inNum1);
                break;
            case 17://inverse natural log
                result = 1 / (Math.log(inNum1));
                break;

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

    public double getResult() {
        return result;
    }

}
