package com.ninja.oop.threading.prime;

public class SetNumber extends Thread{
    SetPrime sp;
    public SetNumber(SetPrime sp){
        this.sp = sp;
    }
    public void run(){
        System.out.println("Total count is set to 10");
        try {
            sp.set(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
