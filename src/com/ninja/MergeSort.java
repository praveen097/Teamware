package com.ninja;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {111111,0,-1,23,14,57256,0,77,82574,92,0};
        int[] ans = mergeSort(arr);
        for(int num : ans){
            System.out.print(num + " ");
        }
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort((Arrays.copyOfRange(arr,mid,arr.length-1)));
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < left.length  && j < right.length){
            if(left[i] < right[j]){
                ans[k] = left[i];
                i++;
            }else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            ans[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            ans[k] = right[j];
            j++;
            k++;

        }
        return ans;
    }
}
