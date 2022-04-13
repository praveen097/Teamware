package com.ninja.oop;

public class Stall {
    private String name;
    private String detail;

    public Stall(String name, String detail) {
        System.out.println("Using Default Constructor");
        this.name = name;
        this.detail = detail;
    }

    public Stall(){
        System.out.println("Using Default Constructor");

        this.name = "Book";
        this.detail = "All latest books are available under this category";
    }
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Details : " + detail);
    }
}
