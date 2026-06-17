package com.mycompany.java_ref_book_code;

public class Prime {

    Prime() {
//int num=14;
//boolean isPrime=true;
//for(int i=2; i<num/2; i++){
//if(num%i==0){
//isPrime=false;
//break;
//}
//}
//    if(isPrime){
//        System.out.println("Prime");
//    }else{
//        System.out.println("Not Prime");
//    }
//int num=14;
//boolean isPrime=true;
//for(int i=2; i<num; i++){
//if(num%i==0){
//    isPrime=false;
//    break;
//}
//}
//if(isPrime){
//    System.out.println("Prime");}else{
//    System.out.println("Not Prime");}
        outer:
        for (int i = 1; i < 50; i++) {
            boolean flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag == true) {
                System.out.print(i + " ");
            }
        }
    }
}
