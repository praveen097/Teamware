package com.ninja.builder;

public class StudentBuilder {
    private int studentId;
    private String studentName;
    private String department;
    private double cgpa;
    private long regNo;

    public int getStudentId() {
        return studentId;
    }

    public StudentBuilder setStudentId(int studentId) {
        this.studentId = studentId;
        return this;
    }

    public String getStudentName() {
        return studentName;
    }

    public StudentBuilder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public StudentBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public double getCgpa() {
        return cgpa;
    }

    public StudentBuilder setCgpa(double cgpa) {
        this.cgpa = cgpa;
        return this;
    }

    public long getRegNo() {
        return regNo;
    }

    public StudentBuilder setRegNo(long regNo) {
        this.regNo = regNo;
        return this;
    }
    public Student getStudent(){
        return new Student(getStudentId(),getStudentName(),getDepartment(),getCgpa(),getRegNo());
    }
}
