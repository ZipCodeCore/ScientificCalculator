package io.zipcoder.Calculator;

/**
 * Created by mollyarant on 4/29/17.
 */
public class MenuLogic {
    Calculator calc ;
    Instruction instruction;
    boolean run=true;

    public MenuLogic(){
        calc = new Calculator();
        instruction= new Instruction();


    }

    public boolean getRun(){
        return run;
    }

    public void setRun(boolean newRun){
        run= newRun;
    }


    public void menuChoice (int choice){
        switch(choice){
            case 1:
                performAddition();
                break;

            case 2:
                performSubtraction();
                break;

            case 3:
                performMultiplication();
                break;

            case 4:
                performDivision();
                break;

            case 5:
                performSquareRoot();
                break;

            case 6:
               performSquare();
                break;

            case 7:
                performVariableExponentiation();
                break;

            case 8:
                performInverse();
                break;

            case 9:
                performAdditiveInverse();
                break;

            case 10:
                setRun(false);
                break;

            default:
                System.out.println("Please input a number between 1 and 10");
                break;
        }
    }

    private void performAddition(){
        int x , y;
        x = instruction.TellOneNumber();
        y = instruction.TellOneNumber();
        calc.add(x, y);
    }

    private double performSubtraction(){
        int x , y;
        x = instruction.TellOneNumber();
        y = instruction.TellOneNumber();
        return calc.subtract(x, y);
    }

    private double performMultiplication(){
        int x , y;
        x = instruction.TellOneNumber();
        y = instruction.TellOneNumber();
        return calc.multiply(x, y);
    }

    private double performDivision(){
        int x , y;
        x = instruction.TellOneNumber();
        y = instruction.TellOneNumber();
        return calc.divide(x, y);
    }

    private double performSquareRoot(){
        int x;
        x = instruction.TellOneNumber();
        return calc.calculateSquareRoot(x);
    }

    private double performSquare(){
        int x;
        x = instruction.TellOneNumber();
        return calc.calculateSquareNumber(x);
    }

    private double performVariableExponentiation(){
        int x,y;
        x = instruction.TellOneNumber();
        y = instruction.TellOneNumber();
        return calc.calculateVariableExponentiation(x,y);
    }

    private double performInverse(){
        int x;
        x = instruction.TellOneNumber();
        return calc.calculateInverse(x);
    }

    private double performAdditiveInverse(){
        int x;
        x = instruction.TellOneNumber();
        return calc.calculateAdditiveInverse(x);
    }















}
