package prahl.daniel;

/**
 * Created by danielprahl on 4/29/17.
 */
public class Calculator {

    private String display;
    private float memory;
    //private boolean isError; // flag not needed, just test for existing string "Err" in display
    private boolean memoryOccupied;

    //constructor
    public Calculator(){
        clearDisplay();
        memoryClear();
    }


    //core display methods
    public void clearDisplay(){
        setDisplay(0.0f);
        //isError = false; // flag not needed, just test for existing string "Err" in display
    }

    public void setDisplay(float value){
        display = Float.toString(value) ;
    }

    public String getDisplay(){
        return display;
    }

    public void setError(){
        display = "Err";
        //isError = true; // flag not needed, just test for existing string "Err" in display
    }

    public boolean isError(){
        if(getDisplay() == "Err") {
            System.out.println("== Error condition must be cleared before ==");
            System.out.println("== any further operation can be attempted ==");
            return true;
        }else{
            return false;
        }
    }


    // basic math functions
    public void add(float operand){
        if( !isError() ){
            setDisplay( (Float.parseFloat(getDisplay())) + operand);
        }
    }

    public void subtract(float operand){
        if( !isError() ){
            setDisplay( (Float.parseFloat(getDisplay())) - operand);
        }
    }

    public void multiply(float operand){
        if( !isError() ){
            setDisplay( (Float.parseFloat(getDisplay())) * operand);
        }
    }

    public void divide(float operand){
        if( !isError() ){
            if(operand == 0.0f || Float.parseFloat(getDisplay()) == 0.0f) {
                setError();
                System.out.println("Error - Division by 0 is undefined");
            }else{
                setDisplay((Float.parseFloat(getDisplay())) / operand);
            }
        }
    }

    public void square(){
        if( !isError() ){
            setDisplay( (Float.parseFloat(getDisplay())) * Float.parseFloat(getDisplay()));
        }
    }

    public void squareRoot(){
        if( !isError() ){
            setDisplay( (float) Math.sqrt(Float.parseFloat(getDisplay())) );
        }
    }

    public void raiseTo(float operand){
        if( !isError() ){
            setDisplay( (float) Math.pow(Float.parseFloat(getDisplay()), operand) );
        }
    }

    public void inverse(){
        if( !isError() ){
            setDisplay( 1 / Float.parseFloat(getDisplay()) );
        }
    }

    public void switchSign(){
        if( !isError() ){
            setDisplay( -1.0f * Float.parseFloat(getDisplay()) );
        }
    }


    // advanced math functions
    // memory slot
    public void memoryAdd(){
        if( !isError() ) {
            memory += Float.parseFloat(getDisplay());
            memoryOccupied = true;
        }
    }

    public void memoryClear(){
        memory = 0.0f;
        memoryOccupied = false;
    }

    public void memoryRecall(){
        setDisplay(memory);
    }


    // Trig functions
    public void sine(){
        if( !isError() ){
            setDisplay( (float) Math.sin(Float.parseFloat(getDisplay())) );
        }
    }

    public void cosine(){
        if( !isError() ){
            setDisplay( (float) Math.cos(Float.parseFloat(getDisplay())) );
        }
    }

    public void tangent(){
        if( !isError() ){
            setDisplay( (float) Math.tan(Float.parseFloat(getDisplay())) );
        }
    }

    public void inverseSine(){
        if( !isError() ){
            setDisplay( (float) Math.asin(Float.parseFloat(getDisplay())) );
        }
    }

    public void inverseCosine(){
        if( !isError() ){
            setDisplay( (float) Math.acos(Float.parseFloat(getDisplay())) );
        }
    }

    public void inverseTangent(){
        if( !isError() ){
            setDisplay( (float) Math.atan(Float.parseFloat(getDisplay())) );
        }
    }


    // Logarithmic functions


    // Factorial

    public void factorial(){
        if( !isError()) {
            float sum = 1.0f;
            if (Float.parseFloat(getDisplay()) <= -1.0) {
                for (float i = Float.parseFloat(getDisplay()); i <= -1; i++) {
                    sum *= i;
                }
                setDisplay(sum);
            } else if (Float.parseFloat(getDisplay()) >= 1.0f) {
                for (float j = Float.parseFloat(getDisplay()); j >= 1; j--) {
                    sum *= j;
                }
                setDisplay(sum);
            } else {
                setError();
            }
        }
    }






}// end of class Calculator
