package com.ninja.oop.threading.prime;

import java.util.Scanner;

public class PrintPrime extends Thread{
    SetPrime sp;
    public PrintPrime(SetPrime sp){
        this.sp = sp;
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter range  : ");
        sp.print(sc.nextInt());
    }
}
