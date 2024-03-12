package org.practice.tasks.AsanC.string1;

public class _5_ExtraEnd {
    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
    }
    public static String extraEnd(String str) {
        String res = str.substring(str.length()-2);
        return res + res + res;
    }
}
