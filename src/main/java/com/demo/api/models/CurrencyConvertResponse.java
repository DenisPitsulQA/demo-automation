package com.demo.api.models;

public class CurrencyConvertResponse {
    private String base;
    private int amount;
    private USD_CNY_Result result;
    private int ms;

    public CurrencyConvertResponse(String base, int amount, USD_CNY_Result result, int ms) {
        this.base = base;
        this.amount = amount;
        this.result = result;
        this.ms = ms;
    }

    public CurrencyConvertResponse() {
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public USD_CNY_Result getResult() {
        return result;
    }

    public void setResult(USD_CNY_Result result) {
        this.result = result;
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    @Override
    public String toString() {
        return "CurrencyConvertResponse{" +
                "base='" + base + '\'' +
                ", amount=" + amount +
                ", result=" + result +
                ", ms=" + ms +
                '}';
    }
}
