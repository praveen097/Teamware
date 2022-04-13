package com.ninja;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {44,74,82,48,87,75,255,487,4,8,7,8,71,5};
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println("Element found at : " + i);
                return;
            }
        }
        System.out.println("Element not found!");
    }
}
