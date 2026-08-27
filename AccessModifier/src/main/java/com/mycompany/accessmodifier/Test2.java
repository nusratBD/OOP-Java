package com.mycompany.accessmodifier;
public class Test2 {
    void display(){
        Test1 t1=new Test1();
        System.out.println("Default from another class: "+t1.y);
    }
}
