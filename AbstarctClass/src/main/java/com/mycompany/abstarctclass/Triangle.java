package com.mycompany.abstarctclass;
public class Triangle extends Shape{
    double base;
    double height;
    Triangle(double b, double h){
        this.base=b;
        this.height=h;
    }
    @Override
    void area(){
        System.out.println("Area of Triangle: "+(0.5*base*height));
    }
}
