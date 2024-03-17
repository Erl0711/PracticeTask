package org.practice.tasks.AsanC.warmup1;

public class _22_MixStart {
    public static boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1, 3).equals("ix");
    }
}
