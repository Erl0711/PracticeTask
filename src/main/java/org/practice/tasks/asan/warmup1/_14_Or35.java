package org.practice.tasks.asan.warmup1;

public class _14_Or35 {
        /*
    Return true if the given non-negative
number is a multiple of 3 or a multiple of 5.
 Use the % "mod" operator
     */
        public static boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0) ? true : false;
    }
}
