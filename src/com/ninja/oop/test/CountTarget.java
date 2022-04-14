package com.ninja.oop.test;

public class CountTarget {
    public static void main(String[] args) {
        int target = 20;
        int[][] arr = {
                {20,20,1,5,20},
                {20,20,20,20,20},
                {20,2,20,20,5},
                {1,20,1,20,20},
                {20,20,20,7,20}
        };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] != 20){
                    count++;
                }
            }
        }
        System.out.println("Count is : " + count);
    }
}
