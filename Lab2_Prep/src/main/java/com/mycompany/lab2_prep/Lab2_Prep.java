package com.mycompany.lab2_prep;

public class Lab2_Prep {

    public static void main(String[] args) {
        //----------------Constructor Overloading--------------
//        Constructor_Overloading co1=new Constructor_Overloading();
//        System.out.println("Employee 01");
//        co1.display();
//        System.out.println("---------------------------");
//        
//        Constructor_Overloading co2=new Constructor_Overloading("Nusrat");
//        System.out.println("Employee 02");
//        co2.display();
//        System.out.println("----------------------");
//        
//        Constructor_Overloading co3=new Constructor_Overloading("Nusrat", 101);
//        System.out.println("Employee 03");
//        co3.display();
//        System.out.println("----------------------");
//        
//        Constructor_Overloading co4=new Constructor_Overloading("Nusrat", 101, 50000);
//        System.out.println("Employee 04");
//        co4.display();
//        System.out.println("----------------------");
//----------------------Stack--------------------
//        Stack s = new Stack();
//        for (int i = 0; i < 12; i++) {
//            s.push(i);
//        }
//        s.display();
//        s.pop();
//        s.display();
//--------------------Method Overloading----------------
        Method_Overloading mo = new Method_Overloading();
        System.out.println(mo.calculate(1, 2));
        System.out.println(mo.calculate(5, 3));
        System.out.println(mo.calculate(1, 2, 3));
        System.out.println(mo.calculate(5, 3.5));
    }
}
