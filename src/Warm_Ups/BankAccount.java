package Warm_Ups;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/*
Create a new class for a bank account
Create fields for the account number, balance, customer name, email and phone number

Create getters and setters for each field
Create two additional method
1. To allow the customer to deposit funds (this should increment the balance field)
2. To allow the customer to withdraw funds. this should deduct from the balance field

but not allow the the withdrawal to complete if theirs are insufficient funds
You will want to create various code in the Main class to confirm your code is working
Add some system.out.println in the two methods above as well
 */
public class BankAccount {
    String accountNumber;
    double balance;
    String customerName;
    String email;
    long phoneNumber;

    public BankAccount(){
        this("215465", 2.50, "Erfan", "Erfan@email.com", 645789156);
        System.out.println("Empty constructor called");
    }
    public BankAccount(String accountNumber, double balance, String customerName, String email, long phoneNumber){
        System.out.println("BankAccount constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }


    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is: " + balance);
    }

    public void withdraw(double withdrawAmount){
        if(this.balance-withdrawAmount<= 0){
            System.out.println("Only " + balance + " available. Withdrawal not processed" );
        }else{
            balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance: " + balance);
        }
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }




}
