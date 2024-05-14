package org.practice.tasks.asan.warmup1;

public class _25_StartOz {
    /*
    Given a string, return a string made of
    first 2 chars (if present), however include
    first char only if it is 'o' and include
    the second only if it is 'z', so "ozymandias" yields "oz".
     */
    public static String startOz(String str) {
        return (str.length() > 0 && str.charAt(0) == 'o' ? "o" : "")
                + (str.length() > 1 && str.charAt(1) == 'z' ? "z" : "");
    }
}
