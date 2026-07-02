package com.mycompany.lab2_prep;
public class MultiLevel_Child extends MultiLevel_Inheritance{
    int id;
    double cgpa;
    
    void setStudent(int id, double cgpa){
        this.id=id;
        this.cgpa=cgpa;
    }
    void displayStudent(){
    displayPerson();
        System.out.println("ID: "+id);
        System.out.println("CGPA: "+cgpa);
    }
}
