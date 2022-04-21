package com.ninja.oop.threading;

public class Thread4 extends Thread{
    public void run(){
        String str = "3 edge solutions private limited";
        String[] values = str.split(" ");
        System.out.println("Total words in the string are : " + values.length);
    }
}
