package org.practice.tasks.asan.warmup1;

public class _13_BackAround {
        /*
        Given a string, take the last char and return
        a new string with the last char added at
        the front and back, so "cat" yields "tcatt".
        The original string will be length 1 or more.
        */
        public static String backAround(String str) {
        String res = str.substring(str.length() - 1);
        return res + str + res;
    }
}
