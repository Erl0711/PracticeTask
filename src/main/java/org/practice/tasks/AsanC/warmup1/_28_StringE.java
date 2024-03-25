package org.practice.tasks.AsanC.warmup1;

public class _28_StringE {
    /*
    Return true if the given string contains between 1 and 3 'e' chars.
     */
    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return count >= 1 && count <= 3;
    }
}
