package com.ninja.oop.threading;

public class Thread1 extends Thread{

    public void run(){
        String str = "3 edge solutions private limited";
        String[] values = str.split(" ");
        int count = 0;
        for (String value : values) {
            count += value.length();
        }
        System.out.println("Total characters without space are : " + count);
    }

}
