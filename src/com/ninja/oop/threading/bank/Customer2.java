package com.ninja.oop.threading.bank;

public class Customer2 extends Thread{
    Bank b = new Bank();
    public Customer2(Bank b) {
        this.b = b;
    }
    public void run(){
        b.deposit(10000);
    }
}
