package com.company;

class Employee {
    private int employeeNumber;
    private String employeeName;
    private int employeeSalary;

    Employee(int employeeNumber, String employeeName, int employeeSalary){
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeNumber(){
        return employeeNumber;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmployeeName () {
        return employeeName;
    }

    public String toString() {
        return employeeNumber+" "+employeeName+" "+employeeSalary;
    }

}
