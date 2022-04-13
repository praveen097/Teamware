package com.ninja.oop;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    private static String companyName = "Morgan";

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", companyName=" + companyName +
                '}';
    }

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    public static void setCompany(){
        companyName = "Amazon";
    }
}
