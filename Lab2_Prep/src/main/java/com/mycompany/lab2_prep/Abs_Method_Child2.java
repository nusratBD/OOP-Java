package com.mycompany.lab2_prep;

public class Abs_Method_Child2 extends Abs_Method {

    int height, width;

    Abs_Method_Child2(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    void area() {
        int area = height * width;
        System.out.println("Area: " + area);
    }
}
