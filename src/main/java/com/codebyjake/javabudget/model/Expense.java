package com.codebyjake.javabudget.model;

import java.util.Date;

public class Expense {
    private String Name;
    private double Amount;
    private String dueDate;
    private int Frequency;

    public Expense() {}
    public Expense(String name, double amount, String dueDate, int frequency) {
        Name = name;
        Amount = amount;
        this.dueDate = dueDate;
        Frequency = frequency;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getFrequency() {
        return Frequency;
    }

    public void setFrequency(int frequency) {
        Frequency = frequency;
    }

    @Override
    public String toString() {
        return (Name + " " + "$" + Amount + " " + dueDate + " every " + Frequency + " week(s)");
    }
}


