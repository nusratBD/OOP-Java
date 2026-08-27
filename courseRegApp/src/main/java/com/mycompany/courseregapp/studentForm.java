package com.mycompany.courseregapp;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class studentForm {
    int id;
    String name;
    int semester;
    int [] courses;
    long moneyRecipt;
    studentForm(int id, String name, int semester, int [] courses, long moneyRecipt){
        this.id=id;
        this.name=name;
        this.semester=semester;
        this.courses=courses;
        this.moneyRecipt=moneyRecipt;
    }
    void validation(){
    if((id>1000 && id<2000)&&(moneyRecipt>9999999)){
        System.out.println("Congratulations, You are registered for "+semester+" semester.");
        JFrame frame=new JFrame();
        JButton button = new JButton("View Details");
        frame.add(button,BorderLayout.SOUTH);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
    else{
        System.out.println("You are not eligible to register.");
    }
}
    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Semester: "+semester);
        System.out.println("Courses: "+courses.length);
        for(int i=0; i<courses.length; i++){
            System.out.println(i+1+")"+courses[i]);
        }
    }
}
