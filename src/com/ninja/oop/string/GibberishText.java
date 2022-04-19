package com.ninja.oop.string;

import java.util.Scanner;

public class GibberishText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text from the document :");
        String str = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the string to be found in the data :");
        String target = sc.nextLine();
        System.out.println(isContains(str.trim(),target.trim())?"String Found!":"Not Found!");

    }

    private static boolean isContains(String str,String target) {
        if(str.contains(target))
            return true;
        return false;
    }
}
