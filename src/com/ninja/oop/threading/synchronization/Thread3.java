package com.ninja.oop.threading.synchronization;

public class Thread3 extends Thread {
    MultiplicationTable m;

    public Thread3(MultiplicationTable m) throws InterruptedException {
        this.m = m;
    }


    public void run(){
        try {
            m.printTable(11,"Rahul");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
