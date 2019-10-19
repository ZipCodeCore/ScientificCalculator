package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;

public class Statistics1Var {

    private Double[] data;
    private Double mean;
    private Double median;
    private Double mode;
    private Double stdDev;
    private Double var;
    private Integer n;
    private String output;

    public Statistics1Var() {

        this.data = {};
        this.mean = null;
        this.median = null;
        this.mode = null;
        this.stdDev = null;
        this.var = null;
        this.n = 0;
        this.output = "No data entered";
    }

    // Getters
    public Double[] getData() {
        return data;
    }

    public Double getMedian() {
        return median;
    }

    public Double getMode() {
        return mode;
    }

    public Double getStdDev() {
        return stdDev;
    }

    public Double getVar() {
        return var;
    }

    public Integer getN() {
        return n;
    }

    public String getOutput() {
        return output;
    }

    // Setter

    public void setData(Double[] data) {
        this.data = data;
        this.calculateStatistics();
    }

    // Core logic

    public String calculateStatistics() {

        this.mean = this.calcMean();
        this.median = this.calcMedian();
//        this.mode = null;
//        this.stdDev = null;
//        this.var = null;
        this.n = data.length;
        this.output = "No data entered";
    }

    public Double calcMean() {
        if (data.length > 0) {
            Double total = 0.0;
            for (Double datum : data) {
                total += datum;
            }
            return total / data.length;
        } else {
            return null;
        }
    }

    public Double calcMedian() {
        Arrays.sort(data);
        Integer n = data.length;
        if (n % 2 == 0) {
            return (data[n / 2] + data[n / 2 + 1]) / 2;
        } else {
            return data[n/2];
        }
    }
}
