package com.ninja.oop;

public class Account {
    protected String accName;
    protected String accNo;
    protected String bankName;

    protected void display(){
        System.out.println("Account name is : " + this.accName);
        System.out.println("Account number is : " + this.accNo);
        System.out.println("Bank name is : " + this.bankName);
    }
}
class CurrentAccount extends Account {
    private String tinNumber;

    CurrentAccount(String accName,String accNo,String bankName,String tinNumber){
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
        this.tinNumber = tinNumber;
    }
    public void displayCurrent(){
        super.display();
        System.out.println("Tin number is : " + this.tinNumber);

    }
}
class SavingsAccount extends Account {
    private String orgName;
    SavingsAccount(String accName,String accNo,String bankName,String orgName){
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
        this.orgName = orgName;
    }
    public void displaySaving(){
        super.display();
        System.out.println("Organisation name is : " + orgName);
    }
}
