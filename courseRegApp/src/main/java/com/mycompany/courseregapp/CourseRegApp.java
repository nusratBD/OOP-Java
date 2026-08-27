package com.mycompany.courseregapp;

import java.util.Scanner;

public class CourseRegApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your semester: ");
        int semester=sc.nextInt();
        System.out.println("How many courses do you want to take(max 5): ");
        int n=sc.nextInt();
        int [] courses= new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter Subject Code: ");
            courses[i]=sc.nextInt();
            System.out.println("");
        }
        System.out.println("Enter your mone recipt: ");
        long moneyRecipt= sc.nextLong();
        studentForm s=new studentForm(id,name,semester,courses,moneyRecipt);
        s.validation();
    }
}
