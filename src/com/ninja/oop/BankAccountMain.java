package com.ninja.oop;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Account Type\n1.Savings Account\n2.Current Account\n");
        System.out.print("Enter your choice :");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)\n");
                sc.nextLine();
                String[] values = sc.nextLine().split(",");
                SavingsAccount sa = new SavingsAccount(values[0], values[1], values[2], values[3]);
                sa.displaySaving();
                break;
            case 2:
                System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN number)\n");
                sc.nextLine();
                String[] values1 = sc.nextLine().split(",");
                CurrentAccount ca = new CurrentAccount(values1[0], values1[1], values1[2], values1[3]);
                ca.displayCurrent();
                break;
            default:
                System.out.println("Invalid ");
                break;
        }

    }
}
