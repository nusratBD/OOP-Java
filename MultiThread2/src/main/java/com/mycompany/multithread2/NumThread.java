
package com.mycompany.multithread2;

import java.util.Random;

public class NumThread extends Thread{
    int num;
    public void run(){
    Random r = new Random();
    for(int i=0; i<5; i++){
    num=r.nextInt(100);
        System.out.println("Random Number: "+num);
        if(num%2==0){
        new SquareThread(num).start();
        }
        else{
        new QubeThread(num).start();
        }
    }
    try{
    Thread.sleep(1000);
    }catch(Exception e){
        System.out.println("Exception: "+e.getMessage());
    }
    }
}
