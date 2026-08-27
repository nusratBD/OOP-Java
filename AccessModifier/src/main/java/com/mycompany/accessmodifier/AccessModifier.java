
package com.mycompany.accessmodifier;

import Package2.New1;

/**
 *
 * @author User
 */
public class AccessModifier {

    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.display();
        Test2 t2=new Test2();
        t2.display();
        New1 n1=new New1();
        n1.display();
    }
}
