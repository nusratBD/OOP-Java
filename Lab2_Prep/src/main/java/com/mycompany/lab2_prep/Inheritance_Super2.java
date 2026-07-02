package com.mycompany.lab2_prep;
public class Inheritance_Super2 {
    String name;
    int salary;
    Inheritance_Super2(String name, int salary){
    this.name=name;
    this.salary=salary;
    }
    Inheritance_Super2(Inheritance_Super2 is){
    this.name=is.name;
    this.salary=is.salary;
    }
    void display(){
        System.out.println("Worker's Info: ");
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
