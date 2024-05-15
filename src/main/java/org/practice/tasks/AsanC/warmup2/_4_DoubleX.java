package org.practice.tasks.AsanC.warmup2;

public class _4_DoubleX {
    public static boolean doubleX(String str) {
        /*
        Given a string, return true if the first instance of "x"
        in the string is immediately followed by another "x".
         */
        int firstIndex = str.indexOf('x');
        if (firstIndex + 1 < str.length() && str.charAt(firstIndex + 1) == 'x') {
            return true;
        }
        return false;
    }
}
