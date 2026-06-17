package constructor_overloading;
public class Recursion3 {
    int values[];
    Recursion3(int i){
    values=new int[i];
   }
   void arrayDisplay(int i){
       System.out.println("Input: "+i);
   if(i==0) return;
   arrayDisplay(i-1);
       System.out.println("values["+(i-1)+"]="+values[i-1]);
   }
}
