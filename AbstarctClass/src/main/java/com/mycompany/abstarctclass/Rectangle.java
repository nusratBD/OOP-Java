package com.mycompany.abstarctclass;
public class Rectangle extends Shape{
    double length, width;
    Rectangle(double l, double w){
    this.length=l;
    this.width=w;
    }
    @Override
    void area(){
        System.out.println("Area of Rectangle: "+(length*width));
    }
}
