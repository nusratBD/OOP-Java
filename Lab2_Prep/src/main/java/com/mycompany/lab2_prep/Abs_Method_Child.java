package com.mycompany.lab2_prep;

public class Abs_Method_Child extends Abs_Method {

    double radius;

    Abs_Method_Child(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    void area() {
        double area = 3.14 * radius;
        System.out.println("Area: "+String.format("%.2f", area));
    }
}
