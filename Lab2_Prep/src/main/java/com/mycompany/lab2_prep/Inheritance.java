package com.mycompany.lab2_prep;
public class Inheritance {
    String name;
    int age;
    
    void setPerson(String name, int age){
        this.name=name;
        this.age=age;
    }
    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
