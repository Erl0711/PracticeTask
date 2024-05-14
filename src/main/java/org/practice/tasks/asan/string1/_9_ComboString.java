package org.practice.tasks.asan.string1;

public class _9_ComboString {
    public static void main(String[] args) {
        /*
        Given 2 strings, a and b, return a string of the form short+long+short,
        with the shorter string on the outside and the longer string on the inside.
        The strings will not be the same length, but they may be empty (length 0).
         */
        System.out.println(comboString("Hello", "hi")); // hiHellohi
    }

    public static String comboString(String a, String b) {
        return a.length() > b.length() ? b + a + b : a + b + a;
    }
}
