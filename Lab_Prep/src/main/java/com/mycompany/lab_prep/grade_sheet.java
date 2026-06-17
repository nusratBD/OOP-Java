package com.mycompany.lab_prep;

import java.util.Scanner;

public class grade_sheet {

    Scanner sc = new Scanner(System.in);
    int num;

    grade_sheet() {
        System.out.println("Enter the number: ");
        num = sc.nextInt();
    }

    void display() {
        if (num >= 80) {
            System.out.println("A+");
        } else if (num >= 70) {
            System.out.println("A");
        } else if (num >= 65) {
            System.out.println("A-");
        } else if (num >= 60) {
            System.out.println("B");
        } else if (num >= 50) {
            System.out.println("C");
        } else if (num >= 40) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
