package com.ninja;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

    }
}
