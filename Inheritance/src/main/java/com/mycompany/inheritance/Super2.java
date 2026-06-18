package com.mycompany.inheritance;
public class Super2 extends Super{
    int i=10;
    void display(){
        System.out.println("i="+i);
        System.out.println("i="+super.i);
    }
}
