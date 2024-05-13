package org.practice.tasks.AsanC.warmup2;

public class _1_StringTimes {
    /*
    Given a string and a non-negative int n,
    return a larger string that is n copies of the original string.
    */
    public static String stringTimes(String str, int n) {
        String temp = "";
        for (int i = 0; i < n; i++) {
            temp += str;
        }
        return temp;
    }
}
