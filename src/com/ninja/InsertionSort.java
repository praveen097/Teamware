package com.ninja;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {-1,23,14,57256,77,82574,92};
        int j = 0, k = 0;
        for (int i = 1; i < arr.length ; i++) {
             k = arr[i];
            for (j = i - 1; j >= 0 && k < arr[j] ; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = k;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(Arrays.toString(arr));
    }
}
