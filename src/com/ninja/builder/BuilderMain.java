package com.ninja.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Student s = new StudentBuilder().setStudentId(123).setStudentName("Praveen").setCgpa(7.69).getStudent();
        System.out.println(s);
    }
}
