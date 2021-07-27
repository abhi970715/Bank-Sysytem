package com.example;

import java.util.ArrayList;

public class Branches {
    private String name;
   private ArrayList<Customers> customer;
   public Branches(String name){
       this.name=name;
       this.customer=new ArrayList<Customers>();
   }

    public String getName() {
        return name;
    }

    public boolean newCustomers(String name,double initialAmount) {

        if (find(name) == null){
            customer.add(new Customers(name, initialAmount));
        return true;
    }
            else{
                return false;
            }

   }
   public boolean addTransaction(String name,double newTransaction){
      Customers existingCustomer=find(name);
       if(existingCustomer==null){
           return false;
       }
       else{
           existingCustomer.addTransaction(newTransaction);
           return true;
       }
   }
   private Customers find(String name) {
       for (int i = 0; i < customer.size(); i++) {
           if (customer.get(i).getName().equals(name)) {
               return customer.get(i);
           }
       }
       return null;
   }

    public ArrayList<Customers> getCustomer() {
        return customer;
    }
}
