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
    }

    public void setDisplay(float value){
        display = Float.toString(value) ;
    }

    public String getDisplay(){
        return display;
    }

    public void setError(){
        display = "Err";
    }

    public boolean isError(){
        if(getDisplay() == "Err") {
            System.out.println("==Error condition must be cleared before==");
            System.out.println("==any further operation can be attempted==");
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


    //advanced math functions
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






}// end of class Calculator
