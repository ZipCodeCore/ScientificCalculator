package com.zipcodewilmington.scientificcalculator;

public class MemoryAndSettings {

    //fields
    private Double rememberedNum;
    private String rememberedStr;

    private String bodh;
    private String radordeg;
    private String[] displaytype = {"binary", "octal","decimal","hexadecimal"};

    //constructor
    public MemoryAndSettings() {
        rememberedNum = 0.0;
        rememberedStr = "0";
        bodh = "decimal";
        radordeg = "rad";
    }

    //methods

    //for setting the type (binary, octal, decimal, hexadecimal)
    public void switchDisplayMode(){

    }

    public void switchDisplayMode(String type){

    }

    //--------------------------------------------

    //for setting the units (radians or degrees)
    public void switchUnitsMode(){

    }

    public void switchUnitsMode(String type){

    }

    //--------------------------------------------

    //for M+, MC, and MRC functions
    public void rememberthis(){

    }

    public void forgetthis(){

    }
    public void recallthis(){

    }

    //--------------------------------------------

    //getters and setters
    public String getBodh() {
        return bodh;
    }

    public String getRadordeg() {
        return radordeg;
    }

    public void setBodh(String bodh) {
        this.bodh = bodh;
    }

    public void setRadordeg(String radordeg) {
        this.radordeg = radordeg;
    }
}
