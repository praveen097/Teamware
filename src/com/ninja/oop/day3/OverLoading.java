package com.ninja.oop.day3;

public class OverLoading {
    public static void main(String[] args) {
        display();
        display(1);
        display(2,6);
        display(0.5f,9.5f);
    }
    public static void display(){
        System.out.println("This is an empty class");
    }
    public static void display(int a){
        System.out.println("This has 1 argument");
    }
    public static void display(int a, int b){
        System.out.println("This has two arguement and inputs type is integer");
    }
    public static void display(float a, float b){
        System.out.println("This has two arguement and inputs type is float");
    }


}
