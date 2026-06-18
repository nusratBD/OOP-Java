package com.mycompany.inheritance;
public class BoxWeight extends Box{
    double weight;
    BoxWeight(double h, double w, double d, double m){
//        height=h;
//        width=w;
//        depth=d;
//        weight=m;
super(h,w,d);
weight=m;
    }
    BoxWeight(Box b, double m){
    super(b);
    weight=m;
    }
}
