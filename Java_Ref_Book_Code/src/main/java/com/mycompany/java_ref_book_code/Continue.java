package com.mycompany.java_ref_book_code;
public class Continue {
Continue(){
    outer:
    for(int i=0; i<3; i++){
        for(int j=0; j<10; j++){
        if(j==5){
        continue outer;}
        else{
            System.out.println("i="+i+" j="+j);}
        }
        System.out.println("===============");//skipped due to continue outer
    }
}
}
