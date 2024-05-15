package org.practice.tasks.asan.warmup1;

public class _15_Front22 {
        /*
        Given a string, take the first 2 chars and return
         the string with the 2 chars added at both
         the front and back, so "kitten" yields"kikittenki".
         If the string length is less than 2, use whatever chars are there.
         */
        public static String front22(String str) {
        if (str.length() >= 2) {
            String res = str.substring(0, 2);
            return res + str + res;
        }
        return str + str + str;
    }
}
