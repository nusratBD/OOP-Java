package Hierarchical_Inheritance;

public class Main {

    public static void main(String[] args) {
        /*
        Hierarchical Inheritance.
        One Parent
        Multiple Child
        */
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        c1.display();
        c1.location();
        c2.display();
        c2.location();
    }
}
