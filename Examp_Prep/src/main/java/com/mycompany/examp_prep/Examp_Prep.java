package com.mycompany.examp_prep;

public class Examp_Prep {

    public static void main(String[] args) {
        //Type Casting
        //01. Widening Casting:
        /*int x=10;
        double y=x;
        System.out.println(y);//Automatic
*/
        //02. Narrowing Casting
       /* double x2=10.5;
        int y2=(int)x2;
        System.out.println(y2);
*/
       //Static & Non-static nested class
//       staticClass.Inner1 a=new staticClass.Inner1();
//       staticClass b = new staticClass();
//       staticClass.Inner2 d = b.new Inner2();
//       d.inner2();
//       //Static Method
//       staticClass.display();
//       staticClass w=new staticClass();
//       w.display2();
//       staticClass y=new staticClass();
//       y.display2();
//      Coordinate System with Exception
        try{
        Coordinate c1 = new Coordinate(1,2,3);
        Coordinate c2 = new Coordinate(-1,-2,-3);
        Coordinate result=c2.add_coordinate(c1);
        result.display();
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
