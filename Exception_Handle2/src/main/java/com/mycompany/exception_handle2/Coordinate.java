package com.mycompany.exception_handle2;
public class Coordinate {
    int x,y,z;
    Coordinate(int x, int y, int z){
    this.x=x;
    this.y=y;
    this.z=z;
    }
    Coordinate add_coordinates(Coordinate c) throws Exception{
        int x1=this.x+c.x;
        int y1=this.y+c.y;
        int z1=this.z+c.z;
        if(x1==0 && y1==0 && z1==0){
        throw new Exception("The coordinate can not be (0,0,0)");
        }
    return new Coordinate(x1,y1,z1);
    }
    void display(){
        System.out.println("("+x+","+y+","+z+")");
    }
}
