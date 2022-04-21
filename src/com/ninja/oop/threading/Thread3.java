package com.ninja.oop.threading;

public class Thread3 extends Thread{

    public void run( ){
        String str = "3 edge solutions private limited";
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                numberCount++;
            }
        }
        System.out.println("Total numbers in the string are  : " + numberCount);
    }
}
