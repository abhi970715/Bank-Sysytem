package com.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    private String branchName;
private ArrayList<Branches> branch;
public Bank(String branchName){
    this.branchName=branchName;
    this.branch=new ArrayList<Branches>();
}

    public String getBranchName() {
        return branchName;
    }

    public boolean addBranch(String name){
    if(searchBranch(name)!=null){
        return false;
    }
    branch.add(new Branches(name));
    return true;
}
public boolean addCustomer(String branchName,String customerName,double Amount){
    Branches b=searchBranch(branchName);
    if(b!=null){
        return b.newCustomers(customerName,Amount);
    }
    return false;
}
public boolean addCustomerTransaction(String branchName,String customerName,double Amount){
    Branches b=searchBranch(branchName);
    if(b!=null){
        return b.addTransaction(customerName,Amount);
    }
    return false;
}
private Branches searchBranch(String name){
    for(int i=0;i<branch.size();i++){
        if(branch.get(i).getName().equals(name)){
            return branch.get(i);
        }
    }
    return null;
}
public boolean listCustomer(String branchName,boolean showTransaction){
    Branches b=searchBranch(branchName);
    if(b!=null){
        System.out.println("Cutsomer for Branch "+b.getName());
        ArrayList<Customers> branchCustomer=b.getCustomer();
        System.out.println("Customers");
        for(int i=0;i<branchCustomer.size();i++){
            Customers branchCustomers=branchCustomer.get(i);
            System.out.println(" \n"+(i+1)+"."+branchCustomers.getName());
            if(showTransaction){
                System.out.println("Transactions");
                ArrayList<Double> TList=branchCustomers.getTransactions();
                for(int j=0;j>TList.size();j++)
                System.out.println((j+1)+"."+TList.get(j));
            }
        }
        return true;
    }
    return false;
}

}
