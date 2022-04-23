package com.ninja.oop.threading.bank;

public class BankMain {
    public static void main(String[] args) {
        Bank b = new Bank();
        Customer1 c1 = new Customer1(b);
        Customer2 c2 = new Customer2(b);
        c2.start();
        c1.start();
    }
}
