package com.mycompany.inheritance;
public class MultiLevel2 extends MultiLevel{
    double weight;
    MultiLevel2(double h, double w, double d, double m){
        super(h,w,d);
        weight=m;
    }
    MultiLevel2(MultiLevel2 m2){
        super(m2);
    }
}
