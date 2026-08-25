package com.mycompany.exception_handle2;
public class Exception_Handle2 {

    public static void main(String[] args) {
        try{
        Coordinate c1=new Coordinate(1,2,3);
        Coordinate c2=new Coordinate(2,3,4);
        Coordinate result=c2.add_coordinates(c1);
        result.display();
        Coordinate c3=new Coordinate(1,2,3);
        Coordinate c4=new Coordinate(-1,-2,-3);
        Coordinate result2=c4.add_coordinates(c3);
        result2.display();
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
