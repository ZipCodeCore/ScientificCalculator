package dedeus.roberto.project1calculator;

/**
 * Created by robertodedeus on 9/11/16.
 */
public class Memory {

    private double recallValue;

    Memory(){
        this.recallValue = 0;
    }

    public double getRecallValue(){
        return this.recallValue;
    }

    public void clearRecallValue(){
        this.recallValue = 0;
    }

    public void setRecallValue(double newMemory){
        this.recallValue = newMemory;
    }


}
