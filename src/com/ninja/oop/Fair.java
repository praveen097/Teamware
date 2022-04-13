package com.ninja.oop;

public class Fair {
    private String itemName;
    private double deposit;
    private double costPerDay;

    public void setName(String name, double dept,double cost){
        this.itemName = name;
        this.deposit = dept;
        this.costPerDay = cost;
    }

    public void getStudentInfo(){
        System.out.println("Item Name: " + itemName);
        System.out.println("Deposit Amount: " + deposit);
        System.out.println("Cost per day : " + costPerDay);
    }
}
