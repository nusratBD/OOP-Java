package com.mycompany.lab2_prep;
public class Constructor_Overloading {
    String name;
    int id;
    double salary;
Constructor_Overloading(){
this.name="Unknown";
this.id=0;
this.salary=0.0;
}
Constructor_Overloading(String name){
this.name=name;
this.id=0;
this.salary=0.0;
}
Constructor_Overloading(String name, int id){
this.name=name;
this.id=id;
this.salary=0.0;
}
Constructor_Overloading(String name, int id, double salary){
this.name=name;
this.id=id;
this.salary=salary;
}
void display(){
    System.out.println("Name: "+name);
    System.out.println("ID: "+id);
    System.out.println("Salary: "+salary);
}
}
