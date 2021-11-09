package com.company;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;

class Main {

    public static void main(String[] args) {

        List<Employee> collectIt = new ArrayList<Employee>();
        Scanner scanItInt = new Scanner(System.in);
        Scanner scanItStr = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.print("Enter Your Choice: ");
            choice  = scanItInt.nextInt();

            switch (choice){
                case 1:
                    int employeeNumber;
                    boolean isValid = false;
                    do {
                        System.out.print("Enter employee No: ");
                        employeeNumber = scanItInt.nextInt();
                        System.err.println(employeeNumber + " is not a number!");
                        if (scanItInt.hasNextInt()) isValid = true;


                    } while  ( isValid);


                    System.out.print("Enter employee number: ");
                    boolean isValid2 = scanItInt.next();


                    System.out.print("Enter employee name: ");
                    String employeeName = scanItStr.nextLine();
                    System.out.print("Enter employee salary: ");
                    int employeeSalary = scanItInt.nextInt();

                    collectIt.add(new Employee(employeeNumber, employeeName, employeeSalary));
                    break;
                case 2:
                    System.out.println("--------------------");
                    Iterator<Employee> i = collectIt.iterator();
                    while(i.hasNext()){
                        Employee e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("--------------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.println("Enter Employee number to search: ");
                    employeeNumber = scanItInt.nextInt();
                    System.out.println("--------------------");
                    i = collectIt.iterator();
                    while(i.hasNext()){
                        Employee e = i.next();
                        if (e.getEmployeeNumber() == employeeNumber) {
                            System.out.println(e);
                            found = true;
                        }
                    }

                    if (!found){
                        System.out.println("Record not found");
                    }
                    System.out.println("--------------------");
                    break;
                case 4:
                    found = false;
                    System.out.println("Enter Employee number to delete: ");
                    employeeNumber = scanItInt.nextInt();
                    System.out.println("--------------------");
                    i = collectIt.iterator();
                    while(i.hasNext()){
                        Employee e = i.next();
                        if (e.getEmployeeNumber() == employeeNumber) {
                            i.remove();
                            found = true;
                        }
                    }

                    if (!found){
                        System.out.println("Record not found");
                    }else{
                        System.out.println("Record deleted");
                    }
                    System.out.println("--------------------");
                    break;
                case 5:
                    found = false;
                    System.out.println("Enter Employee number to update: ");
                    employeeNumber = scanItInt.nextInt();
                    System.out.println("--------------------");
                    ListIterator<Employee>li = collectIt.listIterator();
                    while(li.hasNext()){
                        Employee e = li.next();
                        if (e.getEmployeeNumber() == employeeNumber) {
                            System.out.print("Enter new name: ");
                            employeeName = scanItStr.nextLine();

                            System.out.print("Enter new salary: ");
                            employeeSalary = scanItInt.nextInt();
                            li.set(new Employee(employeeNumber, employeeName, employeeSalary));
                            found = true;
                        }
                    }

                    if (!found){
                        System.out.println("Record not found");
                    }else{
                        System.out.println("Record is updated successfully");
                    }
                    System.out.println("--------------------");
                    break;
            }
        } while (choice!=0);
    }
}
