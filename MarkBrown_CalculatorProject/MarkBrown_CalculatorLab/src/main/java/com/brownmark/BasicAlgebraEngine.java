package com.brownmark;


public class BasicAlgebraEngine {


    public BasicAlgebraEngine() {}


    public double square (double operandOne) {return operandOne * operandOne;}
    public double reciprocal (double operandOne) {return (1 / operandOne);}
    public double squareRoot (double operandOne) {return Math.sqrt(operandOne);}


    public double add (double operandOne, double operandTwo) {return operandOne + operandTwo;}
    public double subtract (double operandOne, double operandTwo) {return operandOne - operandTwo;}
    public double multiply (double operandOne, double operandTwo) {return operandOne * operandTwo;}
    public double divide (double operandOne, double operandTwo) {return operandOne / operandTwo;}



}

