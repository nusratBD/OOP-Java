package com.mycompany.staticmember;
public class StaticMember {

    public static void main(String[] args) {
//--------------Static Variable Access---------------
        System.out.println(A.a);
        //System.out.println(A.b); Not Possible
        System.out.println(A.c);
//--------------Static Method Access---------------
        A.display();
        
    }
}
