package com.ninja.oop;

import java.util.Scanner;

public class Expenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter branding expenses :");
        double branding = sc.nextDouble();
        System.out.println("Enter travel expenses :");
        double travel = sc.nextDouble();
        System.out.println("Enter food expenses :");
        double food = sc.nextDouble();
        System.out.println("Enter logistics expenses :");
        double logistic = sc.nextDouble();
        double total = branding + travel + food + logistic;
        System.out.println("Total expenses : " + total);
        System.out.printf("Branding expenses percentage  : %.2f", (branding / total) * 100  );
        System.out.println("%");
        System.out.printf("Travel expenses percentage  : %.2f", (travel / total) * 100);
        System.out.println("%");
        System.out.printf("Food expenses percentage  : %.2f", (food / total) * 100);
        System.out.println("%");
        System.out.printf("Logistics expenses percentage   : %.2f", (logistic / total) * 100);
        System.out.println("%");
   }
}
