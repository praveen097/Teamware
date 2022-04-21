package com.ninja.oop.string;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddressMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of users : ");
        int n = sc.nextInt();
        String[] str = new String[n];
        AddressMid am = new AddressMid();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
            am.setAddress(str[i]);
        }
        System.out.format("%-15s %-15s %-15s %s\n", "User ID","Street","City","State");
        List<Address> ans = am.getDetails();
        for (Address e : ans){
            System.out.format("%-15s %-15s %-15s %s\n", e.getUserId(),
                    e.getStreet(),e.getCity(),e.getState());

        }
    }
}
