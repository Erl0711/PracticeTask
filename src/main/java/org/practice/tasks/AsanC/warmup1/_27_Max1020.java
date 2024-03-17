package org.practice.tasks.AsanC.warmup1;

public class _27_Max1020 {
    /*
    Given 2 positive int values,
    return the larger value that is in the
    range 10..20 inclusive, or return 0 if neither is in that range.
     */
    public static int max1020(int a, int b) {
        int resa = (a >= 10 && a <= 20) ? a : 0;
        int resb = (b >= 10 && b <= 20) ? b : 0;
        return Math.max(resa, resb);
    }
}
