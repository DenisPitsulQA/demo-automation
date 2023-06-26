package com.demo.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class USD_CNY_Result {
    @JsonProperty(value = "CNY")
    private double CNY;
    private double rate;

    public USD_CNY_Result(double CNY, double rate) {
        this.CNY = CNY;
        this.rate = rate;
    }

    public USD_CNY_Result() {
    }

    public double getCNY() {
        return CNY;
    }

    public void setCHY(double CNY) {
        this.CNY = CNY;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "USD_CNY_Result{" +
                "CNY=" + CNY +
                ", rate=" + rate +
                '}';
    }
}
