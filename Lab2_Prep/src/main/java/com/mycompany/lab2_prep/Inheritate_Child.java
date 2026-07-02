package com.mycompany.lab2_prep;

public class Inheritate_Child extends Inheritance {

    int studentId;
    double cgpa;
    void setStudent(int studentId, double cgpa) {
        this.studentId = studentId;
        this.cgpa = cgpa;
    }
    void displayStudent(){
        System.out.println("Student Info");
        System.out.println("--------------------");
        displayPerson();
        System.out.println("ID: "+studentId);
        System.out.println("CGPA: "+cgpa);
    }
}
