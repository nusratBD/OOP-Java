package com.mycompany.abstarctclass;

public class AbstarctClass {

    public static void main(String[] args) {
        Circle c = new Circle(7);
        Triangle t = new Triangle(5,3);
        Rectangle r = new Rectangle(5,6);
        c.area();
        t.area();
        r.area();
    }
}
