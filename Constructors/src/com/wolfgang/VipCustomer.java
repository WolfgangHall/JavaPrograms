package com.wolfgang;

/**
 * Created by johna on 12/15/2016.
 */
public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String customerEmail;

    public VipCustomer() {
        this("Jack", 50d, "jack@email.com");
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "default@email.com");
        this.customerName = customerName;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String customerName, double creditLimit, String customerEmail) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
