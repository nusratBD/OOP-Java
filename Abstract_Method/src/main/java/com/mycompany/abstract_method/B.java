package com.mycompany.abstract_method;

public class B extends A {

    double radious;

    B(double r) {
        this.radious = r;
    }

    @Override
    void area() {
        double result = 3.14 * radious;
        System.out.println("Area of Circle: " + result);
    }
}
