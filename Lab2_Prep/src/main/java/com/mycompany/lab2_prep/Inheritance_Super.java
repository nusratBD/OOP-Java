package com.mycompany.lab2_prep;
public class Inheritance_Super {
    String name;
    int salary;
    Inheritance_Super(String name, int salary){
    this.name=name;
    this.salary=salary;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
