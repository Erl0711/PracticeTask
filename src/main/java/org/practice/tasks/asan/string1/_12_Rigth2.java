package org.practice.tasks.asan.string1;

public class _12_Rigth2 {
    /*
    Given a string, return a "rotated right 2" version
    where the last 2 chars are moved to the start.
    The string length will be at least 2.
     */
    public static String right2(String str) {
        return str.length() > 2 ? str.substring(str.length() - 2) + str.substring(0, str.length() - 2) : str;
    }
}
