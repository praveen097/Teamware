package com.ninja;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {111111,0,-1,23,14,57256,0,77,82574,92,0};
        System.out.print("Original       : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j - 1]  > arr[j] ){
                   int temp = arr[j - 1];
                   arr[j - 1] = arr[j];
                   arr[j] = temp;
                }
            }
            System.out.print("Comparison : " + i + " : ");
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println(".......................");

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
//