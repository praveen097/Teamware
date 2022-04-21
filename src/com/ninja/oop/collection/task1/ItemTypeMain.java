package com.ninja.oop.collection.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ItemTypeMain {
    public static void main(String[] args) {
        char ch = 'y';
        int i = 1;
        ArrayList<ItemType> list = new ArrayList<>();
        while(ch != 'n'){
            Scanner sc = new Scanner(System.in);
            ItemType it = new ItemType();
            System.out.println("Enter the details of Item Type " + i + " :");
            i++;
            System.out.print("Name : ");
            String name = sc.nextLine();
            it.setName(name);
            System.out.print("Deposit : ");
            double deposit = sc.nextDouble();
            it.setDeposit(deposit);
            System.out.print("Cost per day : ");
            double costPerDay = sc.nextDouble();
            it.setCostPerDay(costPerDay);
            list.add(it);
            System.out.print("Do you want to continue?(y/n) :");
            ch = sc.next().toLowerCase().charAt(0);
        }
        System.out.format("%-15s %-15s %s\n","Name","Deposit","Cost Per Day");
        for (ItemType e : list){
            System.out.format("%-15s %-15s %s\n",e.getName(),e.getDeposit(),e.getCostPerDay());
        }
    }
}
