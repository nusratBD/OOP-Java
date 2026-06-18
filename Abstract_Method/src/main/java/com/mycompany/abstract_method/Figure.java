package com.mycompany.abstract_method;
abstract public class Figure {
    int height, width;
    Figure(int h, int w){
    this.height=h;
    this.width=w;
    }
    abstract void area();
}
