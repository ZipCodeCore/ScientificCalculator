package com.brownmark;



public class LogarithmFunctionEngine {



    public LogarithmFunctionEngine() {};



    public double logFunction (double operandOne) {return Math.log10(operandOne);}
    public double inverseLogFunction (double operandOne) {return Math.pow(10, operandOne);}
    public double naturalLogFunction (double operandOne) {return Math.log(operandOne);}
    public double inverseNaturalLogFunction (double operandOne) {return Math.exp(operandOne);}



}
