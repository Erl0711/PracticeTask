package org.practice.tasks.Gulaiym.Tex_Zadachi;

public class putFront {
    /* Написать функцию, которая принимает на вход строку, а возвращает эту строку «задом наперед»*/
    /* Вариант со String*/
    public static String revStr(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    /* Вариант StringBuilder */
    public static String revStr2(String str) {
        StringBuilder reversed2 = new StringBuilder(str);
        return reversed2.reverse().toString();
    }
}
