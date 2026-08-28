package com.mycompany.static_class;
public class Test1 {
    int x=10;
    static int y=5;
    public static class Child1{
        void display1(){
            System.out.println("Static: "+y);
        }
    }
    public class Child2{
        void display2(){
            System.out.println("Non-Static: "+x+","+y);
        }
    }
    void nSMethod(){
        System.out.println("Non Static Method");
    }
    static void SMethod(){
        System.out.println("Static Method");
    }
}
