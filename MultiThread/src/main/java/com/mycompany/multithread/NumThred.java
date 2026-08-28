package com.mycompany.multithread;

import java.util.Random;

public class NumThred extends Thread{
    int num;
    public void run(){
    Random r=new Random();
    for(int i=0; i<5; i++){
    num=r.nextInt(100);
    if(num%2==0){
    new SquareThread(num).start();
    }
    else{
    new qubeThread(num).start();
    }
    try{
    Thread.sleep(1000);
    }
    catch(Exception e){
        System.out.println(e.getMessage());}
    }
    }
    
}

