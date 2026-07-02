package com.mycompany.lab2_prep;
public class Access_Child extends Access{
    double interestRate;
    void setInterestRate(double interestRate){
    this.interestRate=interestRate;
    }
    void calculateInterest(){
    double intereset=(balance*interestRate)/100;
        System.out.println("Intereset: "+intereset);
    }
}
