package com.wolfgang;

/**
 * Created by johna on 12/15/2016.
 */
public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(1289543, 30d, customerName,email, phoneNumber);
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositFunds(double deposit){
        if (deposit > 0) {
            this.balance += deposit;
            System.out.println("Your balance is now " + this.balance);
        } else {
            System.out.println("You can't make a negative deposit");
        }
    }

    public void withdrawFunds(double withdrawal){
        if (this.balance > withdrawal) {
            this.balance -= withdrawal;
            System.out.println("Your balance is now " + this.balance);
        } else {
            System.out.println("You have insufficient funds");
        }

    }
}
