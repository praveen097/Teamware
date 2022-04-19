package com.ninja.oop.test;

import java.util.Scanner;

public class LuckyWinner {
    public static  boolean isLucky(int n){

        if((n % 10) == 3 || (n % 10) == 8)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the ticket number : ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.print("Ticket number cannot be zero or less\nplease enter ticket number it again :");
            n = sc.nextInt();
        }
        if (isLucky(n)){
            System.out.println("Yay! you are a lucky winner");
        }else{
            System.out.println("Oops, you are not a lucky winner");
        }

    }
}
