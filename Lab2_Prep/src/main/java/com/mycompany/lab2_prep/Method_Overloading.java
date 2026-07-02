package com.mycompany.lab2_prep;
public class Method_Overloading {
    double calculate(int a, int b){
    return a+b;
    }
    double calculate(double a, double b){
    return a+b;
    }
    double calculate(int a, int b, int c){
    return a+b+c;
    }
    double calculate(int a, double b){
    return a+b;
    }
}
