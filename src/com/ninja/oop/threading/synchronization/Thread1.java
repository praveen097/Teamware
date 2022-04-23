package com.ninja.oop.threading.synchronization;

public class Thread1 extends Thread{
    MultiplicationTable m;

    public Thread1(MultiplicationTable m){
        this.m = m;
    }


    public void run(){
        try {
            m.printTable(4,"Praveen");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
