package com.ninja.oop;

import java.util.Scanner;

public class FairMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fair fair = new Fair();
        System.out.print("Enter the Item Type Name : ");
        String name = sc.nextLine();
        System.out.print("Enter the Deposit Amount : ");
        double deposit = sc.nextDouble();
        System.out.print("Enter the Item Type Name : ");
        double cost = sc.nextDouble();
        fair.setName(name,deposit,cost);
        fair.getStudentInfo();
    }
}
