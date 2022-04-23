package com.ninja.oop.threading.bank;

public class Customer1 extends  Thread{
    Bank b = new Bank();
    public Customer1(Bank b) {
        this.b = b;
    }
    public void run(){
        try {
            b.withdraw(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
