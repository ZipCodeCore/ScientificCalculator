package com.zipcodewilmington.scientificcalculator;

public class Error {

    //these methods checks an input value against a series of possible
    //values which could cause an error.

    public boolean IsthisBadValue(Double input, Double[] not_this){

        for (int i = 0 ;i < not_this.length;i++) {

            if (input == not_this[i]) {
                return true;
            }
        }
    return false;
    }

    public boolean IsthisBadValue(Double input, Double not_this){

        if (input == not_this) {
            return true;
        }
        else {
            return false;
        }
    }
}
