package com.mycompany.abstarctclass;
public class Circle extends Shape{
    double radius;
    Circle(double r){
    this.radius=r;
    }
    @Override
    void area(){
        final double pi=3.14;
        System.out.println("Area of Circle: "+(pi*radius*radius));
    }
}
