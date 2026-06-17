package com.mycompany.java_ref_book_code;

public class For_Variation {

    For_Variation() {
        int i = 0;
        boolean done = false;
        for (; !done;) {
            System.out.println("i is: " + i);
            if (i == 10) {
                done = true;
            }
            i++;
        }
        outer:
        for (int j = 0; j < 3; j++) {
            inner:
            for (int k = 0; k < 100; k++) {
                if (k == 10) {
                    break outer;
                } else {
                    System.out.println("k=" + k);
                }
            }
            System.out.println("======================");
        }
    }
}
