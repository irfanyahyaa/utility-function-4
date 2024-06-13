package com.irfan;

public class Rusak {
    static int result;

    public static void rusak(int n) {
        if (n == 0) {
//            System.out.println(result); // simpled result
            return;
        }

        for (int i = 0 ; i < n ; i++) {
            result++;
            System.out.println("Hello");
//            System.out.println(result); // detailed result
        }

        rusak((int)n/2);
    }
}
