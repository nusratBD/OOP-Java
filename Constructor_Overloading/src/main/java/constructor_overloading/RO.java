//Returning Object
package constructor_overloading;
public class RO {
    int a, b;
    RO(int i, int j){
        a=i;
        b=j;
    }
    RO test(){
    RO obj1=new RO(a+10, a+20);
    return obj1;
    }
}
