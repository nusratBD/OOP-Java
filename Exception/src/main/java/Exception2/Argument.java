package Exception2;
public class Argument extends Exception{
    Argument(String s){
    super(s);
    }
    void checkNeg(int n) throws Argument{
    if(n<0){
    throw new Argument("Negative number is not allowed");
    }
        System.out.println("Number: "+n);
    }
}
