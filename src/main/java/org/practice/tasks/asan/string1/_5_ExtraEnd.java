package org.practice.tasks.AsanC.string1;

public class _5_ExtraEnd {
    public static void main(String[] args) {
        /*
        Given a string, return a new string made of 3 copies of
        the last 2 chars of the original string. The string length will be at least 2.
         */
        System.out.println(extraEnd("Hello"));
    }

    public static String extraEnd(String str) {
        String res = str.substring(str.length() - 2);
        return res + res + res;
    }
}
