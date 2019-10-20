package com.zipcodewilmington.scientificcalculator;

public class MemoryAndSettings {

    //fields
    private Double rememberedNum;
    private String rememberedStr;

    private String bodh;
    private String radordeg;
    private String[] displaytype = {"binary", "octal","decimal","hexadecimal"};
    private int currenttypeindex;



    //constructor
    public MemoryAndSettings() {
        rememberedNum = 0.0;
        rememberedStr = "0";
        currenttypeindex = 2;
        bodh = displaytype[currenttypeindex];
        radordeg = "rad";
    }

    //methods

    //for setting the type (binary, octal, decimal, hexadecimal)
    public void nextDisplayMode(){
        if(currenttypeindex >= 3){
            currenttypeindex = 0;
        }
        else{
            currenttypeindex++;
        }
        bodh = displaytype[currenttypeindex];
        Console.print("Current type is " + bodh);
    }

    public void switchDisplayMode(String type){
        if (type == "binary"){
            currenttypeindex = 0;
        }
        else if(type == "octal"){
            currenttypeindex = 1;
        }
        else if(type == "hexadecimal"){
            currenttypeindex = 3;
        }
        else{
            currenttypeindex = 2;
            Console.print("Automatically set to decimal.");
        }
        bodh = displaytype[currenttypeindex];
        Console.print("Current type is " + bodh);

    }

    //--------------------------------------------

    //for setting the units (radians or degrees)
    public void switchUnitsMode(){
        if (radordeg == "radians"){
            radordeg = "degrees";
        }
        else{
            radordeg = "radians";
        }
        Console.print("Set units to " + radordeg);
    }

    public void switchUnitsMode(String type){
        if (type == "degrees"){
            radordeg = "degrees";
        }
        else if(type == "radians"){
            radordeg = "radians";
        }
        Console.print("Set units to " + radordeg);
    }

    //--------------------------------------------

    //for M+, MC, and MRC functions
    public void rememberthis(Double m){
        rememberedNum = m;
        rememberedStr = Double.toString(m);
        Console.print(m + " was committed to memory.");
    }

    public void forgetthis(){
        Console.println(rememberedNum + " was forgotten.");
        rememberedNum = 0.0;
        rememberedStr = "0";

    }

    //--------------------------------------------

    //getters and Setters
    public String getBodh() {
        return bodh;
    }

    public String getRadordeg() {
        return radordeg;
    }

    public Double getRememberedNum() {
        return rememberedNum;
    }

    public String getRememberedStr() {
        return rememberedStr;
    }

    public void setRememberedNum(Double rememberedNum) {
        this.rememberedNum = rememberedNum;
    }

    public void setRememberedStr(String rememberedStr) {
        this.rememberedStr = rememberedStr;
    }
}
