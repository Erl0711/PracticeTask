package org.practice.tasks.asan.warmup1;

public class _29_LastDigit {
    /*
    Given two non-negative int values,
    return true if they have the same last digit,
    such as with 27 and 57. Note that the % "mod" operator
    computes remainders, so 17 % 10 is 7.
    */
    public static boolean lastDigit(int a, int b) {
        return ((a % 10 == b) || (b % 10 == a)) ? true : false;
    }
}
