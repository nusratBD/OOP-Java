package array;

public class Stack3 {

    int top = -1;
    int arr[];

    Stack3(int n) {
        arr = new int[n];
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (top == arr.length) {
            return true;
        } else {
            return false;
        }
    }

    void push(int num) {
        if (isFull() == false) {
            top++;
            arr[top] = num;
            System.out.println(num + " pushed.");
        } else {
            System.out.println("Stack Full.");
        }
    }

    void pop() {
        if (isEmpty() == false) {
            System.out.println(arr[top] + " poped.");
            top--;
        } else {
            System.out.println("Stack Empty.");
        }
    }
}
