package com.mycompany.lab_prep;

public class class1 {

    String name;
    int age;
    int semester;

    class1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    class1(String name, int age, int semester) {
        this.name = name;
        this.age = age;
        this.semester=semester;
    }

    void display() {
        System.out.println("My name is " + name + ". I'm " + age + " years old.");
    }
    void display(String dream){
            System.out.println("My name is " + name + ". I'm " + age + 
                    " years old."+" I'm studying at "+
                    semester+" semester."+" I want to be an "+dream);

    }
}
