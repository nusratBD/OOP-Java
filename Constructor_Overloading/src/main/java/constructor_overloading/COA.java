//COA
package constructor_overloading;
public class COA {
    int height, width, depth;
    COA(int h,int w,int d){
    this.height=h;
    this.width=w;
    this.depth=d;
    }
    COA(COA c){
    this.height=c.height;
    this.width=c.width;
    this.depth=c.depth;
    }
    int display(){
        return height*width*depth;
    }
}
