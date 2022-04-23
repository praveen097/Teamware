package com.ninja.oop.threading.bank;

public class Bank {
    double amount = 10000;
    public synchronized void withdraw(double amount) throws InterruptedException {
        System.out.println("Account balance is : " + this.amount);
        System.out.println("Amount going to be withdrawn is : " + amount);
        if(this.amount < amount){
            System.out.println("Withdraw amount is greater than available balance");
            System.out.println("Waiting for deposit!");
            wait();
        }
        this.amount -= amount;
        System.out.println(amount + " is withdrawn successfully\nTransaction complete");
        System.out.println("Current available balance is : " + this.amount);

    }
    public synchronized void deposit(double amount) {
        System.out.println("Current Balance is : " + this.amount);
        System.out.println("Amount you are going to deposit are : " + amount);
        this.amount += amount;
        System.out.println("Deposited successfully!");
        System.out.println("Amount balance is : " + this.amount);
        notify();
    }
}
