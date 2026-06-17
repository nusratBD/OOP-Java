package array;

public class Array {

    public static void main(String[] args) {
//-----------------------Array Length----------------------
//        int a1[]=new int[10];
//        int a2[]={1,2,3,4,5,6,7,8,9};
//        int a3[]={1,2,34};
//        System.out.println("Length of a1: "+a1.length);
//        System.out.println("Length of a2: "+a2.length);
//        System.out.println("Length of a3: "+a3.length);
//-----------------------Stack---------------------
//          Stack s=new Stack(5);
//          s.push(10);
//          s.push(20);
//          s.push(30);
//          s.push(40);
//          s.push(50);
//          s.push(60);
//          s.push(70);
//          s.pop();
//          s.pop();
//          s.pop();
//          s.pop();
//          s.pop();
//          s.pop();
//          s.pop();
//        Stack2 s2 = new Stack2(5);
//        s2.push(10);
//        s2.push(20);
//        s2.push(30);
//        s2.push(40);
//        s2.push(50);
//        s2.push(60);
//        System.out.println(s2.pop());
//        System.out.println(s2.pop());
//        System.out.println(s2.pop());
//        System.out.println(s2.pop());
//        System.out.println(s2.pop());
//        System.out.println(s2.pop());
//        System.out.println(s2.pop());
          Stack3 s3=new Stack3(5);
          Stack3 s4=new Stack3(8);
          for(int i=0; i<5; i++){
          s3.push(i);
          }
          System.out.println("--------------------------");
          for(int i=0; i<5; i++){
          s3.pop();
          }
          System.out.println("-------------------------");
          for(int i=0; i<8; i++){
          s4.push(i);
          }
          System.out.println("-----------------------");
          for(int i=0; i<8; i++){
          s4.pop();
          }
    }
}
