package com.irfan;

public class Count {
    public static void count(String s) {
        char[] chars = s.toCharArray();
        int uppers = 0;
        int lowers = 0;
        int numbers = 0;
        int symbols = 0;

        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                uppers++;
            } else if (Character.isLowerCase(c)) {
                lowers++;
            } else if (Character.isDigit(c)) {
                numbers++;
            } else if (Character.isWhitespace(c)) {
                continue;
            } else {
                symbols++;
            }
        }

        System.out.println("uppercase : " + uppers);
        System.out.println("lowercase : " + lowers);
        System.out.println("numbers : " + numbers);
        System.out.println("symbols : " + symbols);
    }
}
