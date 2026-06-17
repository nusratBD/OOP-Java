package com.mycompany.java_ref_book_code;
public class Boolean {
    Boolean(){
        boolean b;
        b=false;
        System.out.println("The value of b is: "+b);
        b=true;
        System.out.println("The value of b is: "+b);
        if(b) System.out.println("Executed.");
        b=false;
        if(b) System.out.println("Not Executed.");
        System.out.println("3>10 is: "+(3>10));
    }
}
