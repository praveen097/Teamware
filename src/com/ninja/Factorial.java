package com.ninja;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial :");
        int n = sc.nextInt();
        System.out.println(fun(n));
    }

    private static int fun(int n) {
        if( n == 0){
            return 1;
        }

        return n * fun(n-1);
    }
}
