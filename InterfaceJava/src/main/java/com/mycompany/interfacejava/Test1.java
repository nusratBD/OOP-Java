package com.mycompany.interfacejava;
public class Test1 implements Interface1, Interface2{
    @Override
    public void display(){
        System.out.println("Hello");
    }
    public void action(){
        System.out.println("Do hard word.");
    }
}
