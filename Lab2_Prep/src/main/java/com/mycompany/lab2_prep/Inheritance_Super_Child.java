package com.mycompany.lab2_prep;
public class Inheritance_Super_Child extends Inheritance_Super{
   String department;
   Inheritance_Super_Child(String name,int salary, String department){
   super(name, salary);
   this.department=department;
  }
   void displayDetail(){
       System.out.println("Worker Details: ");
       display();
       System.out.println("Department: "+department);
   }
}
