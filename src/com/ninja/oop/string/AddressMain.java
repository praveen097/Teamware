package com.ninja.oop.string;

import java.util.Scanner;

public class AddressMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of users : ");
        int n = sc.nextInt();
        String[] str = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
            Address ad = new Address();
            ad.setValues(str[i]);
        }
    }
}
