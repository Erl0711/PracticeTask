package org.practice.tasks.asan.warmup1;

public class _8_PosNeg {
    public static void main(String[] args) {
        /*
        Given 2 int values, return true if one is negative
        and one is positive. Except if the parameter "negative" is true,
         then return true only if both are negative.
         */
        System.out.println(posNeg(1, -4, false));  // true
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (a > 0 && b < 0 && !negative || a < 0 && b > 0 && !negative || a < 0 && b < 0 && negative) {
            return true;
        }
        return false;
    }
}
