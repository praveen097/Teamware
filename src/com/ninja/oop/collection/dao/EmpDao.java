package com.ninja.oop.collection.dao;

import com.ninja.oop.collection.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmpDao {
    ArrayList<Employee> arrayList = new ArrayList<>();


    public void addEmployee(Employee emp) {
        arrayList.add(emp);
        System.out.println("Employee added successfully!");
    }

    public int getEmpCOunt() {
        return arrayList.size();
    }

    public List<Employee> getEmployees() {
        if(arrayList.size() >0)
            return arrayList;
        else
            return null;
    }

    public Employee getOneEmployees(int empId) {
        for (Employee e : arrayList){
            if(empId == e.getEmpId())
                return e;
        }
        return null;
    }

    public boolean employeeExists(int searchId) {
        for(Employee e : arrayList){
            if(searchId == e.getEmpId())
                return true;
        }
        return false;
    }

    public void updateEmployee(Employee empUpdate) {
        int i = 0;
        for (Employee e:arrayList){

            if(empUpdate.getEmpId() == e.getEmpId())
                arrayList.set(i,empUpdate);
            i++;
        }
    }

    public boolean deleteEmployee(int searchId) {
        int i = 0;
        for (Employee e:arrayList){
            if(searchId == e.getEmpId()){
                arrayList.remove(i);
                return true;
            }
            i++;
        }
        return false;
    }
}
