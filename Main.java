package com.example;

public class Main {

    public static void main(String[] args) {
	Bank bank=new Bank("State Bank Of India");

	bank.addBranch("Indirapuram");
	    bank.addCustomer("Indirapuram","Abhishek Jha",3000);
	    bank.addCustomerTransaction("Indirapuram","Abhishek Jha",1000);
		bank.addCustomerTransaction("Indirapuram","Abhishek Jha",3000);
		bank.addCustomerTransaction("Indirapuram","Abhishek Jha",5000);
		bank.addCustomer("Indirapuram","Ananya Jha",3000);
		bank.addCustomer("Indirapuram","Anita Jha",3000);
	    bank.listCustomer("Indirapuram",true);
    }
}
