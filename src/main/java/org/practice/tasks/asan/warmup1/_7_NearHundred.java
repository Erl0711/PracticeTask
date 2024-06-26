package org.practice.tasks.asan.warmup1;

public class _7_NearHundred {
    public static void main(String[] args) {
        /*
        Given an int n,
        return true if it is within 10 of 100 or 200.
        Note: Math.abs(num) computes the absolute value of a number.
         */
        System.out.println(nearHundred(93)); //true
    }

    public static boolean nearHundred(int n) {
        if (n >= 90 && n <= 110 || n >= 190 && n <= 210) {
            return true;
        }
        return false;
    }
}
