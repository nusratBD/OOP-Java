package com.mycompany.staticmember;

public class A {

    static int a = 5;
    int b = 5;
    static int c;

    static void display() {
        System.out.println("a= " + (a + 10));
        System.out.println("c= " + c);
        //System.out.println("b= "+b);
        /*Non-static variable b cannot be 
        referenced from a static context.*/
    }

    static {
        c = a * 3;
    }
}
