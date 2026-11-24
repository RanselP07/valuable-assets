package com.pluralsight;

public abstract class BankAccount implements Valuable{

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public double withdraw(double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            return amount;
        }
        else {
            double withdrawAmount = this.balance;
            this.balance = 0;
            return withdrawAmount;
        }

    }

    public double getBalance() {
        return this.balance;
    }

    @Override
    public double getValue() {
        return this.balance;
    }
}
