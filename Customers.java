package com.example;

import java.util.ArrayList;

public class Customers {
    private String name;
    private ArrayList<Double> transactions;
    public Customers(String name,double initialTransaction){
        this.name=name;
        this.transactions=new ArrayList<Double>();
        addTransaction(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction( double newTransaction){
     transactions.add(Double.valueOf(newTransaction));
    }
}
