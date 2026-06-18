package com.mycompany.abstract_method;
public class Abstract_Method {

    public static void main(String[] args) {
//        B b=new B(5);
//        C c=new C(3,5);
//        b.area();
//        c.area();
//        b.welcome();
//        c.welcome();
//          Rectangle r=new Rectangle(2,5);
//          r.area();
          NewClass1 n1=new NewClass1();
          NewClass2 n2=new NewClass2();
          NewClass n;
          n=n1;
          n.result();
          n=n2;
          n.result();
    }
}
