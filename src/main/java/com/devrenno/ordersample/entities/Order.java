package com.devrenno.ordersample.entities;

public class Order {

    private int code;

    private double basicValue;

    private double discount;

    public Order(int code, double basicValue, double discount) {
        this.code = code;
        this.basicValue = basicValue;
        this.discount = discount;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBasicValue() {
        return basicValue;
    }

    public void setBasicValue(double basicValue) {
        this.basicValue = basicValue;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
