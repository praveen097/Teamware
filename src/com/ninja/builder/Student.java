package com.ninja.builder;

public class Student {
    private int studentId;
    private String studentName;
    private String department;
    private double cgpa;
    private long regNo;

    public Student(int studentId, String studentName, String department, double cgpa, long regNo) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        this.cgpa = cgpa;
        this.regNo = regNo;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public long getRegNo() {
        return regNo;
    }

    public void setRegNo(long regNo) {
        this.regNo = regNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", department='" + department + '\'' +
                ", cgpa=" + cgpa +
                ", regNo=" + regNo +
                '}';
    }
}
