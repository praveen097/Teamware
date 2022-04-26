package com.ninja.singleton.lazy;

public class Employee {
    static Employee e = null;
    private Employee (){
        System.out.println("Object created!");
    }
    public static Employee getInstance(){
        if(e == null){
            e =  new Employee();
        }
        return e;
    }
}
