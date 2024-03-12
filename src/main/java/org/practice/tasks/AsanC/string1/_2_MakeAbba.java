package org.practice.tasks.AsanC.string1;

public class _2_MakeAbba {
    public static void main(String[] args) {
        System.out.println(makeAbba("Asan ", "Aydana "));
    }
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
