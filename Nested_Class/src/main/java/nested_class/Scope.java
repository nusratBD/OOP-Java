package nested_class;

public class Scope {
    int x=10;
    void display(){
    for(int i=0; i<10; i++){
    class Inner{
    void display(){
        System.out.println("i="+x);
    }
    }
    Inner inner=new Inner();
    inner.display();
    }
    }
}
