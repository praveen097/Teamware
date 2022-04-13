package com.ninja.oop;

import java.util.Scanner;

public class TradeFair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of people : ");
        int n = sc.nextInt();
        System.out.println("Number of attendees on day 1 : "  + Math.round(n * 0.2857));
        System.out.println("Number of attendees on day 2 : " + Math.round(n * 0.5714));
        System.out.println("Number of attendees on day 3 : " + Math.round(n * 0.14285));
    }
}
