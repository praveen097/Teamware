package com.ninja.singleton.eager;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = Employee.getInstance();
        Employee e2 = Employee.getInstance();
    }
}
