package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Memory {
    public Double state =  0.0;

    public Double memoryRecall(){

        return state;
    }

    //Stores input to memory object
    public void memoryPlus(Double input) {
        //We can change this get the input from the console later

        state = input;
    }
    public void memoryClear(){
        state = 0.0;
    }
}
