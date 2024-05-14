package org.practice.tasks.asan.warmup1;

public class _4_Diff21 {
    public static void main(String[] args) {
         /*Given an int n, return the absolute difference between n and 21,
         except return double the absolute difference if n is over 21.
         */
        System.out.println(diff21(22));
    }

    public static int diff21(int n) {
//        if (21 < n) {
//            return 2 * (n - 21);
//        }
//        return 21 - n;
//    }
        return (n > 21) ? 2 * (n - 21) : 21 - n;
    }
}
