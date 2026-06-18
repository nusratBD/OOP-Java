package com.mycompany.inheritance;
public class MultiLevel {
    double height, width, depth;
    MultiLevel(double h, double w, double d){
        height=h;
        width=w;
        depth=d;
    }
    MultiLevel(MultiLevel m){
        height=m.height;
        width=m.width;
        depth=m.depth;
    }
    void volume(){
        System.out.println("Volume: "+(height*width*depth));
    }
}
