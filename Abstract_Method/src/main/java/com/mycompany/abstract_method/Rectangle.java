package com.mycompany.abstract_method;
public class Rectangle extends Figure {
    //Concerete Area
    Rectangle(int h, int w){
        super(h,w);
    }
    void area(){
        System.out.println("Area of Rectangle: "+(height*width));
    }
}
