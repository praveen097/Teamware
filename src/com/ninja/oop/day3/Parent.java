package com.ninja.oop.day3;

public class Parent {
    public  void show(){
        System.out.println("This is from parent");
    }
}
class Child extends Parent {
    @Override
    public  void show(){
        System.out.println("This is from children");
    }
}

class OverridingMain {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}