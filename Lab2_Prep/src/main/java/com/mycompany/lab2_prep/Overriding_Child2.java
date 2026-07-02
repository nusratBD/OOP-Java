package com.mycompany.lab2_prep;
public class Overriding_Child2 extends Overriding{
    @Override
    void makeSound(){
        super.makeSound();
        System.out.println("If it is a cat it sounds mew");
    }
}
