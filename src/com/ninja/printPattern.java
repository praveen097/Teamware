package com.ninja;

public class printPattern {
    public static void main(String[] args) {
        pattern(6);
    }

    private static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n + 1); j++) {
               if((i == 0 && j % 3 != 0) || (i == 1 && j % 3 == 0) || (i - j == 2) || (i + j == 8)){
                   System.out.print(" * ");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
