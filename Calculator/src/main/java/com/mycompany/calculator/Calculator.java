package com.mycompany.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
       generalCalculator gc=new generalCalculator();
       Scanner sc=new Scanner(System.in);
       while(true){
           System.out.println("Scientific Calculator: ");
           System.out.println("======================");
           System.out.println("1. Addition\n"
                   + "2. Subtraction\n"
                   + "3. Multiplication\n"
                   + "4. Division\n"
                   + "5. Modulus\n"
                   + "0. Exit");
           System.out.println("Please Enter Your Choice: ");
           int input=sc.nextInt();
           if(input==0){
           break;}
           switch(input){
               case 1:
                   System.out.println("Please Enter two input: ");
                   double a=sc.nextDouble();
                   double b=sc.nextDouble();
                   System.out.println("Addition: "+gc.add(a, b));
                   break;
           }
       }
    }
}
