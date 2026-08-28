package Polymorphism;
public class Apple extends Fruit{
    @Override
    void eat(){
        System.out.println("Name: "+name);
        System.out.println("Taste: "+taste);
    }
}
