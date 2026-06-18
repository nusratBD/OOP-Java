package nested_class;
public class Nested_Class {

    public static void main(String[] args) {
        //Access of Non-static class
        A a=new A();
        a.test();
        a.test2();
        //Access of Static class
        A.D.displayD();
        Scope s=new Scope();
        s.display();
    }
}
