package org.practice.tasks.AsanC.string1;

public class _11_Left2 {
    /*
    Given a string, return a "rotated left 2" version where
    the first 2 chars are moved to the end.
    The string length will be at least 2.
     */
    public static String left2(String str) {
        return str.substring(2) + str.substring(0,2);
    }
}
