package com.mycompany.multithread2;
public class SquareThread extends Thread{
    int n;
    SquareThread(int n){
    this.n=n;
    }
    public void run(){
        System.out.println("Square: "+(n*n));
    }
}
