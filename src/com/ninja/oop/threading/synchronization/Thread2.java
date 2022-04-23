package com.ninja.oop.threading.synchronization;

public class Thread2 extends Thread {
    MultiplicationTable m;

    public Thread2(MultiplicationTable m)  {
        this.m = m;
    }

    public void run(){
        try {
            m.printTable(7,"Ravi");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
