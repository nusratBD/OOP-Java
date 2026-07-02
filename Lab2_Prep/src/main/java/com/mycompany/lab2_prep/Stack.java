package com.mycompany.lab2_prep;

public class Stack {

    int stack[] = new int[10];
    int top;

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        if (top == -1) {
            System.out.println("Stack Empty.");
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (top == 9) {
            System.out.println("Stack is Full.");
            return true;
        } else {
            return false;
        }
    }

    void push(int value) {
        if (isFull() == false) {
            top++;
            stack[top] = value;
        }
    }

    void pop() {
        if (isEmpty() == false) {
            top--;
        }
    }
    void display(){
    for(int i=0; i<=top; i++){
        System.out.print(i+" ");
    }
        System.out.println("");
    }
}
