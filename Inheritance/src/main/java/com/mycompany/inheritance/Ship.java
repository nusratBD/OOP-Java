package com.mycompany.inheritance;
public class Ship extends MultiLevel {
    double coast;
    Ship(double h, double w, double d, double c){
        super(h,w,d);
        coast=c;
    }
    Ship(Ship s){
    super(s);
    }
}
