package com.ninja.oop.string;

public class Basics {
    public static void main(String[] args) {
        String str = "My name   is Praveen Kumar";
        System.out.println("Sum of character in stirng wiwhout space : " + str.length());
        int sum = 0;
        String[] values = str.split(" ");
        for(String s : values){
            sum += s.length();
        }
        System.out.println("Sum of character in stirng wiwhout space : " + sum);
        System.out.println("Character at 2 position : " + str.charAt(3));
        System.out.println(str.replace("a","e"));
        System.out.println(str.replaceAll("is","was"));
        System.out.println(str.contains("Praveen"));
    }
}
