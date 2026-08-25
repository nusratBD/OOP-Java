package com.mycompany.examp_prep;
public class staticClass {
    static int x1=10;
    int x2=20;
    static {
    x1=100;
    }
    static void display(){
        System.out.println("Static Method."+x1);
    }
    void display2(){
        System.out.println(x1);
    }
    static class Inner1{
        void inner1(){
            System.out.println("From Static Class."+x1);

        }
    }  
    class Inner2{
        void inner2(){
            System.out.println("from Non-static class."+x1);
            System.out.println("from Non-static class."+x2);
        }
    }
    }

