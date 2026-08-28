/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multithread;

/**
 *
 * @author User
 */
public class SquareThread extends Thread{
    int n;
    SquareThread(int n){
    this.n=n;
    }
    public void run(){
        System.out.println("Square"+(n*n));
    }
}
