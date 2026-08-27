package Exception2;
public class Main {
    public static void main(String [] args){
    try{
    int n=-5;
    Argument a = new Argument("");
    a.checkNeg(n);
    }
    catch(Argument e){
        System.out.println("Exception: "+e.getMessage());
    }
    }
}
