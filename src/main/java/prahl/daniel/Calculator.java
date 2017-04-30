package prahl.daniel;

/**
 * Created by danielprahl on 4/29/17.
 */
public class Calculator {

    private String display;

    //constructor
    public Calculator(){
        clearDisplay();
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


    //advanced math functions



}// end of class Calculator
