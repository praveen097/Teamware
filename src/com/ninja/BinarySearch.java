package com.ninja;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,4,5,6,7,8,9};
        int target = -10;
        findTarget(arr,target);
    }

    private static void findTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                System.out.println("Element found at " + mid);
                return;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Not found");
    }
}
