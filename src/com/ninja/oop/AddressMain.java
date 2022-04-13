package com.ninja.oop;

import java.util.Scanner;

public class AddressMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Address Line 1 : ");
        String addressLine1 = sc.nextLine();
        System.out.print("Enter Address Line 2 : ");
        String addressLine2 = sc.nextLine();
        System.out.print("Enter the City Name : ");
        String city = sc.nextLine();
        System.out.print("Enter the State Name : ");
        String state = sc.nextLine();
        System.out.print("Enter the Pin code : ");
        int pin = sc.nextInt();
        Address add = new Address(addressLine1,addressLine2,city,state,pin);
        System.out.println(add);

    }
}
