package org.practice.tasks.AsanC.warmup1;

public class _22_MixStart {
    /*
    Return true if the given string begins with "mix",
    except the 'm' can be anything, so "pix", "9ix" .. all count.
     */
    public static boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1, 3).equals("ix");
    }
}
