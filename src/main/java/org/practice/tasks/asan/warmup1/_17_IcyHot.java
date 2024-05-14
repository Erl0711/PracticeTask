package org.practice.tasks.asan.warmup1;

public class _17_IcyHot {
    /*
    Given two temperatures, return true if one is less
     than 0 and the other is greater than 100.
     */
    public static boolean icyHot(int temp1, int temp2) {
        return (temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100) ? true : false;
    }
}
