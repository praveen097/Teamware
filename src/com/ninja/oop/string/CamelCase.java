package com.ninja.oop.string;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the event name : ");
        String[] str = sc.nextLine().toLowerCase().split(" ");
        String ans = "";
        for(String s : str){
            ans += s.toUpperCase().charAt(0) + s.substring(1,s.length());
        }
        System.out.println("Camel case string is : " + ans);
    }
}
