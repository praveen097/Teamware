package com.ninja.oop.test;

public class Pattern {
    public static void main(String[] args) {
        pattern(6);
    }

    private static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int space = (n - i); space > 0 ; space--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print((char)('A' + j)+ "");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char)(('A' + j)+1) + "");
            }
            System.out.println();
        }
    }
}
