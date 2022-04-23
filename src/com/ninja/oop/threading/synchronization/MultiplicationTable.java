package com.ninja.oop.threading.synchronization;

public class MultiplicationTable {
    public synchronized void printTable(int table, String threadName) throws InterruptedException {
        System.out.println(threadName + " started");
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + table * i);
            Thread.sleep(1500);
        }
        System.out.println(threadName + " ended");
    }
}
