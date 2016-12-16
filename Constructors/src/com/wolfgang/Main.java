package com.wolfgang;

public class Main {

    public static void main(String[] args) {

        // if you have defined a constructor you cannot use the default constructor

     BankAccount myBankAccount = new BankAccount(1234, 10d, "Wolfgang",
             "wolf@email.com", 2012321213);

//     myBankAccount.setAccountNumber(1234);
//     myBankAccount.setBalance(10d);
//     myBankAccount.setCustomerName("Wolfgang");
//     myBankAccount.setEmail("wolf@email.com");
//     myBankAccount.setPhoneNumber(2019092342);

        System.out.println("Customer name: " + myBankAccount.getCustomerName());
        System.out.println("Customer balance: " + myBankAccount.getBalance());
        System.out.println("Account number: " + myBankAccount.getAccountNumber());
        System.out.println("Customer email " + myBankAccount.getEmail());
        System.out.println("Customer phone: " + myBankAccount.getPhoneNumber());

        myBankAccount.depositFunds(10);

        myBankAccount.withdrawFunds(5);

        myBankAccount.withdrawFunds(17);

        myBankAccount.depositFunds(-3);

        VipCustomer jackCustomer = new VipCustomer();
        System.out.println(jackCustomer.getCreditLimit() + jackCustomer.getCustomerName() + jackCustomer.getCustomerEmail());


        VipCustomer twoCustomer = new VipCustomer("Markus", 60d);
        System.out.println(twoCustomer.getCreditLimit() + twoCustomer.getCustomerName() + twoCustomer.getCustomerEmail());


        VipCustomer threeCustomer = new VipCustomer("Ken", 70d, "ken@email.com");
        System.out.println(threeCustomer.getCreditLimit() + threeCustomer.getCustomerName() + threeCustomer.getCustomerEmail());


    }
}
