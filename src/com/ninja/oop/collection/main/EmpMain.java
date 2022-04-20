package com.ninja.oop.collection.main;

import com.ninja.oop.collection.dao.EmpDao;
import com.ninja.oop.collection.model.Employee;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpDao empdao = new EmpDao();
        do{
            System.out.println("Menu");
            System.out.println("1.Add an employee");
            System.out.println("2.Display all employees");
            System.out.println("3.Display one employee");
            System.out.println("4.Update an employee");
            System.out.println("5.Delete an employee");
            System.out.println("6.Exit");
            System.out.print("\nEnter your choice now :");
            switch (sc.nextInt()){
                case 1:
                    Employee emp = new Employee();
                    System.out.print("Enter employee ID :");
                    int empId = sc.nextInt();
                    emp.setEmpId(empId);
                    System.out.print("Enter employee name : ");
                    sc.nextLine();
                    String empName = sc.nextLine();
                    emp.setEmpName(empName);
                    System.out.print("Enter employee designation : ");
                    String empDesignation = sc.nextLine();
                    emp.setEmpDesignation(empDesignation);
                    System.out.print("Enter employee salary : ");
                    double empSalary = sc.nextDouble();
                    emp.setSalary(empSalary);
                    empdao.addEmployee(emp);
                    System.out.println("Current total employees are : " + empdao.getEmpCOunt());
                    break;
                case 2:
                    List<Employee> allEmp = empdao.getEmployees();
                    if(allEmp != null){
                        System.out.format("%-20s %-20s %-20s %s\n"," Id"," Name","Designation","Salary");
                        for (Employee e : allEmp){
                            System.out.format("%-20s %-20s %-20s %s\n",e.getEmpId(),e.getEmpName(),e.getEmpDesignation(),e.getSalary());
                        }

                    }else{
                        System.out.println("There are no employees!,Please select option 1 to add employees");
                    }
                    break;
                case 3:
                    System.out.println("Please enter valid employee Id to fetch employee : ");
                    int searchId = sc.nextInt();
                    Employee oneEmp = empdao.getOneEmployees(searchId);
                    if(oneEmp != null){
                        System.out.format("%-20s %-20s %-20s %s\n"," Id"," Name","Designation","Salary");
                        System.out.format("%-20s %-20s %-20s %s\n",oneEmp.getEmpId(),oneEmp.getEmpName(),
                                oneEmp.getEmpDesignation(),oneEmp.getSalary());

                    }else{
                        System.out.println("There is no employees with this Id!");
                    }
                    break;
                case 4:
                    System.out.println("Please enter valid employee Id to update employee : ");
                    searchId = sc.nextInt();
                    Employee empUpdate = empdao.getOneEmployees(searchId);
                    if(empUpdate != null){
                        System.out.print("Enter employee name : ");
                        sc.nextLine();
                        empName = sc.nextLine();
                        empUpdate.setEmpName(empName);
                        System.out.print("Enter employee designation : ");
                        empDesignation = sc.nextLine();
                        empUpdate.setEmpDesignation(empDesignation);
                        System.out.print("Enter employee salary : ");
                        empSalary = sc.nextDouble();
                        empUpdate.setSalary(empSalary);
                        empdao.updateEmployee(empUpdate);
                        System.out.println("Update successfully");
                    }else{
                        System.out.println("No employee exists with this Id");
                    }
                    break;
                case 5:
                    System.out.println("Please enter valid employee Id to update employee : ");
                    searchId = sc.nextInt();
                    if(empdao.deleteEmployee(searchId)){
                        System.out.println("Deleted record successfully");
                    }else{
                        System.out.println("No employee exist with this id");
                    }
                    break;
                case 6:
                    System.out.println("You terminated the program");
                    System.exit(0);
                default:
                    System.out.println("Invalid");
                    break;
            }
        }while (true);
    }
}
