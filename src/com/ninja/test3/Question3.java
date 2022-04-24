package com.ninja.test3;

public class Question3 {
    public static void main(String[] args) {
        pattern(4);
    }

    private static void pattern(int n) {
        int k;
        if(n % 2== 1){
            k = 3;
        }else{
            k = 2;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2 * n - 1); j++) {
                if(i !=0 && (j < i || j > n-i+k)){
                    System.out.print("b");
                }else if(i !=0 && (j > i && j < n-i + k )){
                    System.out.print("i");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
