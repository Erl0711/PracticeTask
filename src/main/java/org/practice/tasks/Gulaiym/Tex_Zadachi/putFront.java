package org.practice.tasks.Gulaiym.Tex_Zadachi;

public class putFront {
    /* Написать функцию, которая принимает на вход строку, а возвращает эту строку «задом наперед»*/
    public static String revStr(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            res.append(str.charAt(i));
        }
        return res.toString();
    }
}
