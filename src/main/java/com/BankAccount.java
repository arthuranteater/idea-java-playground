package com;

//The class should have the following methods and corresponding behavior:
//
//deposit(long cents): Adds cents to the bank account
//withdraw(long cents): Removes cents from the bank account
//balance(): Returns the current balance on the bank account
//isOverDrawn(): Returns true if the balance on the account is negative

public class BankAccount {
    public String name;
    public long balance;

    public long balance() {
        return balance;
    }

    public void deposit(long cents) {
        balance = balance + cents;
    }

    public void withdraw(long cents) {
        balance = balance - cents;
    }

    public boolean isOverDrawn() {
        if (balance < 0) {
            return true;
        }
        return false;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
