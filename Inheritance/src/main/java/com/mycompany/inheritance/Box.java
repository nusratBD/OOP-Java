package com.mycompany.inheritance;
public class Box {
    double height, width, depth;
    Box(double h, double w, double d){
        height=h;
        width=w;
        depth=d;
    }
    Box(Box b){
        height=b.height;
        width=b.width;
        depth=b.depth;
    }
    Box(double len){
        height=width=depth=len;
    }
    double volume(){
    return height*width*depth;
    }
}
