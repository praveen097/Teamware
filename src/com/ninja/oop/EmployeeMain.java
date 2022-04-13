package com.ninja.oop;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee(123,"Praveen",100000);
        System.out.println(emp);
        Employee.setCompany();
        System.out.println(emp);
    }
}
