package com.ninja.oop;

import java.util.Scanner;

public class AccountDetails3 {
    protected String accountNumber;
    protected double balance;
    protected String accountHolderName;
}
class SavingAccount  extends AccountDetails3 {
    protected double minimumBalance;
}
class FixedAccount  extends SavingAccount {
     int lockingPeriod;
}
class AccountBo {
    public FixedAccount getAccountDetail(String detail){
        String[] values = detail.split(",");
        FixedAccount fa = new FixedAccount();
        fa.accountNumber = values[0];
        fa.balance = Double.parseDouble(values[1]);
        fa.accountHolderName = values[2];
        fa.minimumBalance = Double.parseDouble(values[3]);
        fa.lockingPeriod = Integer.parseInt(values[4]);
        return fa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all details in comma separated values :");
        String details = sc.nextLine();
        AccountBo ab = new AccountBo();
        ab.getAccountDetail(details);
        System.out.println("\nAccount details are :");
        System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
        System.out.format("%-20s %-10s %-20s %-20s %s\n",(ab.getAccountDetail(details)).accountNumber,
                (ab.getAccountDetail(details)).balance,
                (ab.getAccountDetail(details)).accountHolderName,
                (ab.getAccountDetail(details)).minimumBalance,
                (ab.getAccountDetail(details)).lockingPeriod);

    }

}

