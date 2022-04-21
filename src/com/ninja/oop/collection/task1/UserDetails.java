package com.ninja.oop.collection.task1;

import java.util.ArrayList;

import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        char ch = 'y';
        int i = 1;
        while(ch != 'n'){
            System.out.println("Enter the username " + i + " : ");
            addToList(sc.nextLine(), list);
            i++;
            System.out.println("Do you want to continue?(y/n) :");
            ch = checkChar();
        };
        System.out.println("Names entered are :");
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static char checkChar() {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);
        return ch;
    }

    private static void addToList(String str, ArrayList<String> list) {
        list.add(str);
    }

}
