package org.practice.tasks.AsanC.warmup1;

public class _24_Close10 {
    /*
    Given 2 int values, return whichever value is nearest
    to the value 10, or return 0 in the event of a tie.
    Note that Math.abs(n) returns the absolute value of a number.
    */
    public static int close10(int a, int b) {
        return Math.abs(10 - a) < Math.abs(10 - b) ? a : Math.abs(10 - a) == Math.abs(10 - b) ? 0 : b;
    }
}
