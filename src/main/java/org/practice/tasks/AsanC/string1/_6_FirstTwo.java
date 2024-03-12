package org.practice.tasks.AsanC.string1;

public class _6_FirstTwo {
    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));
    }
    public static String firstTwo(String str) {
        if(str.length() >= 2){
            String res = str.substring(0,2);
            return res;
        }return str;
    }
}
