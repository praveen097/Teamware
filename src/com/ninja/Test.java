package com.ninja;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
      int[] arr = {0,48,4,84,4,84,478,741,5648,71,5,487,98,5,9,87,5};
      TreeSet<Integer> ts = new TreeSet<>();
        for (int j : arr) {
            ts.add(j);
        }
        Object[] arr2 = ts.toArray();
        System.out.println(arr2[arr2.length-2]);
    }
}
