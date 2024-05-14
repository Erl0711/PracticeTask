package org.practice.tasks.AsanC.warmup1;

public class _30_EndUp {
    /*
    Given a string, return a new string where
    the last 3 chars are now in upper case.
    If the string has less than 3 chars,
    uppercase whatever is there. Note that str.toUpperCase()
    returns the uppercase version of a string.
     */
    public static String endUp(String str) {
        if (str.length() >= 3) {
            String res = str.substring(str.length() - 3).toUpperCase();
            String res1 = str.substring(0, str.length() - 3);
            return res1 + res;
        }
        return str.toUpperCase();
    }
}
