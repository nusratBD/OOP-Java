
package com.mycompany.exception_handling;
public class Exception_Handling {

    public static void main(String[] args) {
        try{
            Coordinate c1 = new Coordinate(1,2,3);
            Coordinate c2 = new Coordinate(1,2,3);
            Coordinate result1=c2.add_coordinates(c1);
            result1.display();
            Coordinate c3 = new Coordinate(1,2,3);
            Coordinate c4 = new Coordinate(-1,-2,-3);
            Coordinate result2=c4.add_coordinates(c3);
            
            result2.display();
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
