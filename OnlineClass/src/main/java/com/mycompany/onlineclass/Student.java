package com.mycompany.onlineclass;
public class Student {
    String name;
    int mark1;
    int mark2;
    int mark3;
    //default constructor
    Student(){
        this.name="Mr. X";
    };
    //parameterized constructor
    Student(String name, int mark1, int mark2, int mark3){
    this.name=name;//this= ei
    this.mark1=mark1;
    this.mark2=mark2;
    this.mark3=mark3;
    
   }
    
}
