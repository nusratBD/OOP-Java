package com.mycompany.static_class;
public class Static_Class {

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.nSMethod();
        //Static Method with obj
        t1.SMethod();
        //Static Method without obj
        Test1.SMethod();
        //Static obj directly created of Static class
        Test1.Child1 t2 =new Test1.Child1();
        t2.display1();
        //Create obj of Nonstatic class
        Test1.Child2 c2 =t1.new Child2();
        c2.display2();
    }
}
