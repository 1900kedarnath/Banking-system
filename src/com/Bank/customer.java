package com.Bank;

public class customer {
    private String accountNumber;
    private int pin;
    private String mobileNumber;
    private double balance;

    customer() {
    }

    customer(String accountNumber, int pin) {
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    public void savemobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;

    }

    public String findmobileNumber() {
        return this.mobileNumber;
    }

    public void depositemoney(double balance) {
        this.balance = balance;
    }

    public double findbalance() {
        return this.balance;
    }

    public int findpin() {
        return this.pin;
    }
}
