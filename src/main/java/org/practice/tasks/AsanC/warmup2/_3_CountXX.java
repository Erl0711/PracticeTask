package org.practice.tasks.AsanC.warmup2;

public class _3_CountXX {
    /*
    Count the number of "xx" in the given string.
    We'll say that overlapping is allowed, so "xxx" contains 2 "xx"
     */
    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++)
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                count++;
            }
        return count;
    }

}
