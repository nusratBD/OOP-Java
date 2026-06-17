package constructor_overloading;
public class Object_Argument {
    int a,b;
    Object_Argument(int a, int b){
        this.a=a;
        this.b=b;
    }
    boolean check(Object_Argument oa){
        if(oa.a==a) return true;
        else return false;
    }
}
