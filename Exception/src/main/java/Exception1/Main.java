package Exception1;
public class Main {
    public static void main(String [] args) throws NegNumException{
    try{
    int n=Integer.parseInt(args[0]);
    if(n<0){
    throw new NegNumException("Negative Number.");
    }
    }
    catch(NegNumException e){
            System.out.println(e.getMessage());}
    }
    }

