package com.ninja.oop.collection;

import java.util.*;

public class CRUDcomparisions {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        TreeSet<String> ts = new TreeSet<>();
        System.out.println("HashSet");
        long startTime = System.nanoTime();
        for (int i = 0; i <= 10000000; i++) {
            hs.add("Praveen" + i);
        }
        long end = System.nanoTime();
        System.out.println("HashSet add time : " + (end - startTime));

        System.out.println("LinkedHashSet");
         startTime = System.nanoTime();
        for (int i = 0; i <= 10000000; i++) {
            lhs.add("Praveen" + i);
        }
         end = System.nanoTime();
        System.out.println("LinkedHashSet time : " + ( end - startTime));

        System.out.println("TreeSet");
         startTime = System.nanoTime();
        for (int i = 0; i <= 10000000; i++) {
            ts.add("Praveen" + i);
        }
         end = System.nanoTime();
        System.out.println("TreeSet add time : " + (end - startTime));

        System.out.println("\n...........................Fetch...............");

        System.out.println("HashSet");
        Object[] arr = hs.toArray();
        startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        end = System.nanoTime();
        System.out.println("HashSet fetch time : " + (end - startTime));

        Object[] arr1 = lhs.toArray();
        System.out.println("LinkedHashSet");
        startTime = System.nanoTime();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        end = System.nanoTime();
        System.out.println("LinkedHashSet fetch time : " + (end - startTime));

        Object[] arr2 = ts.toArray();
        System.out.println("TreeSet");
        startTime = System.nanoTime();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        end = System.nanoTime();
        System.out.println("TreeSet fetch time : " + (end - startTime));

        System.out.println("\n...........................Remove...............");

        System.out.println("HashSet");
        startTime = System.nanoTime();
        for (int i = 999; i >=0; i--) {
            hs.remove(i);
        }
        end = System.nanoTime();
        System.out.println("HashSet remove time : " + (end - startTime));

        System.out.println("LinkedHashSet");
        startTime = System.nanoTime();
        for (int i = 999; i >=0; i--) {

            lhs.remove(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedHashSet remove time : " + (end - startTime));

        System.out.println("TreeSet");
        startTime = System.nanoTime();
        for (int i = 999; i >=0; i--) {
            ts.remove("Praveen" + i);
        }
        end = System.nanoTime();
        System.out.println("TreeSet remove time : " + (end - startTime));
    }
}
