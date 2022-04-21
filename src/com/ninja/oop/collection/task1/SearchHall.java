package com.ninja.oop.collection.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchHall {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many halls would you like to add : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of Hall " + (i + 1) + " :");
            list.add(sc.nextLine());
        }
        System.out.println("Enter the hall to searched : ");
        String search = sc.nextLine();
        if(list.contains(search)){
            System.out.println(search + " is in the list at position " + list.indexOf(search));
        }else {
            System.out.println("Oops " + search + " is not in the list");
        }
    }
}
