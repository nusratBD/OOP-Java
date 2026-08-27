package Multilevel_Inheritance;

public class Main {
    public static void main(String [] args){
        //Multilevel Inheritance
        GrandChild gc=new GrandChild();
        System.out.println("My name is "+gc.Mname);
        System.out.println("My father's name is: "+gc.Fname);
        System.out.println("My grandpa's name is: "+gc.Gname);
    }
}
