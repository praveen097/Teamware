package com.ninja.oop.threading;

import java.util.Scanner;

public class ThreadMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();
        System.out.println("Original string is : '3 edge solutions private limited' ");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
