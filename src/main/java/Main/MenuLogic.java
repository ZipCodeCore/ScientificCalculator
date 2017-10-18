package Main;

/**
 * Created by jennifermcginty on 4/29/17.
 */
public class MenuLogic {
        BasicCalculator calc;
        UserInput input;
        AdvancedCalculator advanced;
        Instruction directions;


     public MenuLogic() {
        calc = new BasicCalculator();
        input = new UserInput();
        advanced = new AdvancedCalculator();
        directions = new Instruction();
     }

    public void menuChoice(int choice){

        switch(choice){

            case 1:
                performAddtion();
                break;

            case 2 :
                performSubtraction();
                break;

            case 3 :
                performMultiply();
                break;

            case 4 :
                performDivide();
                break;

            case 5 :
                performSquare();
                break;

            case 6:
                performSquareRoot();
                break;

            case 7:
                performExponents();
                break;

            case 8:
                performInversion();
                break;
        }
    }

    private double performAddtion(){
        double a , b;

        directions.printNumberInstructions();
        a = input.takeUserInt();

        directions.printNumberInstructions();
        b = input.takeUserInt();

        directions.printAnswer();
        return calc.addNums( a , b);
    }

    private double performSubtraction(){
        double a,  b;

        directions.printNumberInstructions();
        a = input.takeUserInt();

        directions.printNumberInstructions();
        b = input.takeUserInt();

        directions.printAnswer();
        return calc.subNums(a,b);
    }

    private double performMultiply(){
        double a, b;

        directions.printNumberInstructions();
        a = input.takeUserInt();

        directions.printNumberInstructions();
        b = input.takeUserInt();

        directions.printAnswer();
        return calc.multiNums(a,b);
    }

    private double performDivide(){
        double a, b;

        directions.printNumberInstructions();
        a = input.takeUserInt();

        directions.printNumberInstructions();
        b = input.takeUserInt();

        directions.printAnswer();
        return calc.divideNum(a,b);
    }

    private double performSquare(){
        double a;

        directions.printNumberInstructions();
        a = input.takeUserInt();

        directions.printAnswer();
        return advanced.square(a);
    }

    private double performSquareRoot(){
        double a;

        directions.printNumberInstructions();
        a = input.takeUserInt();

        directions.printAnswer();
        return advanced.squareRoot(a);
    }

    private double performExponents(){
        double a, b;

        directions.printNumberInstructions();
        a = input.takeUserInt();

        directions.printNumberInstructions();
        b = input.takeUserInt();

        directions.printAnswer();
        return advanced.exponents(a,b);
    }

    private int performInversion(){
        int a, b;

        directions.printNumberInstructions();
        a = input.takeUserInt();

        b= -1;

        directions.printAnswer();
        return advanced.inverse(a,b);
    }
}

