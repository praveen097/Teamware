package com.ninja;

public class AdamNumber {
    public static int reverseOfNumber(int n){
        int reverse = 0;
        while(n > 0){
            int temp = n % 10;
            reverse = reverse * 10 + temp;
            n /= 10;
        }
        return reverse;
    }
    public static int square(int n){
        return n * n;
    }
    public static boolean isAdam(int num){
        int reverseOfNum = reverseOfNumber(num);
        int squareOfNum = square(num);
        int squareOfReverseOfNum = square(reverseOfNum);
        int reverseOfSquareOfReverseOfNum = reverseOfNumber(squareOfReverseOfNum);
        return squareOfNum == reverseOfSquareOfReverseOfNum;

    }
    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            if(isAdam(i)){
                System.out.print(i + " ");
            }
        }

    }
}
