package io.AlejandroLondono;

/**
 * Created by alejandrolondono on 4/29/16.
 */
public class Kanye {

    public String display = "";
    public double memory = 0;
    public double inputOne = 0;
//    public double inputTwo = 0;

    public void startEq(double input){
        this.inputOne = input;
    }

    public double add(double input){
        return this.inputOne + input;
    }

    public double subtract(double input){
        return this.inputOne - input;
    }

    public double divide(double input){
//        return this.inputOne/input;
        return 0;
    }
}
