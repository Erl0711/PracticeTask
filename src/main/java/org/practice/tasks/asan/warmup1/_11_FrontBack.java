package org.practice.tasks.asan.warmup1;

public class _11_FrontBack {
        /*
        Given a string, return a new string
        where the first and last chars have been exchanged.
         */
        public static String frontBack(String str) {
        if (str.length() >= 2) {
            String a = str.substring(0, 1);
            String b = str.substring(str.length() - 1);
            return b + str.substring(1, str.length() - 1) + a;
        }
        return str;
    }
}
