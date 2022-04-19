package com.ninja.oop.string;

import java.util.Scanner;

public class AddressComparision {
    public static String addresses(String address1, String address2){
        if(address1.equals(address2))
            return "RED";
        if(address1.equals(address2.replaceAll("\\s","")))
            return "YELLOW";
        if(address1.equalsIgnoreCase(address2))
            return "BLUE";
        return "GREEN";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter address 1 :");
        String address1 = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter address 2 :");
        String address2 = sc.nextLine();
        System.out.println(addresses(address1,address2));
    }
}
