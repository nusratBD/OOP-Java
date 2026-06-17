package constructor_overloading;

public class CallByRef {

    int a, b;

    CallByRef(int i, int j) {
        a = i;
        b = j;
    }

    void math(CallByRef cr) {
        cr.a = 4;
        cr.b = 5;
        a = cr.a;
        b = cr.b;
        System.out.println("Result: " + (a * b));
    }
}
