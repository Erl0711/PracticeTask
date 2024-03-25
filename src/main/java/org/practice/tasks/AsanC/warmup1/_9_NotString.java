package org.practice.tasks.AsanC.warmup1;

public class _9_NotString {
        /*
        Given a string, return a new string
        where "not " has been added to the front.
        However, if the string already begins with "not",
         return the string unchanged.
         Note: use .equals() to compare 2 strings.
         */
        public static String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        return "not " + str;
    }
}
