package com.ninja.oop.generics;

import java.util.Arrays;

public class GenericsBasics {
    public static void main(String[] args) {
        Integer[] intArray = {1,12,3,4,56,7,8,98};
        Double[] doubleArray = {12.24,5471.48,5485.545,4874.48974};
        Character[] charArray = {'c','g','e','p','i'};
        print(intArray);
        print(doubleArray);
        print(charArray);
    }
    public static <E> void print(E[] inputArray){
        System.out.println(Arrays.toString(inputArray));
    }
}
