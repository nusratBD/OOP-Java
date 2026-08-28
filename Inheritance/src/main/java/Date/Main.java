package Date;
public class Main {
    public static void main(String [] args){
        Email e=new Email();
        e.to=new String[2];
        e.to[0]="I";
        e.to[1]="You";
        String[] r=e.getTo();
        for(int i=0; i<r.length; i++){
            System.out.println(r[i]);}
    }
}
