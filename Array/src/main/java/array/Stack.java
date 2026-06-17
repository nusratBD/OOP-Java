package array;
public class Stack {
    int top=-1;
    int arr[];
    Stack(int n){
    arr=new int[n];
    }
    boolean isEmpty(){
        if(top==-1) return true;
        else return false;
    }
    boolean isFull(){
        if(top==arr.length-1) return true;
        else return false;
    }
    void push(int value){
    if(isFull()==false){
    top++;
    arr[top]=value;
    display();
    }
    else System.out.println("Stack Full.");
    }
    void pop(){
    if(isEmpty()==false) {
        top--;
        display();
    }
    else System.out.println("Stack Empty.");
    }
    void display(){
    if(isEmpty()==false){
        for(int i=0; i<=top; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    else{
        System.out.println("Stack Empty");
    }
    }
}
