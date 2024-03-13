package org.practice.tasks.AsanC.string1;

public class _2_MakeAbba {
    public static void main(String[] args) {
        /*Given two strings, a and b, return the result of putting them together in the order abba,
        e.g. "Hi" and "Bye" returns "HiByeByeHi".
         */
        System.out.println(makeAbba("Asan ", "Aydana "));
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
