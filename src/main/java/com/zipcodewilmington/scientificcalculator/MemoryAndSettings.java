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
    public void switchDisplayMode(){
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
        else if(type == "decimal"){
            currenttypeindex = 2;
        }
        else if(type == "hexadecimal"){
            currenttypeindex = 3;
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
        Console.println(m + " was committed to memory.");
    }

    public void forgetthis(){
        Console.println(rememberedNum + " was forgotten.");
        rememberedNum = 0.0;
        rememberedStr = "0";

    }

    //--------------------------------------------

    //method for the settings menu
    public void select() {

        String x = "";

        while (x != "back") {

            x = Console.getStringInput("What do you want to change?\n" +
                    "(Type 'help' for a list of commands");

            switch (x) {
                case "help":
                    Console.println("switch units:  cycles between radians and degrees\n" +
                            "(unit): changes to type specified.  Replace (unit) with either 'radians' or 'degrees'\n" +
                            "switch type:  Cycles between displaying results in binary, octal, decimal, and hexadecimal\n " +
                            "(type): changes to specified type. Replace (unit) with: 'binary', 'octal, 'decimal, or 'hex'\n" +
                            "back: exits settings");
                    break;

                case "switch units":
                    this.switchUnitsMode();
                    break;

                case "radians":
                    this.switchUnitsMode(x);
                    break;

                case "degrees":
                    this.switchUnitsMode(x);
                    break;

                case "switch type":
                    this.switchDisplayMode();
                    break;

                case "binary":
                    this.switchDisplayMode(x);
                    break;

                case "octal":
                    this.switchDisplayMode(x);
                    break;

                case "decimal":
                    this.switchDisplayMode(x);
                    break;

                case "hex":
                    this.switchDisplayMode(x);
                    break;

                case "back":
                    break;

                default:
                    break;
            }
        }
    }

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
