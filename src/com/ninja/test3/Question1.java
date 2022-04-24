package com.ninja.test3;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the length of the sequence : ");
        int lengthOfSequence = sc.nextInt();
        int[] arr2 = new int[lengthOfSequence];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(isPresent(arr,arr2)?"Yes":"No");
    }

    private static boolean isPresent(int[] arr, int[] arr2) {
        int j = 0;
        int i = 0;
        int count = 0;
        for (int k = 0; k < arr.length; k++) {
            if(arr[k] == arr2[j]){
                j++;

                if(j == arr2.length){
                    return true;
                }
            }else{
                i++;
            }
        }
        return false;
    }
}
