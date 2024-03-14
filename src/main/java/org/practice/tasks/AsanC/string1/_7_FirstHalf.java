package org.practice.tasks.AsanC.string1;

public class _7_FirstHalf {
    public static void main(String[] args) {
        /*

Given a string of even length, return the first half.
 So the string "WooHoo" yields "Woo".
         */
        System.out.println(firstHalf(""));
    }

    public static String firstHalf(String str) {
        //if(str.length() % 2 == 0){
        if (str.length() >= 2) {
            int res = str.length() / 2;
            return str.substring(0, res);
        }
        return str;
    }
}
