package Calculator;

/**
 * Created by randallcrame on 1/16/17.
 */
public class CalculatorEngine {

    static public void executeEquations() {
        switch (Storage.storeEngineCommand) {
            case ERR: break;
            case CLEAR: return;
            case EXIT: return;
            case SQU: Square.calculate(); break;
            case SQR: SquareRoot.calculate();break;
            case INV: Inverse.calculate(); break;
            case ADD: Add.calculate(); break;
            case SUB: Subtract.calculate(); break;
            case DIV: Divide.calculate(); break;
            case MUL: Multiple.calculate(); break;
            case EXP: Exponential.calculate();break;
            case IVR: Invert.calculate();break;
            default:

        }

    }
    static public void executeStateCommands( EngineCommands input){
        switch(input) {
            case ERR: break;
            case CLEAR: return;
            case EXIT: return;
        }
    }
 }

    /* public void executeClearCommand(){
        switch (engineCommand) {
            case MRC:
                Input.getSingleMemory();
                display.g

            case MC:
            case MM:    //M+
            default:
*/



