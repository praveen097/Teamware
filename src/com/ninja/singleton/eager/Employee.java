package com.ninja.singleton.eager;

public class Employee {
    static Employee e = new Employee();
    private Employee(){
        System.out.println("Object created");
    }
    public static Employee getInstance(){
        return e;
    }
}
