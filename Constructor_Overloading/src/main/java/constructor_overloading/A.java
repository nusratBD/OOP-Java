package constructor_overloading;
public class A {
    int a;
    int b;
    A(int a, int b){
        this.a=a;
        this.b=b;
    }
    A(){
        a=10;
        b=20;
    }
    int display(){
        return a+b;
    }
}
