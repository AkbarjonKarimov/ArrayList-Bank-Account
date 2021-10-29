package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide","Tim",50.05);
        bank.addCustomer("Adelaide","Mike",175.35);
        bank.addCustomer("Adelaide","Percy",220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bob",150.54);

        bank.addCustomerTransaction("Adelaide","Tim",44.33);
        bank.addCustomerTransaction("Adelaide","Mike",33.22);
        bank.addCustomerTransaction("Adelaide","Jhon",22.33);

        bank.listCustomer("Adelaide",true);
        bank.listCustomer("Sydney",true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne","Brain",5.55)){
            System.out.println("");
        }


    }
}
