package com.mycompany.lab2_prep;
public class Access {
   private String name;
   private int accountNum;
   protected double balance;
   
   void setDetails(String name,int accountNum, double balance){
       this.name=name;
       this.accountNum=accountNum;
       this.balance=balance;
   }
   void deposit(double amount){
   balance=balance+amount;
   }
   void displayDetail(){
       System.out.println("Name: "+name);
       System.out.println("Account Num: "+accountNum);
       System.out.println("Balance: "+balance);
   }
}
