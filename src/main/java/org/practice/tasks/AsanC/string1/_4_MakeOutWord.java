package org.practice.tasks.AsanC.string1;

public class _4_MakeOutWord {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>","Asan"));
    }
    public static String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2);
    }
}
