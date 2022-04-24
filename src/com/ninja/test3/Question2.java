package com.ninja.test3;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[][] arr =  {
//                {20 ,20, 20, 20, 20},
//                {3, 20, 20, 6, 20},
//                {20, 20, 20, 20, 20},
//                {20, 2, 20, 20, 1},
//                {20, 20, 20, 20, 20}
//        };
        System.out.println("Enter matrix length : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter value of arr [" +i + "]["+j+"] :");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array is  :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] != 20){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("\nthe number of white cells in the final" +
                "configuration of the board " + sum);
    }
}
