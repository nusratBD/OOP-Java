package constructor_overloading;
public class Box {
    double height, width, depth;
    Box(double height, double width, double depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }
    Box(){
    height=5;
    width=3;
    depth=2;
    }
    Box(double len){
    height=width=depth=len;
    }
    double volume(){
    return height*width*depth;
    }
}
