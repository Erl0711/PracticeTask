package org.PracticeTasks;

public class TestTask {
    public static void main(String[] args) {
        System.out.println(makeAbba("Salam", "Karakol"));
    }


    public static String makeAbba(String a, String b) {
        return a + b +b + a;
    }
}