package com.mycompany.lab_prep3;
public class Employee {
    String fName;
    String lName;
    double Salary;
    Employee(String fName, String lName, double Salary){
        this.fName=fName;
        this.lName=lName;
        this.Salary=Salary;
    }
    void setfName(String fName){
        this.fName=fName;
    }
    void setlName(String fName){
        this.lName=lName;
    }
    void setSalary(double salary){
    if(salary>0){
       this.Salary=salary; 
        System.out.println(Salary);
    }
    }
    String getfName(){
    return fName;
    }
    String getlName(){
    return lName;
    }
    double getSalary(){
    return Salary;
    }
}
