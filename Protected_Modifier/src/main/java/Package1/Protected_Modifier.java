
package Package1;

import Test2.Test2;

public class Protected_Modifier {

    public static void main(String[] args) {
        Test1 t1=new Test1();
        System.out.println(t1.name);
        Test2 t2=new Test2();
        t2.display();
    }
}
