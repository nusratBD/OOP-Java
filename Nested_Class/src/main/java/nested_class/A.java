package nested_class;

public class A {

    int outer = 100;
    C c=new C();
    void test() {
        B b = new B();
        b.display();
        System.out.println("Value of Inner Class: " + b.c);
    }

    class B {

        int c = 10;

        void display() {
            System.out.println("Our value is: " + outer);
        }
    }
    class C {

        int x = 1;

        void display() {
            System.out.println("Our value is: " + x);
        }
    }
    void test2(){
    c.display();
    }
//Static Nested Class
    static class D{
    static int y=20;
    static void displayD(){
        System.out.println("Display of D class: "+y);
    }
    }
}
