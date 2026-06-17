package com.mycompany.java_ref_book_code;

public class Prime2 {

    Prime2() {
        for (int i = 1; i < 50; i++) {
            int flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
