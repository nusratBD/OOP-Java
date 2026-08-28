package com.mycompany.multithread2;
public class QubeThread extends Thread{
    int n;
    QubeThread(int n){
    this. n=n;
    }
    public void run(){
        System.out.println("Qube: "+(n*n*n));
    }
}
