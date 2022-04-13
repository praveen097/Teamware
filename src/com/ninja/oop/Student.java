package com.ninja.oop;

public class Student {
    int studentId;
    String studentName;
    String department;
    String collegeName;
    String dateOfBirth;

    public void setStudentInfo(){
        studentId = 77;
        studentName = "Praveen";
        department = "Computer Science";
        collegeName = "Lovely Professional University";
        dateOfBirth = "15-08-1999";
    }

    public void setStudentInfoWithParameters(int id, String name, String dept,String college, String dob){
        studentId = id;
        studentName = name;
        department = dept;
        collegeName = college;
        dateOfBirth = dob;
    }

    public void getStudentInfo(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Department: " + department);
        System.out.println("Student College: " + collegeName);
        System.out.println("Student DOB: " + dateOfBirth);
    }
}
