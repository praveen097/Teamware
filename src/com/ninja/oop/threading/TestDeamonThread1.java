package com.ninja.oop.threading;

public class TestDeamonThread1 extends Thread {
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("It is a deamon thread!");
        }else{
            System.out.println("It is a user thread");
        }
    }

    public static void main(String[] args) {
        TestDeamonThread1 t1 = new TestDeamonThread1();
        TestDeamonThread1 t2 = new TestDeamonThread1();
        TestDeamonThread1 t3 = new TestDeamonThread1();

        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
