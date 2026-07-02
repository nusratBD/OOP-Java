package com.mycompany.lab2_prep;

public class Inheritance_Super2_Child extends Inheritance_Super2 {

    String department;

    Inheritance_Super2_Child(Inheritance_Super2 is2, String department) {
        super(is2);
        this.department = department;
    }

    void worker_display() {
        display();
        System.out.println("Department: "+department);
    }
}
