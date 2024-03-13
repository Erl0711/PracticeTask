package org.practice.tasks.AsanC.string1;

public class _6_FirstTwo {
    public static void main(String[] args) {
        /*

Given a string, return the string made of its first two chars,
so the String "Hello" yields "He". If the string is shorter
than length 2, return whatever there is, so "X" yields "X",
and the empty string "" yields the empty string "".
Note that str.length() returns the length of a string.
         */
        System.out.println(firstTwo("Hello"));
    }

    public static String firstTwo(String str) {
        if(str.length() >= 2){
            String res = str.substring(0,2);
            return res;
        }return str;
    }
}
