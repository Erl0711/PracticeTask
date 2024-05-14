package org.practice.tasks.asan.warmup1;

public class _21_DelDel {
    /*
    Given a string, if the string "del" appears starting at index 1,
    return a string where that "del" has been deleted.
     Otherwise, return the string unchanged.
     */

    public static String delDel(String str) {
        return str.length() > 3 && str.substring(1, 4).equals("del") ? str.substring(0, 1) + str.substring(4) : str;
    }
}
