package com.mycompany.lab2_prep;

abstract public class Abs_Method {

    String color;

    Abs_Method(String color) {
        this.color = color;
    }

    void showColor() {
        System.out.println("Color: " + color);
    }

    abstract void area();
}
