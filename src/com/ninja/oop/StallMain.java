package com.ninja.oop;

import java.util.Scanner;

public class StallMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the stall category: ");
        String nameOfStall = sc.nextLine();
        System.out.println("Enter the details of the stall category: ");
        String details = sc.nextLine();
        System.out.println("Details of the stall category:");
        Stall stall = new Stall();
        stall.display();

        Stall stall1 = new Stall(nameOfStall,details);
        stall1.display();
    }
}
