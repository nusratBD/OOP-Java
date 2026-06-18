package com.mycompany.abstract_method;
public class C extends A{
    int height;
    int width;
    C(int h, int w){
        this.height=h;
        this.width=w;
    }
    @Override
    void area(){
    int result=height*width;
        System.out.println("Area of Triangele: "+result);
    }
}
