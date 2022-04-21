package com.ninja.oop.threading;

public class Thread2 extends Thread{

    public void run(){
        String str = "3 edge solutions private limited";
        int vowelCount = 0;
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vowelCount++;
                if(str.charAt(i) == 'a'){
                    countA++;
                }else if(str.charAt(i) == 'e'){
                    countE++;
                }else if(str.charAt(i) == 'o'){
                    countO++;
                }else if(str.charAt(i) == 'i'){
                    countI++;
                }else{
                    countU++;
                }

            }
        }
        System.out.println("There are " + vowelCount + " vowels in the given string");
        System.out.println("Individual count are as below : ");
        System.out.println("Count of A :" + countA + " \nCount of E :" + countE + " \nCount of I :" + countI +
                " \nCount of O :" + countO + " \nCount of U :" + countU);
    }
}
