package com.mycompany.lab_prep3;
public class Lab_Prep3 {

    public static void main(String[] args) {
        Employee e1=new Employee("Ahmed", "Ulla", 5000);
        Employee e2=new Employee("Ahmed2", "Ulla2", 10000);
        System.out.println("Yearly Salary of e1: "+e1.getSalary());
        System.out.println("Yearly Salary of e1: "+e2.getSalary());
        double salary1=e1.Salary+(e1.Salary*0.1);
        System.out.println(salary1);
        double salary2=e2.Salary+(e2.Salary*0.1);
        e1.setSalary(salary1);
        e2.setSalary(salary2);
        System.out.println("Yearly Salary of e1 after increment: "+e1.getSalary());
        System.out.println("Yearly Salary of e1 after increment: "+e2.getSalary());

    }
}
